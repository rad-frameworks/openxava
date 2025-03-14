
// File generated by OpenXava: Fri Feb 04 12:23:42 CET 2022
// Archivo generado por OpenXava: Fri Feb 04 12:23:42 CET 2022

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: ServiceType		Entity/Entidad

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
public class ServiceType implements java.io.Serializable, org.openxava.test.model.IServiceType {	

	// Constructor
	public ServiceType() {
		initMembers();
	} 

	private void initMembers() { 
		setNumber(0); 
		setDescription(null); 
		setFamily(0); 
		setSubfamily(0); 	
	} 
	
	// Properties/Propiedades 
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int newNumber) {
		this.number = newNumber;
	} 
	private static org.openxava.converters.IConverter subfamilyConverter;
	private org.openxava.converters.IConverter getSubfamilyConverter() {
		if (subfamilyConverter == null) {
			try {
				subfamilyConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("subfamily");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "subfamily"));
			}
			
		}	
		return subfamilyConverter;
	} 
	private java.lang.Integer subfamily;
	private java.lang.Integer get_Subfamily() {
		return subfamily;
	}
	private void set_Subfamily(java.lang.Integer newSubfamily) {
		this.subfamily = newSubfamily;
	} 	
	
	/**
	 * 
	 * 
	 */
	public int getSubfamily() {
		try {
			return ((Integer) getSubfamilyConverter().toJava(get_Subfamily())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Subfamily", "ServiceType", "int"));
		}
	}
	
	/**
	 * 
	 */
	public void setSubfamily(int newSubfamily) {
		try { 
			set_Subfamily((java.lang.Integer) getSubfamilyConverter().toDB(new Integer(newSubfamily)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Subfamily", "ServiceType", "int"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "ServiceType", "String"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "ServiceType", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter familyConverter;
	private org.openxava.converters.IConverter getFamilyConverter() {
		if (familyConverter == null) {
			try {
				familyConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("family");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "family"));
			}
			
		}	
		return familyConverter;
	} 
	private java.lang.Integer family;
	private java.lang.Integer get_Family() {
		return family;
	}
	private void set_Family(java.lang.Integer newFamily) {
		this.family = newFamily;
	} 	
	
	/**
	 * 
	 * 
	 */
	public int getFamily() {
		try {
			return ((Integer) getFamilyConverter().toJava(get_Family())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Family", "ServiceType", "int"));
		}
	}
	
	/**
	 * 
	 */
	public void setFamily(int newFamily) {
		try { 
			set_Family((java.lang.Integer) getFamilyConverter().toDB(new Integer(newFamily)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Family", "ServiceType", "int"));
		}		
	} 

	// References/Referencias 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static ServiceType findByNumber(int number) throws javax.ejb.ObjectNotFoundException {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from ServiceType as o where o.number = :arg0"); 
		query.setParameter("arg0", new Integer(number)); 
		ServiceType r = (ServiceType) query.uniqueResult();
		if (r == null) {
			throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "ServiceType"));
		}
		return r; 
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("ServiceType").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "ServiceType"));
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