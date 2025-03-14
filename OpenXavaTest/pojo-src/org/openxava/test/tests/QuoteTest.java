package org.openxava.test.tests;

import com.gargoylesoftware.htmlunit.html.*;


/**
 *
 * @author Javier Paniza
 */

public class QuoteTest extends EmailNotificationsTestBase {
	
	public QuoteTest(String testName) {
		super(testName, "Quote");		
	}
	
	public void testElementCollection() throws Exception {
		execute("CRUD.new");		
		setValue("year", "2015");
		setValue("number", "66");
		setValue("date", "1/1/2015"); // With 4 digits for year to test a case
		setValue("customer.number", "1");
		assertValue("customer.name", "Javi");
		
		assertCollectionRowCount("details", 0);
		execute("CRUD.save");
		assertError("It's required at least 1 element in Details of Quote");
		assertErrorsCount(1);
		
		assertEditableInCollection("details", 0, 0);
		assertNoEditableInCollection("details", 0, 1);
		assertEditableInCollection("details", 0, "unitPrice");
		assertEditableInCollection("details", 0, "quantity");
		assertNoEditableInCollection("details", 0, "amount");

		setValueInCollection("details", 0, "product.number", "1");
		assertNoErrors(); 
		assertValueInCollection("details", 0, "product.description", "MULTAS DE TRAFICO");
		assertValueInCollection("details", 0, "unitPrice", "11.00");		
		setValueInCollection("details", 0, "unitPrice", "100");
		setValueInCollection("details", 0, "quantity", "2");
		assertValueInCollection("details", 0, "amount", "200.00");  
		
		assertTotalInCollection("details", 0, "amount", "200.00");
		assertTotalInCollection("details", 1, "amount",  "21.00"); 
		assertTotalInCollection("details", 2, "amount",  "42.00");
		assertTotalInCollection("details", 3, "amount", "242.00");
		
		execute("Reference.search", "keyProperty=details.1.product.number");
		execute("ReferenceSearch.choose", "row=1");
		assertValueInCollection("details", 1, "product.number", "2");
		assertValueInCollection("details", 1, "product.description", "IBM ESERVER ISERIES 270");
		assertValueInCollection("details", 1, "unitPrice", "20.00");		
		setValueInCollection("details", 1, "unitPrice", "7000");
		setValueInCollection("details", 1, "quantity", "1");
		assertValueInCollection("details", 1, "amount", "7,000.00");
		
		assertTotalInCollection("details", 0, "amount", "7,200.00");
		assertTotalInCollection("details", 1, "amount",    "21.00"); 
		assertTotalInCollection("details", 2, "amount", "1,512.00");
		assertTotalInCollection("details", 3, "amount", "8,712.00");
		
		assertCollectionRowCount("details", 2);		
		execute("CRUD.save");
		assertMessage("Quote created successfully"); 
		assertValue("year", "");
		assertValue("number", "");
		assertValue("customer.number", "");		
		assertCollectionRowCount("details", 0);
		
		execute("Mode.list");
		execute("List.viewDetail", "row=0");		
		
		assertValue("year", "2015");
		assertValue("number", "66");
		assertValue("date", "1/1/2015"); 
		assertValue("customer.number", "1");
		
		assertCollectionRowCount("details", 2);

		assertValueInCollection("details", 0, "product.number", "1");
		assertValueInCollection("details", 0, "product.description", "MULTAS DE TRAFICO");
		assertValueInCollection("details", 0, "unitPrice", "100.00");
		assertValueInCollection("details", 0, "quantity", "2");
		assertValueInCollection("details", 0, "amount", "200.00");		
		assertValueInCollection("details", 1, "product.number", "2");
		assertValueInCollection("details", 1, "product.description", "IBM ESERVER ISERIES 270");
		assertValueInCollection("details", 1, "unitPrice", "7,000.00");
		assertValueInCollection("details", 1, "quantity", "1");
		assertValueInCollection("details", 1, "amount", "7,000.00");
		
		assertTotalInCollection("details", 0, "amount", "7,200.00");
		assertTotalInCollection("details", 1, "amount",    "21.00"); 
		assertTotalInCollection("details", 2, "amount", "1,512.00");
		assertTotalInCollection("details", 3, "amount", "8,712.00");
		
		setValueInCollection("details", 1, "quantity", "2");
		assertValueInCollection("details", 1, "amount", "14,000.00");
		
		assertTotalInCollection("details", 0, "amount", "14,200.00");
		assertTotalInCollection("details", 1, "amount",     "21.00"); 
		assertTotalInCollection("details", 2, "amount",  "2,982.00");
		assertTotalInCollection("details", 3, "amount", "17,182.00");
		
		execute("Reference.search", "keyProperty=details.0.product.number");
		execute("ReferenceSearch.choose", "row=3");
		assertValueInCollection("details", 0, "product.number", "4");		
		assertValueInCollection("details", 0, "product.description", "CUATRE");
		
		setValueInCollection("details", 2, "product.number", "3");
		setValueInCollection("details", 2, "unitPrice", "300.00");
		setValueInCollection("details", 2, "quantity", "3");
		setValueInCollection("details", 3, "product.number", "3");
		setValueInCollection("details", 3, "unitPrice", "300.00");
		setValueInCollection("details", 3, "quantity", "3");
		execute("CRUD.save");
		assertError("More than 3 items in Details of Quote are not allowed");		
		assertErrorsCount(1);
		
		execute("CRUD.new");
		setValueInCollection("details", 0, "unitPrice", "100");
		setValueInCollection("details", 0, "quantity", "2");
		assertValueInCollection("details", 0, "amount", "200.00");
		
		assertTotalInCollection("details", 0, "amount", "200.00");
		assertTotalInCollection("details", 1, "amount",  "21.00"); 
		assertTotalInCollection("details", 2, "amount",  "42.00");
		assertTotalInCollection("details", 3, "amount", "242.00");
		execute("Mode.list");
		execute("List.viewDetail", "row=0");
		assertValue("year", "2015"); 
		assertValue("number", "66");		
		
		assertRemoveActionInElementCollection(); 
		
		execute("CRUD.delete");
		assertNoErrors();
	}
	
	public void testIdInCreationMessageWhenEmptySearchKeys() throws Exception { 
		execute("CRUD.new");		
		setValue("year", "2020");
		assertValue("number", "");
		setValue("customer.number", "1");
		assertValue("customer.name", "Javi");
		setValueInCollection("details", 0, "product.number", "1");
		setValueInCollection("details", 0, "quantity", "2");
		execute("CRUD.save");
		assertMessage("Quote created successfully: 2020/77"); 
		assertValue("year", "");
		assertValue("number", "");
		assertValue("customer.number", "");		
		assertCollectionRowCount("details", 0);
		
		execute("Mode.list");
		execute("List.viewDetail", "row=0");		
		assertValue("year", "2020");
		assertValue("number", "77");
		assertCollectionRowCount("details", 1);		
		execute("CRUD.delete");
		assertNoErrors();
	}


	private void assertRemoveActionInElementCollection() throws Exception {
		// Annotated remove action on elementCollection
		changeModule("QuoteWithRemoveElementCollection"); 
		execute("CRUD.new");
		execute("Mode.list");
		execute("List.viewDetail", "row=0");
		assertValue("year", "2015");
		assertValue("number", "66");

		assertCollectionRowCount("details", 2);
		assertValueInCollection("details", 0, "product.number", "1");
		assertValueInCollection("details", 0, "product.description", "MULTAS DE TRAFICO");
		assertValueInCollection("details", 0, "unitPrice", "100.00");
		assertValueInCollection("details", 0, "quantity", "2");
		assertValueInCollection("details", 0, "amount", "200.00");		
		assertValueInCollection("details", 1, "product.number", "2");
		assertValueInCollection("details", 1, "product.description", "IBM ESERVER ISERIES 270");
		assertValueInCollection("details", 1, "unitPrice", "7,000.00");
		assertValueInCollection("details", 1, "quantity", "1");
		assertValueInCollection("details", 1, "amount", "7,000.00");		
		assertTotalInCollection("details", 0, "amount", "7,200.00");
		assertTotalInCollection("details", 1, "amount",    "21.00"); 
		assertTotalInCollection("details", 2, "amount", "1,512.00");
		assertTotalInCollection("details", 3, "amount", "8,712.00");
		
		assertAction("Quote.removeDetail", "row=0,viewObject=xava_view_section0_details"); // Important, inside a section
		execute("Quote.removeDetail", "row=0,viewObject=xava_view_section0_details");
		assertNoErrors();
		assertNoMessages();
		
		assertCollectionRowCount("details", 1);
		assertValueInCollection("details", 0, "product.number", "2");
		assertValueInCollection("details", 0, "product.description", "IBM ESERVER ISERIES 270");
		assertValueInCollection("details", 0, "unitPrice", "7,000.00");
		assertValueInCollection("details", 0, "quantity", "1");
		assertValueInCollection("details", 0, "amount", "7,000.00");		
		assertTotalInCollection("details", 0, "amount", "7,000.00");
		assertTotalInCollection("details", 1, "amount",    "21.00"); 
		assertTotalInCollection("details", 2, "amount", "1,470.00");
		assertTotalInCollection("details", 3, "amount", "8,470.00");
	}
	
	public void testDependentDefaultValueCalculatorInElementCollection_viewSetValueForElementCollection() throws Exception {   
		execute("CRUD.new");		

		setValueInCollection("details", 0, "product.number", "1");
		assertValueInCollection("details", 0, "unitPrice", "11.00");		
		setValueInCollection("details", 0, "quantity", "2");
		assertValueInCollection("details", 0, "amount", "22.00"); 
		
		assertTotalInCollection("details", 0, "amount", "22.00");
		assertTotalInCollection("details", 1, "amount", "21.00"); 
		assertTotalInCollection("details", 2, "amount",  "4.62");
		assertTotalInCollection("details", 3, "amount", "26.62");
		
		execute("Reference.search", "keyProperty=details.1.product.number");
		execute("ReferenceSearch.choose", "row=1");
		assertValueInCollection("details", 1, "product.number", "2");
		assertValueInCollection("details", 1, "unitPrice", "20.00");		
		setValueInCollection("details", 1, "quantity", "3");
		assertValueInCollection("details", 1, "amount", "60.00");
		
		assertTotalInCollection("details", 0, "amount", "82.00");
		assertTotalInCollection("details", 1, "amount", "21.00"); 
		assertTotalInCollection("details", 2, "amount", "17.22");
		assertTotalInCollection("details", 3, "amount", "99.22");

		
		setValueInCollection("details", 0, "product.number", "2");
		assertValueInCollection("details", 0, "unitPrice", "20.00");		
		assertValueInCollection("details", 0, "amount", "40.00");
		
		assertTotalInCollection("details", 0, "amount", "100.00");
		assertTotalInCollection("details", 1, "amount",  "21.00"); 
		assertTotalInCollection("details", 2, "amount",  "21.00");
		assertTotalInCollection("details", 3, "amount", "121.00");
		
		execute("Reference.search", "keyProperty=details.1.product.number");
		execute("ReferenceSearch.choose", "row=0");
		assertValueInCollection("details", 1, "product.number", "1");
		assertValueInCollection("details", 1, "unitPrice", "11.00");		
		assertValueInCollection("details", 1, "amount", "33.00");
		
		assertTotalInCollection("details", 0, "amount", "73.00");
		assertTotalInCollection("details", 1, "amount", "21.00"); 
		assertTotalInCollection("details", 2, "amount", "15.33");
		assertTotalInCollection("details", 3, "amount", "88.33");	
				
		execute("Quote.setQuantitiesToSeven");
		assertValueInCollection("details", 0, "product.number", "2");
		assertValueInCollection("details", 0, "quantity", "7");		
		assertValueInCollection("details", 1, "product.number", "1");
		assertValueInCollection("details", 1, "quantity", "7");
	}
	
	public void testElementCollectionChangeTotalProperyRecaculatesDependentPropertiesOnExistingEntity_elementCollectionRemovingRowAfterChangingReferenceInParentEntity() throws Exception { 
		// Only fails if we change the property before touching any collection value
		// and only in existing entities, not creating new ones.
		
		execute("List.viewDetail", "row=0");
		assertValue("year", "2014"); // This one ... 
		assertValue("number", "1");  // ... has 3 details
		
		assertTotalInCollection("details", 0, "amount", "162.00"); 
		assertTotalInCollection("details", 1, "amount",  "21.00"); 
		assertTotalInCollection("details", 2, "amount",  "34.02");
		assertTotalInCollection("details", 3, "amount", "196.02");
		assertValue("estimatedProfit", "19.60");
		
		setValue("taxesRate", "23"); 
		assertTotalInCollection("details", 2, "amount",  "37.26"); 
		assertTotalInCollection("details", 3, "amount", "199.26");
		assertValue("estimatedProfit", "19.93");
		
		// Removing row after changing reference in parent entity 
		assertCollectionRowCount("details", 3);
		setValue("customer.number", "2");
		removeRow(1);
		assertCollectionRowCount("details", 2);
		execute("CRUD.refresh");
		assertCollectionRowCount("details", 3); // Record is not altered
	}
	
	public void testElementCollectionGetEntity_removingRowUpdatesTotals_addingSeveralRowsAfterRemoving_referenceSearchCorrectIndexAfterRemoving_calculatedPropertiesDependingOnTotals() throws Exception {  
		execute("List.viewDetail", "row=0");
		assertValue("year", "2014"); // This one ... 
		assertValue("number", "1");  // ... has 3 details
		
		execute("Quote.showProducts");
		assertNoErrors();
		assertMessage("MULTAS DE TRAFICO, IBM ESERVER ISERIES 270, XAVA"); 
		
		assertTotalInCollection("details", 0, "amount", "162.00");
		assertTotalInCollection("details", 1, "amount",  "21.00"); 
		assertTotalInCollection("details", 2, "amount",  "34.02");
		assertTotalInCollection("details", 3, "amount", "196.02");
		assertValue("estimatedProfit", "19.60"); 
		
		removeRow(1); 
		
		assertTotalInCollection("details", 0, "amount", "102.00");
		assertTotalInCollection("details", 1, "amount",  "21.00"); 
		assertTotalInCollection("details", 2, "amount",  "21.42");
		assertTotalInCollection("details", 3, "amount", "123.42");		
		assertValue("estimatedProfit", "12.34"); 
		
		setValueInCollection("details", 1, "quantity", "5");
		assertValueInCollection("details", 1, "amount", "100.00"); 
		assertTotalInCollection("details", 0, "amount", "122.00");
		assertTotalInCollection("details", 1, "amount",  "21.00"); 
		assertTotalInCollection("details", 2, "amount",  "25.62");
		assertTotalInCollection("details", 3, "amount", "147.62");
		assertValue("estimatedProfit", "14.76"); 
		
		setValueInCollection("details", 2, "product.number", "1");
		assertValueInCollection("details", 2, "product.description", "MULTAS DE TRAFICO");
		assertNoErrors();
		setValueInCollection("details", 3, "product.number", "2");
		assertValueInCollection("details", 3, "product.description", "IBM ESERVER ISERIES 270");
		assertNoErrors();
		
		HtmlElement row1 = getHtmlPage().getHtmlElementById("ox_OpenXavaTest_Quote__details___1");
		HtmlElement input = row1.getElementsByTagName("input").get(1);
		assertEquals("ox_OpenXavaTest_Quote__details___1___product___number", input.getAttribute("id"));
		HtmlElement searchActionLink = row1.getElementsByTagName("a").get(1);
		assertEquals("javascript:openxava.executeAction('OpenXavaTest', 'Quote', '', false, 'Reference.search', 'keyProperty=details.1.product.number')", searchActionLink.getAttribute("href"));
	}
	
	private void removeRow(int row) throws Exception { 
		HtmlElement rowElement = getHtmlPage().getHtmlElementById("ox_OpenXavaTest_Quote__details___" + row); 
		HtmlElement removeIcon = rowElement.getElementsByTagName("a").get(0).getElementsByTagName("i").get(0);  
		removeIcon.click();		
		getWebClient().waitForBackgroundJavaScriptStartingBefore(10000);
	}

	public void testEmailNotificationsInElementCollections_numberAndDateFormatInEmailNotifications() throws Exception { 
		subscribeToEmailNotifications();
		
		execute("List.viewDetail", "row=0");
		assertValue("year", "2014");   
		assertValue("number", "1");  		
		execute("CRUD.save");
		assertNoErrors();
		assertEmailNotifications();
		
		execute("Mode.list");
		execute("List.viewDetail", "row=0");
		assertValue("year", "2014");  
		assertValue("number", "1");
		assertValue("date", "10/1/2014");
		setValue("date", "10/2/14");
		setValueInCollection("details", 2, "product.number", "4");
		assertValueInCollection("details", 2, "product.description", "CUATRE");
		assertValueInCollection("details", 2, "unitPrice", "555.00");
		assertValueInCollection("details", 2, "amount", "2,220.00"); 
		execute("CRUD.save");
		
		execute("Mode.list");
		execute("List.viewDetail", "row=0");
		assertValue("year", "2014");  
		assertValue("number", "1");
		assertValue("date", "10/2/2014");
		setValue("date", "10/1/14");
		removeRow(2);
		execute("CRUD.save");
		
		execute("Mode.list");
		execute("List.viewDetail", "row=0");
		assertValue("year", "2014");  
		assertValue("number", "1");
		assertValue("date", "10/1/2014");
		assertCollectionRowCount("details", 2);
		setValueInCollection("details", 2, "product.number", "3");
		setValueInCollection("details", 2, "unitPrice", "20");
		setValueInCollection("details", 2, "quantity", "4");
		assertValueInCollection("details", 2, "amount", "80.00");
		execute("CRUD.save");

		assertEmailNotifications( 
			"MODIFIED: email=openxavatest1@getnada.com, user=admin, application=OpenXavaTest, module=Quote, permalink=http://localhost:8080" + getContextPath() + "modules/Quote?detail=ff80808248cacebc0148cad202ad0000, changes=<ul><li data-property='date'><b>Date</b>: 10/1/14 --> 10/2/14</li><li data-property='details.3.product.description'><b>Description of product of 3 of details</b>: XAVA --> CUATRE</li><li data-property='details.3.product.number'><b>Number of product of 3 of details</b>: 3 --> 4</li><li data-property='details.3.unitPrice'><b>Unit price of 3 of details</b>: 20 --> 555</li><li data-property='details.3.amount'><b>Amount of 3 of details</b>: 80 --> 2,220</li></ul>",
			"MODIFIED: email=openxavatest1@getnada.com, user=admin, application=OpenXavaTest, module=Quote, permalink=http://localhost:8080" + getContextPath() + "modules/Quote?detail=ff80808248cacebc0148cad202ad0000, changes=<ul><li data-property='date'><b>Date</b>: 10/2/14 --> 10/1/14</li><li data-property='details.3.product.description'><b>Description of product of 3 of details</b>: CUATRE --> </li><li data-property='details.3.product.number'><b>Number of product of 3 of details</b>: 4 --> </li><li data-property='details.3.quantity'><b>Quantity of 3 of details</b>: 4 --> </li><li data-property='details.3.unitPrice'><b>Unit price of 3 of details</b>: 555 --> </li><li data-property='details.3.amount'><b>Amount of 3 of details</b>: 2,220 --> </li></ul>",
			"MODIFIED: email=openxavatest1@getnada.com, user=admin, application=OpenXavaTest, module=Quote, permalink=http://localhost:8080" + getContextPath() + "modules/Quote?detail=ff80808248cacebc0148cad202ad0000, changes=<ul><li data-property='details.3.product.description'><b>Description of product of 3 of details</b>:  --> XAVA</li><li data-property='details.3.product.number'><b>Number of product of 3 of details</b>:  --> 3</li><li data-property='details.3.quantity'><b>Quantity of 3 of details</b>:  --> 4</li><li data-property='details.3.unitPrice'><b>Unit price of 3 of details</b>:  --> 20</li><li data-property='details.3.amount'><b>Amount of 3 of details</b>:  --> 80</li></ul>"
		);		
	}
					
}
