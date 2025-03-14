
// File generated by OpenXava: Fri Feb 04 12:23:41 CET 2022
// Archivo generado por OpenXava: Fri Feb 04 12:23:41 CET 2022

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: City		Entity/Entidad

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
public class City implements java.io.Serializable, org.openxava.test.model.ICity {	

	// Constructor
	public City() {
		initMembers();
	} 

	private void initMembers() { 
		setCode(0); 
		setName(null); 	
	} 
	
	// Properties/Propiedades 
	private int code;
	public int getCode() {
		return code;
	}
	public void setCode(int newCode) {
		this.code = newCode;
	} 
	private static org.openxava.converters.IConverter nameConverter;
	private org.openxava.converters.IConverter getNameConverter() {
		if (nameConverter == null) {
			try {
				nameConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("name");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "name"));
			}
			
		}	
		return nameConverter;
	} 
	private java.lang.String name;
	private java.lang.String get_Name() {
		return name;
	}
	private void set_Name(java.lang.String newName) {
		this.name = newName;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getName() {
		try {
			return (String) getNameConverter().toJava(get_Name());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Name", "City", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setName(String newName) {
		try { 
			set_Name((java.lang.String) getNameConverter().toDB(newName));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Name", "City", "String"));
		}		
	} 

	// References/Referencias 

	private org.openxava.test.model.IState state; 	
	public org.openxava.test.model.IState getState() {
		if (state != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				state.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return state;
	}
	public void setState(org.openxava.test.model.IState newState) {
		if (newState != null && !(newState instanceof org.openxava.test.model.State)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.state = newState; 
	} 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("City").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "City"));
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