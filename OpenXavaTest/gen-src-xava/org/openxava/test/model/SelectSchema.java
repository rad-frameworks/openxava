
// File generated by OpenXava: Fri Feb 04 12:23:42 CET 2022
// Archivo generado por OpenXava: Fri Feb 04 12:23:42 CET 2022

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: SelectSchema		Entity/Entidad

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
public class SelectSchema implements java.io.Serializable, org.openxava.test.model.ISelectSchema {	

	// Constructor
	public SelectSchema() {
		initMembers();
	} 

	private void initMembers() { 
		setSchema(0); 	
	} 
	
	// Properties/Propiedades 
	private static org.openxava.converters.IConverter schemaConverter;
	private org.openxava.converters.IConverter getSchemaConverter() {
		if (schemaConverter == null) {
			try {
				schemaConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("schema");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "schema"));
			}
			
		}	
		return schemaConverter;
	} 
	private java.lang.Integer schema;
	private java.lang.Integer get_Schema() {
		return schema;
	}
	private void set_Schema(java.lang.Integer newSchema) {
		this.schema = newSchema;
	} 	
	
	/**
	 * 
	 * 
	 */
	public int getSchema() {
		try {
			return ((Integer) getSchemaConverter().toJava(get_Schema())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Schema", "SelectSchema", "int"));
		}
	}
	
	/**
	 * 
	 */
	public void setSchema(int newSchema) {
		try { 
			set_Schema((java.lang.Integer) getSchemaConverter().toDB(new Integer(newSchema)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Schema", "SelectSchema", "int"));
		}		
	} 

	// References/Referencias 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static SelectSchema findBy() throws javax.ejb.ObjectNotFoundException {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from SelectSchema as o"); 
		SelectSchema r = (SelectSchema) query.uniqueResult();
		if (r == null) {
			throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "SelectSchema"));
		}
		return r; 
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("SelectSchema").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "SelectSchema"));
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