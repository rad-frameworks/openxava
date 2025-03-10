
// File generated by OpenXava: Fri Feb 04 12:23:42 CET 2022
// Archivo generado por OpenXava: Fri Feb 04 12:23:42 CET 2022

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Invoice		Entity/Entidad

package org.openxava.test.model;

import java.util.*;
import java.math.*;
import java.rmi.RemoteException;
import org.openxava.component.MetaComponent;
import org.openxava.model.meta.MetaModel;
import org.openxava.util.*;

/**
 * 
 * @author MCarmen Gimeno
 */
public class Invoice implements java.io.Serializable, org.openxava.test.model.IInvoice {	

	// Constructor
	public Invoice() {
		initMembers();
	} 

	private void initMembers() { 
		setYear(0); 
		setNumber(0); 
		setDate(null); 
		setVatPercentage(null); 
		setComment(null); 
		setPaid(false); 	
	} 
	
	// Properties/Propiedades 
	private static org.openxava.converters.IConverter dateConverter;
	private org.openxava.converters.IConverter getDateConverter() {
		if (dateConverter == null) {
			try {
				dateConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("date");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "date"));
			}
			
		}	
		return dateConverter;
	} 
	private java.sql.Date date;
	private java.sql.Date get_Date() {
		return date;
	}
	private void set_Date(java.sql.Date newDate) {
		this.date = newDate;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.util.Date getDate() {
		try {
			return (java.util.Date) getDateConverter().toJava(get_Date());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Date", "Invoice", "java.util.Date"));
		}
	}
	
	/**
	 * 
	 */
	public void setDate(java.util.Date newDate) {
		try { 
			set_Date((java.sql.Date) getDateConverter().toDB(newDate));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Date", "Invoice", "java.util.Date"));
		}		
	} 
	private int year;
	public int getYear() {
		return year;
	}
	public void setYear(int newYear) {
		this.year = newYear;
	} 	
	/**
	 * 
	 * 
	 */
	public String getImportance() { 		
		try {			
			org.openxava.test.calculators.ImportanceCalculator importanceCalculator= (org.openxava.test.calculators.ImportanceCalculator)
				getMetaModel().getMetaProperty("importance").getMetaCalculator().createCalculator();  	
			
			importanceCalculator.setAmount(getAmountsSum()); 
			return (String) importanceCalculator.calculate();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references 
			return null; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "Importance", "Invoice", ex.getLocalizedMessage()));
		} 		
	}
	public void setImportance(String newImportance) {
		// for it is in value object
		// para que aparezca en los value objects
	} 	
	/**
	 * 
	 * 
	 */
	public java.math.BigDecimal getVat() { 		
		try {			
			org.openxava.test.calculators.PercentageCalculator vatCalculator= (org.openxava.test.calculators.PercentageCalculator)
				getMetaModel().getMetaProperty("vat").getMetaCalculator().createCalculator();  	
			
			vatCalculator.setPercentage(getVatPercentage());  	
			
			vatCalculator.setValue(getAmountsSum()); 
			return (java.math.BigDecimal) vatCalculator.calculate();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references 
			return null; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "Vat", "Invoice", ex.getLocalizedMessage()));
		} 		
	}
	public void setVat(java.math.BigDecimal newVat) {
		// for it is in value object
		// para que aparezca en los value objects
	} 	
	/**
	 * 
	 * 
	 */
	public java.math.BigDecimal getAmountsSum() { 		
		try {			
			org.openxava.test.calculators.AmountsSumCalculator amountsSumCalculator= (org.openxava.test.calculators.AmountsSumCalculator)
				getMetaModel().getMetaProperty("amountsSum").getMetaCalculator().createCalculator(); 
				amountsSumCalculator.setModel(this); 
			return (java.math.BigDecimal) amountsSumCalculator.calculate();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references 
			return null; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "AmountsSum", "Invoice", ex.getLocalizedMessage()));
		} 		
	}
	public void setAmountsSum(java.math.BigDecimal newAmountsSum) {
		// for it is in value object
		// para que aparezca en los value objects
	} 
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int newNumber) {
		this.number = newNumber;
	} 	
	/**
	 * 
	 * 
	 */
	public java.math.BigDecimal getProductUnitPriceSum() { 		
		try {			
			org.openxava.test.calculators.InvoiceProductUnitPriceSumCalculator productUnitPriceSumCalculator= (org.openxava.test.calculators.InvoiceProductUnitPriceSumCalculator)
				getMetaModel().getMetaProperty("productUnitPriceSum").getMetaCalculator().createCalculator(); 
				productUnitPriceSumCalculator.setModel(this); 
			return (java.math.BigDecimal) productUnitPriceSumCalculator.calculate();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references 
			return null; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "ProductUnitPriceSum", "Invoice", ex.getLocalizedMessage()));
		} 		
	}
	public void setProductUnitPriceSum(java.math.BigDecimal newProductUnitPriceSum) {
		// for it is in value object
		// para que aparezca en los value objects
	} 	
	/**
	 * 
	 * 
	 */
	public java.math.BigDecimal getCustomerDiscount() { 		
		try {			
			org.openxava.test.calculators.CustomerInvoiceDiscountCalculator customerDiscountCalculator= (org.openxava.test.calculators.CustomerInvoiceDiscountCalculator)
				getMetaModel().getMetaProperty("customerDiscount").getMetaCalculator().createCalculator();  	
			
			customerDiscountCalculator.setNumber(getCustomer().getNumber());  	
			
			customerDiscountCalculator.setPaid(isPaid()); 
			return (java.math.BigDecimal) customerDiscountCalculator.calculate();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references 
			return null; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "CustomerDiscount", "Invoice", ex.getLocalizedMessage()));
		} 		
	}
	public void setCustomerDiscount(java.math.BigDecimal newCustomerDiscount) {
		// for it is in value object
		// para que aparezca en los value objects
	} 	
	/**
	 * 
	 * 
	 */
	public java.math.BigDecimal getTotal() { 		
		try {			
			org.openxava.test.calculators.TotalInvoiceCalculator totalCalculator= (org.openxava.test.calculators.TotalInvoiceCalculator)
				getMetaModel().getMetaProperty("total").getMetaCalculator().createCalculator();  	
			
			totalCalculator.setVat(getVat());  	
			
			totalCalculator.setAmountsSum(getAmountsSum()); 
			return (java.math.BigDecimal) totalCalculator.calculate();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references 
			return null; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "Total", "Invoice", ex.getLocalizedMessage()));
		} 		
	}
	public void setTotal(java.math.BigDecimal newTotal) {
		// for it is in value object
		// para que aparezca en los value objects
	} 	
	/**
	 * 
	 * 
	 */
	public boolean isConsiderable() { 		
		try {			
			org.openxava.test.calculators.ConsiderableCalculator considerableCalculator= (org.openxava.test.calculators.ConsiderableCalculator)
				getMetaModel().getMetaProperty("considerable").getMetaCalculator().createCalculator();  	
			
			considerableCalculator.setAmount(getAmountsSum()); 
			return ((Boolean) considerableCalculator.calculate()).booleanValue();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references
			return false; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "Considerable", "Invoice", ex.getLocalizedMessage()));
		} 		
	}
	public void setConsiderable(boolean newConsiderable) {
		// for it is in value object
		// para que aparezca en los value objects
	} 
	private static org.openxava.converters.IConverter vatPercentageConverter;
	private org.openxava.converters.IConverter getVatPercentageConverter() {
		if (vatPercentageConverter == null) {
			try {
				vatPercentageConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("vatPercentage");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "vatPercentage"));
			}
			
		}	
		return vatPercentageConverter;
	} 
	private java.math.BigDecimal vatPercentage;
	private java.math.BigDecimal get_VatPercentage() {
		return vatPercentage;
	}
	private void set_VatPercentage(java.math.BigDecimal newVatPercentage) {
		this.vatPercentage = newVatPercentage;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.math.BigDecimal getVatPercentage() {
		try {
			return (java.math.BigDecimal) getVatPercentageConverter().toJava(get_VatPercentage());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "VatPercentage", "Invoice", "java.math.BigDecimal"));
		}
	}
	
	/**
	 * 
	 */
	public void setVatPercentage(java.math.BigDecimal newVatPercentage) {
		try { 
			set_VatPercentage((java.math.BigDecimal) getVatPercentageConverter().toDB(newVatPercentage));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "VatPercentage", "Invoice", "java.math.BigDecimal"));
		}		
	} 	
	/**
	 * 
	 * 
	 */
	public java.math.BigDecimal getSellerDiscount() { 		
		try {			
			org.openxava.test.calculators.SellerInvoiceDiscountCalculator sellerDiscountCalculator= (org.openxava.test.calculators.SellerInvoiceDiscountCalculator)
				getMetaModel().getMetaProperty("sellerDiscount").getMetaCalculator().createCalculator();  	
			
			sellerDiscountCalculator.setSellerNumber(getCustomer().getSeller().getNumber()); 
			return (java.math.BigDecimal) sellerDiscountCalculator.calculate();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references 
			return null; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "SellerDiscount", "Invoice", ex.getLocalizedMessage()));
		} 		
	}
	public void setSellerDiscount(java.math.BigDecimal newSellerDiscount) {
		// for it is in value object
		// para que aparezca en los value objects
	} 
	private static org.openxava.converters.IConverter paidConverter;
	private org.openxava.converters.IConverter getPaidConverter() {
		if (paidConverter == null) {
			try {
				paidConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("paid");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "paid"));
			}
			
		}	
		return paidConverter;
	} 
	private java.lang.String paid;
	private java.lang.String get_Paid() {
		return paid;
	}
	private void set_Paid(java.lang.String newPaid) {
		this.paid = newPaid;
	} 	
	
	/**
	 * 
	 * 
	 */
	public boolean isPaid() {
		try {
			return ((Boolean) getPaidConverter().toJava(get_Paid())).booleanValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Paid", "Invoice", "boolean"));
		}
	}
	
	/**
	 * 
	 */
	public void setPaid(boolean newPaid) {
		try { 
			set_Paid((java.lang.String) getPaidConverter().toDB(new Boolean(newPaid)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Paid", "Invoice", "boolean"));
		}		
	} 	
	/**
	 * 
	 * 
	 */
	public java.math.BigDecimal getCustomerTypeDiscount() { 		
		try {			
			org.openxava.test.calculators.CustomerTypeInvoiceDiscountCalculator customerTypeDiscountCalculator= (org.openxava.test.calculators.CustomerTypeInvoiceDiscountCalculator)
				getMetaModel().getMetaProperty("customerTypeDiscount").getMetaCalculator().createCalculator();  	
			
			customerTypeDiscountCalculator.setType(getCustomer().getType()); 
			return (java.math.BigDecimal) customerTypeDiscountCalculator.calculate();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references 
			return null; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "CustomerTypeDiscount", "Invoice", ex.getLocalizedMessage()));
		} 		
	}
	public void setCustomerTypeDiscount(java.math.BigDecimal newCustomerTypeDiscount) {
		// for it is in value object
		// para que aparezca en los value objects
	} 
	private static org.openxava.converters.IConverter commentConverter;
	private org.openxava.converters.IConverter getCommentConverter() {
		if (commentConverter == null) {
			try {
				commentConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("comment");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "comment"));
			}
			
		}	
		return commentConverter;
	} 
	private java.lang.String comment;
	private java.lang.String get_Comment() {
		return comment;
	}
	private void set_Comment(java.lang.String newComment) {
		this.comment = newComment;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getComment() {
		try {
			return (String) getCommentConverter().toJava(get_Comment());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Comment", "Invoice", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setComment(String newComment) {
		try { 
			set_Comment((java.lang.String) getCommentConverter().toDB(newComment));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Comment", "Invoice", "String"));
		}		
	} 	
	/**
	 * 
	 * 
	 */
	public java.util.Date getDeliveryDate() { 		
		try {			
			org.openxava.test.calculators.InvoiceDeliveryDateCalculator deliveryDateCalculator= (org.openxava.test.calculators.InvoiceDeliveryDateCalculator)
				getMetaModel().getMetaProperty("deliveryDate").getMetaCalculator().createCalculator(); 
				deliveryDateCalculator.setModel(this); 
			return (java.util.Date) deliveryDateCalculator.calculate();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references 
			return null; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "DeliveryDate", "Invoice", ex.getLocalizedMessage()));
		} 		
	}
	public void setDeliveryDate(java.util.Date newDeliveryDate) {
		// for it is in value object
		// para que aparezca en los value objects
	} 	
	/**
	 * 
	 * 
	 */
	public int getDetailsCount() { 		
		try {			
			org.openxava.test.calculators.DetailsCountCalculator detailsCountCalculator= (org.openxava.test.calculators.DetailsCountCalculator)
				getMetaModel().getMetaProperty("detailsCount").getMetaCalculator().createCalculator();  	
			
			detailsCountCalculator.setYear(getYear());  	
			
			detailsCountCalculator.setNumber(getNumber()); 
				detailsCountCalculator.setConnectionProvider(DataSourceConnectionProvider.getByComponent("Invoice")); 
			return ((Integer) detailsCountCalculator.calculate()).intValue();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references 
			return 0; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "DetailsCount", "Invoice", ex.getLocalizedMessage()));
		} 		
	}
	public void setDetailsCount(int newDetailsCount) {
		// for it is in value object
		// para que aparezca en los value objects
	} 	
	/**
	 * 
	 * 
	 */
	public java.math.BigDecimal getYearDiscount() { 		
		try {			
			org.openxava.test.calculators.YearInvoiceDiscountCalculator yearDiscountCalculator= (org.openxava.test.calculators.YearInvoiceDiscountCalculator)
				getMetaModel().getMetaProperty("yearDiscount").getMetaCalculator().createCalculator();  	
			
			yearDiscountCalculator.setYear(getYear()); 
			return (java.math.BigDecimal) yearDiscountCalculator.calculate();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references 
			return null; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "YearDiscount", "Invoice", ex.getLocalizedMessage()));
		} 		
	}
	public void setYearDiscount(java.math.BigDecimal newYearDiscount) {
		// for it is in value object
		// para que aparezca en los value objects
	} 

	// References/Referencias 

	private org.openxava.test.model.ICustomer customer; 	
	public org.openxava.test.model.ICustomer getCustomer() {
		if (customer != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				customer.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return customer;
	}
	public void setCustomer(org.openxava.test.model.ICustomer newCustomer) {
		if (newCustomer != null && !(newCustomer instanceof org.openxava.test.model.Customer)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.customer = newCustomer; 
	} 

	// Colecciones/Collections 
	public java.util.Collection getCalculatedDetails() { 
		try { 		
			org.openxava.test.calculators.InvoiceDetailsCalculator calculatedDetailsCalculator= (org.openxava.test.calculators.InvoiceDetailsCalculator)
				getMetaModel().getMetaCollection("calculatedDetails").getMetaCalculator().createCalculator(); 
				calculatedDetailsCalculator.setModel(this); 
			return (java.util.Collection) calculatedDetailsCalculator.calculate();
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "calculatedDetails", "Invoice", ex.getLocalizedMessage()));
		} 				
	} 
	private java.util.Collection details;
	public java.util.Collection getDetails() {
		return details;
	}
	public void setDetails(java.util.Collection details) {
		this.details = details;
	} 
	private java.util.Collection deliveries;
	public java.util.Collection getDeliveries() {
		return deliveries;
	}
	public void setDeliveries(java.util.Collection deliveries) {
		this.deliveries = deliveries;
	} 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static Collection findAll()  {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Invoice as o where 1 = 1"); 
 			org.hibernate.Query sizeQuery = org.openxava.hibernate.XHibernate.getSession().createQuery("select count(*) from Invoice as o where 1 = 1"); 
 			return new org.openxava.hibernate.impl.FastSizeList(query, sizeQuery); 
 	} 	
 	public static Collection findPaidOnes()  {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Invoice as o where o.paid = 'S'"); 
 			org.hibernate.Query sizeQuery = org.openxava.hibernate.XHibernate.getSession().createQuery("select count(*) from Invoice as o where o.paid = 'S'"); 
 			return new org.openxava.hibernate.impl.FastSizeList(query, sizeQuery); 
 	} 	
 	public static Collection findNotPaidOnes()  {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Invoice as o where o.paid <> 'S'"); 
 			org.hibernate.Query sizeQuery = org.openxava.hibernate.XHibernate.getSession().createQuery("select count(*) from Invoice as o where o.paid <> 'S'"); 
 			return new org.openxava.hibernate.impl.FastSizeList(query, sizeQuery); 
 	} 	
 	public static Invoice findByYearNumber(int year,int number) throws javax.ejb.ObjectNotFoundException {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Invoice as o where o.year = :arg0 and number = :arg1"); 
		query.setParameter("arg0", new Integer(year)); 
		query.setParameter("arg1", new Integer(number)); 
		Invoice r = (Invoice) query.uniqueResult();
		if (r == null) {
			throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Invoice"));
		}
		return r; 
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Invoice").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "Invoice"));
			return super.toString();
		}		
	}

	public boolean equals(Object other) {		
		if (other == null) return false;
		return toString().equals(other.toString());
	}
	
	public int hashCode() {		
		return toString().hashCode();
	}
	
}