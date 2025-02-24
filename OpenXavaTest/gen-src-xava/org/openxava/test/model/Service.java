
// File generated by OpenXava: Fri Feb 04 12:23:42 CET 2022
// Archivo generado por OpenXava: Fri Feb 04 12:23:42 CET 2022

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Service		Entity/Entidad

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
public class Service implements java.io.Serializable, org.openxava.test.model.IService {	

	// Constructor
	public Service() {
		initMembers();
	} 

	private void initMembers() { 
		setNumber(0); 
		setDescription(null); 
		setFamily(0); 	
	} 
	
	// Properties/Propiedades 
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int newNumber) {
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Service", "String"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Service", "String"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Family", "Service", "int"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Family", "Service", "int"));
		}		
	} 

	// References/Referencias  	
	// Detail : Aggregate/Agregado 
	public org.openxava.test.model.Detail getDetail() {
		org.openxava.test.model.Detail r = new org.openxava.test.model.Detail();		
		r.setSubfamily(getDetail_subfamily());		
		r.setType(getDetail_type());		
		r.setFree(isDetail_free()); 
		r.setTypeRef(getDetail_typeRef());		
		return r;
	}	
	public void setDetail(org.openxava.test.model.Detail newDetail) throws java.rmi.RemoteException { 
		if (newDetail == null) newDetail = new org.openxava.test.model.Detail();		
		setDetail_subfamily(newDetail.getSubfamily());		
		setDetail_type(newDetail.getType());		
		setDetail_free(newDetail.getFree());		
		setDetail_typeRef(newDetail.getTypeRef());			
	}
	
	// For acceding to properties of this from calculators inside aggregates
	private Service getDetail_service() {
		return this;
	} 
	private static org.openxava.converters.IConverter detail_subfamilyConverter;
	private org.openxava.converters.IConverter getDetail_subfamilyConverter() {
		if (detail_subfamilyConverter == null) {
			try {
				detail_subfamilyConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("detail_subfamily");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "detail_subfamily"));
			}
			
		}	
		return detail_subfamilyConverter;
	} 
	private java.lang.Integer detail_subfamily;
	private java.lang.Integer get_Detail_subfamily() {
		return detail_subfamily;
	}
	private void set_Detail_subfamily(java.lang.Integer newDetail_subfamily) {
		this.detail_subfamily = newDetail_subfamily;
	} 	
	
	/**
	 * 
	 * 
	 */
	private int getDetail_subfamily() {
		try {
			return ((Integer) getDetail_subfamilyConverter().toJava(get_Detail_subfamily())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Detail_subfamily", "Detail", "int"));
		}
	}
	
	/**
	 * 
	 */
	private void setDetail_subfamily(int newDetail_subfamily) {
		try { 
			set_Detail_subfamily((java.lang.Integer) getDetail_subfamilyConverter().toDB(new Integer(newDetail_subfamily)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Detail_subfamily", "Detail", "int"));
		}		
	} 
	private static org.openxava.converters.IConverter detail_typeConverter;
	private org.openxava.converters.IConverter getDetail_typeConverter() {
		if (detail_typeConverter == null) {
			try {
				detail_typeConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("detail_type");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "detail_type"));
			}
			
		}	
		return detail_typeConverter;
	} 
	private java.lang.Integer detail_type;
	private java.lang.Integer get_Detail_type() {
		return detail_type;
	}
	private void set_Detail_type(java.lang.Integer newDetail_type) {
		this.detail_type = newDetail_type;
	} 	
	
	/**
	 * 
	 * 
	 */
	private int getDetail_type() {
		try {
			return ((Integer) getDetail_typeConverter().toJava(get_Detail_type())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Detail_type", "Detail", "int"));
		}
	}
	
	/**
	 * 
	 */
	private void setDetail_type(int newDetail_type) {
		try { 
			set_Detail_type((java.lang.Integer) getDetail_typeConverter().toDB(new Integer(newDetail_type)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Detail_type", "Detail", "int"));
		}		
	} 
	private static org.openxava.converters.IConverter detail_freeConverter;
	private org.openxava.converters.IConverter getDetail_freeConverter() {
		if (detail_freeConverter == null) {
			try {
				detail_freeConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("detail_free");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "detail_free"));
			}
			
		}	
		return detail_freeConverter;
	} 
	private java.lang.Boolean detail_free;
	private java.lang.Boolean get_Detail_free() {
		return detail_free;
	}
	private void set_Detail_free(java.lang.Boolean newDetail_free) {
		this.detail_free = newDetail_free;
	} 	
	
	/**
	 * 
	 * 
	 */
	private boolean isDetail_free() {
		try {
			return ((Boolean) getDetail_freeConverter().toJava(get_Detail_free())).booleanValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Detail_free", "Detail", "boolean"));
		}
	}
	
	/**
	 * 
	 */
	private void setDetail_free(boolean newDetail_free) {
		try { 
			set_Detail_free((java.lang.Boolean) getDetail_freeConverter().toDB(new Boolean(newDetail_free)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Detail_free", "Detail", "boolean"));
		}		
	} 

	private org.openxava.test.model.IServiceType detail_typeRef; 	
	public org.openxava.test.model.IServiceType getDetail_typeRef() {
		if (detail_typeRef != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				detail_typeRef.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return detail_typeRef;
	}
	public void setDetail_typeRef(org.openxava.test.model.IServiceType newServiceType) throws RemoteException{
		if (newServiceType != null && !(newServiceType instanceof org.openxava.test.model.ServiceType)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.detail_typeRef = newServiceType; 
	} 

	private org.openxava.test.model.IServiceInvoice invoice; 	
	public org.openxava.test.model.IServiceInvoice getInvoice() {
		if (invoice != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				invoice.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return invoice;
	}
	public void setInvoice(org.openxava.test.model.IServiceInvoice newServiceInvoice) {
		if (newServiceInvoice != null && !(newServiceInvoice instanceof org.openxava.test.model.ServiceInvoice)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.invoice = newServiceInvoice; 
	} 

	// Colecciones/Collections 
	private java.util.Collection additionalDetails;
	public java.util.Collection getAdditionalDetails() {
		return additionalDetails;
	}
	public void setAdditionalDetails(java.util.Collection additionalDetails) {
		this.additionalDetails = additionalDetails;
	} 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static Service findByNumber(int number) throws javax.ejb.ObjectNotFoundException {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Service as o where o.number = :arg0"); 
		query.setParameter("arg0", new Integer(number)); 
		Service r = (Service) query.uniqueResult();
		if (r == null) {
			throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Service"));
		}
		return r; 
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Service").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "Service"));
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