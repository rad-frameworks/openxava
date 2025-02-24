
// File generated by OpenXava: Fri Feb 04 12:23:42 CET 2022
// Archivo generado por OpenXava: Fri Feb 04 12:23:42 CET 2022

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Mixture		Entity/Entidad

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
public class Mixture implements java.io.Serializable, org.openxava.test.model.IMixture {	

	// Constructor
	public Mixture() {
		initMembers();
	} 

	private void initMembers() { 
		setColorName1(null); 
		setColorName2(null); 
		setDescription(null); 	
	} 
	
	// Properties/Propiedades 
	private String colorName2;
	public String getColorName2() {
		return colorName2;
	}
	public void setColorName2(String newColorName2) {
		this.colorName2 = newColorName2;
	} 
	private String colorName1;
	public String getColorName1() {
		return colorName1;
	}
	public void setColorName1(String newColorName1) {
		this.colorName1 = newColorName1;
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Mixture", "String"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Mixture", "String"));
		}		
	} 	
	/**
	 * 
	 * 
	 */
	public String getFullDescription() { 		
		try {			
			org.openxava.test.calculators.MixtureDescriptionCalculator fullDescriptionCalculator= (org.openxava.test.calculators.MixtureDescriptionCalculator)
				getMetaModel().getMetaProperty("fullDescription").getMetaCalculator().createCalculator();  	
			
			fullDescriptionCalculator.setColorName1(getColorName1());  	
			
			fullDescriptionCalculator.setColorName2(getColorName2());  	
			
			fullDescriptionCalculator.setDescription(getDescription()); 
			return (String) fullDescriptionCalculator.calculate();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references 
			return null; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "FullDescription", "Mixture", ex.getLocalizedMessage()));
		} 		
	}
	public void setFullDescription(String newFullDescription) {
		// for it is in value object
		// para que aparezca en los value objects
	} 

	// References/Referencias 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static Mixture findByColorName1ColorName2(java.lang.String colorName1,java.lang.String colorName2) throws javax.ejb.ObjectNotFoundException {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Mixture as o where o.colorName1 = :arg0 and colorName2 = :arg1"); 
		query.setParameter("arg0", colorName1); 
		query.setParameter("arg1", colorName2); 
		Mixture r = (Mixture) query.uniqueResult();
		if (r == null) {
			throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Mixture"));
		}
		return r; 
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Mixture").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "Mixture"));
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