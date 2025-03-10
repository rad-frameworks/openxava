
// File generated by OpenXava: Fri Feb 04 12:23:42 CET 2022
// Archivo generado por OpenXava: Fri Feb 04 12:23:42 CET 2022

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Product		Entity/Entidad

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
public class Product implements java.io.Serializable, org.openxava.test.model.IProduct {	

	// Constructor
	public Product() {
		initMembers();
	} 

	private void initMembers() { 
		setNumber(0); 
		setDescription(null); 
		setPhotos(null); 
		setFamilyNumber(0); 
		setSubfamilyNumber(0); 
		setRemarks(null); 
		setUnitPrice(null); 	
	} 
	
	// Properties/Propiedades 
	private static org.openxava.converters.IConverter unitPriceConverter;
	private org.openxava.converters.IConverter getUnitPriceConverter() {
		if (unitPriceConverter == null) {
			try {
				unitPriceConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("unitPrice");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "unitPrice"));
			}
			
		}	
		return unitPriceConverter;
	} 
	private java.math.BigDecimal unitPrice;
	private java.math.BigDecimal get_UnitPrice() {
		return unitPrice;
	}
	private void set_UnitPrice(java.math.BigDecimal newUnitPrice) {
		this.unitPrice = newUnitPrice;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.math.BigDecimal getUnitPrice() {
		try {
			return (java.math.BigDecimal) getUnitPriceConverter().toJava(get_UnitPrice());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "UnitPrice", "Product", "java.math.BigDecimal"));
		}
	}
	
	/**
	 * 
	 */
	public void setUnitPrice(java.math.BigDecimal newUnitPrice) {
		try { 
			set_UnitPrice((java.math.BigDecimal) getUnitPriceConverter().toDB(newUnitPrice));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "UnitPrice", "Product", "java.math.BigDecimal"));
		}		
	} 
	private long number;
	public long getNumber() {
		return number;
	}
	public void setNumber(long newNumber) {
		this.number = newNumber;
	} 
		public org.openxava.test.model.Warehouse getWarehouseKey() {
		org.openxava.test.model.Warehouse key = new org.openxava.test.model.Warehouse();
		key.setNumber(getWarehouseNumber()==null?0:getWarehouseNumber().intValue());
		key.setZoneNumber(getWarehouseZoneNumber());
		return key;
	}

	public void setWarehouseKey(org.openxava.test.model.Warehouse warehouseKey) {
		setWarehouseNumber(new Integer(warehouseKey.getNumber()));
		setWarehouseZoneNumber(warehouseKey.getZoneNumber());
	}

	private int warehouseZoneNumber;	
	public int getWarehouseZoneNumber() {
		return warehouseZoneNumber;
	}
	public void setWarehouseZoneNumber(int newWarehouseZoneNumber) {
		warehouseZoneNumber = newWarehouseZoneNumber;
	}
	
	private Integer warehouseNumber;	
	public Integer getWarehouseNumber() {
		return warehouseNumber;
	}
	
	public void setWarehouseNumber(Integer newWarehouseNumber) {
		warehouseNumber = newWarehouseNumber;
	}
	 
	private static org.openxava.converters.IConverter subfamilyNumberConverter;
	private org.openxava.converters.IConverter getSubfamilyNumberConverter() {
		if (subfamilyNumberConverter == null) {
			try {
				subfamilyNumberConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("subfamilyNumber");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "subfamilyNumber"));
			}
			
		}	
		return subfamilyNumberConverter;
	} 
	private java.lang.Integer subfamilyNumber;
	private java.lang.Integer get_SubfamilyNumber() {
		return subfamilyNumber;
	}
	private void set_SubfamilyNumber(java.lang.Integer newSubfamilyNumber) {
		this.subfamilyNumber = newSubfamilyNumber;
	} 	
	
	/**
	 * 
	 * 
	 */
	public int getSubfamilyNumber() {
		try {
			return ((Integer) getSubfamilyNumberConverter().toJava(get_SubfamilyNumber())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "SubfamilyNumber", "Product", "int"));
		}
	}
	
	/**
	 * 
	 */
	public void setSubfamilyNumber(int newSubfamilyNumber) {
		try { 
			set_SubfamilyNumber((java.lang.Integer) getSubfamilyNumberConverter().toDB(new Integer(newSubfamilyNumber)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "SubfamilyNumber", "Product", "int"));
		}		
	} 
	private static org.openxava.converters.IConverter familyNumberConverter;
	private org.openxava.converters.IConverter getFamilyNumberConverter() {
		if (familyNumberConverter == null) {
			try {
				familyNumberConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("familyNumber");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "familyNumber"));
			}
			
		}	
		return familyNumberConverter;
	} 
	private java.lang.Integer familyNumber;
	private java.lang.Integer get_FamilyNumber() {
		return familyNumber;
	}
	private void set_FamilyNumber(java.lang.Integer newFamilyNumber) {
		this.familyNumber = newFamilyNumber;
	} 	
	
	/**
	 * 
	 * 
	 */
	public int getFamilyNumber() {
		try {
			return ((Integer) getFamilyNumberConverter().toJava(get_FamilyNumber())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "FamilyNumber", "Product", "int"));
		}
	}
	
	/**
	 * 
	 */
	public void setFamilyNumber(int newFamilyNumber) {
		try { 
			set_FamilyNumber((java.lang.Integer) getFamilyNumberConverter().toDB(new Integer(newFamilyNumber)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "FamilyNumber", "Product", "int"));
		}		
	} 
	private static org.openxava.converters.IConverter descriptionConverter;
	private org.openxava.converters.IConverter getDescriptionConverter() {
		if (descriptionConverter == null) {
			try {
				descriptionConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("description");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "description"));
			}
			
		}	
		return descriptionConverter;
	} 
	private java.lang.String description;
	private java.lang.String get_Description() {
		return description;
	}
	private void set_Description(java.lang.String newDescription) {
		this.description = newDescription;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getDescription() {
		try {
			return (String) getDescriptionConverter().toJava(get_Description());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Product", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setDescription(String newDescription) {
		try { 
			set_Description((java.lang.String) getDescriptionConverter().toDB(newDescription));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Product", "String"));
		}		
	} 	
	/**
	 * 
	 * 
	 */
	public java.math.BigDecimal getUnitPriceInPesetas() { 		
		try {			
			org.openxava.test.calculators.EurosToPesetasCalculator unitPriceInPesetasCalculator= (org.openxava.test.calculators.EurosToPesetasCalculator)
				getMetaModel().getMetaProperty("unitPriceInPesetas").getMetaCalculator().createCalculator();  	
			
			unitPriceInPesetasCalculator.setEuros(getUnitPrice()); 
			return (java.math.BigDecimal) unitPriceInPesetasCalculator.calculate();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references 
			return null; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "UnitPriceInPesetas", "Product", ex.getLocalizedMessage()));
		} 		
	}
	public void setUnitPriceInPesetas(java.math.BigDecimal newUnitPriceInPesetas) {
		// for it is in value object
		// para que aparezca en los value objects
	} 
	private static org.openxava.converters.IConverter photosConverter;
	private org.openxava.converters.IConverter getPhotosConverter() {
		if (photosConverter == null) {
			try {
				photosConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("photos");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "photos"));
			}
			
		}	
		return photosConverter;
	} 
	private java.lang.String photos;
	private java.lang.String get_Photos() {
		return photos;
	}
	private void set_Photos(java.lang.String newPhotos) {
		this.photos = newPhotos;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getPhotos() {
		try {
			return (String) getPhotosConverter().toJava(get_Photos());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Photos", "Product", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setPhotos(String newPhotos) {
		try { 
			set_Photos((java.lang.String) getPhotosConverter().toDB(newPhotos));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Photos", "Product", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter remarksConverter;
	private org.openxava.converters.IConverter getRemarksConverter() {
		if (remarksConverter == null) {
			try {
				remarksConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("remarks");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "remarks"));
			}
			
		}	
		return remarksConverter;
	} 
	private java.lang.String remarks;
	private java.lang.String get_Remarks() {
		return remarks;
	}
	private void set_Remarks(java.lang.String newRemarks) {
		this.remarks = newRemarks;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.lang.String getRemarks() {
		try {
			return (java.lang.String) getRemarksConverter().toJava(get_Remarks());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Remarks", "Product", "java.lang.String"));
		}
	}
	
	/**
	 * 
	 */
	public void setRemarks(java.lang.String newRemarks) {
		try { 
			set_Remarks((java.lang.String) getRemarksConverter().toDB(newRemarks));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Remarks", "Product", "java.lang.String"));
		}		
	} 

	// References/Referencias 

	// Colecciones/Collections 

	// Methods/Metodos 
	/**
	 * @ejb:interface-method
	 */
	public void increasePrice()  { 		
		try {			
			org.openxava.test.calculators.IncreasePriceCalculator increasePriceCalculator = (org.openxava.test.calculators.IncreasePriceCalculator)
				getMetaModel().getMetaMethod("increasePrice").getMetaCalculator().createCalculator(); 
				increasePriceCalculator.setModel(this); 
			increasePriceCalculator.calculate(); 
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("method_execution_error", "increasePrice", "Product"));
		} 
		
	} 
	/**
	 * @ejb:interface-method
	 */
	public BigDecimal getPrice(String country, BigDecimal tariff) throws ProductException, PriceException { 		
		try {			
			org.openxava.test.calculators.ExportPriceCalculator getPriceCalculator = (org.openxava.test.calculators.ExportPriceCalculator)
				getMetaModel().getMetaMethod("getPrice").getMetaCalculator().createCalculator();  	
			getPriceCalculator.setEuros(getUnitPrice()); 		
			getPriceCalculator.setCountry(country); 		
			getPriceCalculator.setTariff(tariff); 
			return (BigDecimal) getPriceCalculator.calculate(); 
		}
		catch (ProductException ex) {
			throw ex; 
		}
		catch (PriceException ex) {
			throw ex; 
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("method_execution_error", "getPrice", "Product"));
		} 
		
	} 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static Collection findAll()  {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Product as o where 1 = 1"); 
 			org.hibernate.Query sizeQuery = org.openxava.hibernate.XHibernate.getSession().createQuery("select count(*) from Product as o where 1 = 1"); 
 			return new org.openxava.hibernate.impl.FastSizeList(query, sizeQuery); 
 	} 	
 	public static Product findByNumber(long number) throws javax.ejb.ObjectNotFoundException {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Product as o where o.number = :arg0"); 
		query.setParameter("arg0", new Long(number)); 
		Product r = (Product) query.uniqueResult();
		if (r == null) {
			throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Product"));
		}
		return r; 
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Product").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "Product"));
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