
// File generated by OpenXava: Fri Feb 04 12:23:42 CET 2022
// Archivo generado por OpenXava: Fri Feb 04 12:23:42 CET 2022

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Product2		Entity/Entidad

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
public class Product2 implements java.io.Serializable, org.openxava.test.model.IProduct2 {	

	// Constructor
	public Product2() {
		initMembers();
	} 

	private void initMembers() { 
		setNumber(0); 
		setDescription(null); 
		setPhotos(null); 
		setUnitPrice(null); 
		setUnitPriceWithTax(null); 	
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "UnitPrice", "Product2", "java.math.BigDecimal"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "UnitPrice", "Product2", "java.math.BigDecimal"));
		}		
	} 
	private long number;
	public long getNumber() {
		return number;
	}
	public void setNumber(long newNumber) {
		this.number = newNumber;
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Product2", "String"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Product2", "String"));
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
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "UnitPriceInPesetas", "Product2", ex.getLocalizedMessage()));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Photos", "Product2", "String"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Photos", "Product2", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter unitPriceWithTaxConverter;
	private org.openxava.converters.IConverter getUnitPriceWithTaxConverter() {
		if (unitPriceWithTaxConverter == null) {
			try {
				unitPriceWithTaxConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("unitPriceWithTax");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "unitPriceWithTax"));
			}
			
		}	
		return unitPriceWithTaxConverter;
	} 
	private java.math.BigDecimal unitPriceWithTax;
	private java.math.BigDecimal get_UnitPriceWithTax() {
		return unitPriceWithTax;
	}
	private void set_UnitPriceWithTax(java.math.BigDecimal newUnitPriceWithTax) {
		this.unitPriceWithTax = newUnitPriceWithTax;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.math.BigDecimal getUnitPriceWithTax() {
		try {
			return (java.math.BigDecimal) getUnitPriceWithTaxConverter().toJava(get_UnitPriceWithTax());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "UnitPriceWithTax", "Product2", "java.math.BigDecimal"));
		}
	}
	
	/**
	 * 
	 */
	public void setUnitPriceWithTax(java.math.BigDecimal newUnitPriceWithTax) {
		try { 
			set_UnitPriceWithTax((java.math.BigDecimal) getUnitPriceWithTaxConverter().toDB(newUnitPriceWithTax));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "UnitPriceWithTax", "Product2", "java.math.BigDecimal"));
		}		
	} 

	// References/Referencias 

	private org.openxava.test.model.IColor color; 	
	public org.openxava.test.model.IColor getColor() {
		if (color != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				color.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return color;
	}
	public void setColor(org.openxava.test.model.IColor newColor) {
		if (newColor != null && !(newColor instanceof org.openxava.test.model.Color)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.color = newColor; 
	} 

	private org.openxava.test.model.ISubfamily2 subfamily; 	
	public org.openxava.test.model.ISubfamily2 getSubfamily() {
		if (subfamily != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				subfamily.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return subfamily;
	}
	public void setSubfamily(org.openxava.test.model.ISubfamily2 newSubfamily2) {
		if (newSubfamily2 != null && !(newSubfamily2 instanceof org.openxava.test.model.Subfamily2)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.subfamily = newSubfamily2; 
	} 

	private org.openxava.test.model.IFormula formula; 	
	public org.openxava.test.model.IFormula getFormula() {
		if (formula != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				formula.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return formula;
	}
	public void setFormula(org.openxava.test.model.IFormula newFormula) {
		if (newFormula != null && !(newFormula instanceof org.openxava.test.model.Formula)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.formula = newFormula; 
	} 

	private org.openxava.test.model.IFamily2 family; 	
	public org.openxava.test.model.IFamily2 getFamily() {
		if (family != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				family.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return family;
	}
	public void setFamily(org.openxava.test.model.IFamily2 newFamily2) {
		if (newFamily2 != null && !(newFamily2 instanceof org.openxava.test.model.Family2)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.family = newFamily2; 
	} 

	private org.openxava.test.model.IWarehouse warehouse; 	
	public org.openxava.test.model.IWarehouse getWarehouse() {
		if (warehouse != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				warehouse.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return warehouse;
	}
	public void setWarehouse(org.openxava.test.model.IWarehouse newWarehouse) {
		if (newWarehouse != null && !(newWarehouse instanceof org.openxava.test.model.Warehouse)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.warehouse = newWarehouse; 
	} 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static Collection findAll()  {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Product2 as o where 1 = 1"); 
 			org.hibernate.Query sizeQuery = org.openxava.hibernate.XHibernate.getSession().createQuery("select count(*) from Product2 as o where 1 = 1"); 
 			return new org.openxava.hibernate.impl.FastSizeList(query, sizeQuery); 
 	} 	
 	public static Product2 findByNumber(long number) throws javax.ejb.ObjectNotFoundException {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Product2 as o where o.number = :arg0"); 
		query.setParameter("arg0", new Long(number)); 
		Product2 r = (Product2) query.uniqueResult();
		if (r == null) {
			throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Product2"));
		}
		return r; 
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Product2").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "Product2"));
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