
// File generated by OpenXava: Fri Feb 04 12:23:41 CET 2022
// Archivo generado por OpenXava: Fri Feb 04 12:23:41 CET 2022

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Delivery		Entity/Entidad

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
public class Delivery implements java.io.Serializable, org.openxava.test.model.IDelivery {	

	// Constructor
	public Delivery() {
		initMembers();
	} 

	private void initMembers() { 
		setNumber(0); 
		setDate(null); 
		setDescription(null); 
		setDistance(0); 
		setVehicle(null); 
		setDriverType(null); 
		setEmployee(null); 
		setRemarks(null); 
		setIncidents(null); 	
	} 
	
	// Properties/Propiedades 
	private static org.openxava.converters.Date3Converter dateConverter;
	private org.openxava.converters.Date3Converter getDateConverter() {
		if (dateConverter == null) {
			try {
				dateConverter = (org.openxava.converters.Date3Converter) 
					getMetaModel().getMapping().getMultipleConverter("date");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "date"));
			}
			
		}	
		return dateConverter;
	} 
	private int date_day;
	private int getDate_day() {
		return date_day;
	}
	private void setDate_day(int newValue) {
		this.date_day = newValue;
	} 
	private int date_month;
	private int getDate_month() {
		return date_month;
	}
	private void setDate_month(int newValue) {
		this.date_month = newValue;
	} 
	private int date_year;
	private int getDate_year() {
		return date_year;
	}
	private void setDate_year(int newValue) {
		this.date_year = newValue;
	} 
	/**
	 * 
	 * 
	 */
	public java.util.Date getDate() {
		try { 
			getDateConverter().setDay(getDate_day()); 
			getDateConverter().setMonth(getDate_month()); 
			getDateConverter().setYear(getDate_year()); 
			return (java.util.Date) getDateConverter().toJava();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Date", "Delivery", "java.util.Date"));
		}
	}

	/**
	 * 
	 */
	public void setDate(java.util.Date newDate) {
		try { 
			getDateConverter().toDB(newDate); 
			setDate_day(getDateConverter().getDay()); 
			setDate_month(getDateConverter().getMonth()); 
			setDate_year(getDateConverter().getYear()); 			
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_db_error", "Date", "Delivery"));
		}		
	} 
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int newNumber) {
		this.number = newNumber;
	} 
	private static org.openxava.converters.IConverter distanceConverter;
	private org.openxava.converters.IConverter getDistanceConverter() {
		if (distanceConverter == null) {
			try {
				distanceConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("distance");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "distance"));
			}
			
		}	
		return distanceConverter;
	} 
	private java.lang.String distance;
	private java.lang.String get_Distance() {
		return distance;
	}
	private void set_Distance(java.lang.String newDistance) {
		this.distance = newDistance;
	} 	
	
	/**
	 * 
	 * 
	 */
	public int getDistance() {
		try {
			return ((Integer) getDistanceConverter().toJava(get_Distance())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Distance", "Delivery", "int"));
		}
	}
	
	/**
	 * 
	 */
	public void setDistance(int newDistance) {
		try { 
			set_Distance((java.lang.String) getDistanceConverter().toDB(new Integer(newDistance)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Distance", "Delivery", "int"));
		}		
	} 	
	/**
	 * 
	 * 
	 */
	public java.util.Date getDateAsLabel() { 		
		try {			
			org.openxava.calculators.ByPassCalculator dateAsLabelCalculator= (org.openxava.calculators.ByPassCalculator)
				getMetaModel().getMetaProperty("dateAsLabel").getMetaCalculator().createCalculator();  	
			
			dateAsLabelCalculator.setSource(getDate()); 
			return (java.util.Date) dateAsLabelCalculator.calculate();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references 
			return null; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "DateAsLabel", "Delivery", ex.getLocalizedMessage()));
		} 		
	}
	public void setDateAsLabel(java.util.Date newDateAsLabel) {
		// for it is in value object
		// para que aparezca en los value objects
	} 
	private static org.openxava.converters.IConverter incidentsConverter;
	private org.openxava.converters.IConverter getIncidentsConverter() {
		if (incidentsConverter == null) {
			try {
				incidentsConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("incidents");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "incidents"));
			}
			
		}	
		return incidentsConverter;
	} 
	private java.lang.String incidents;
	private java.lang.String get_Incidents() {
		return incidents;
	}
	private void set_Incidents(java.lang.String newIncidents) {
		this.incidents = newIncidents;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.lang.String getIncidents() {
		try {
			return (java.lang.String) getIncidentsConverter().toJava(get_Incidents());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Incidents", "Delivery", "java.lang.String"));
		}
	}
	
	/**
	 * 
	 */
	public void setIncidents(java.lang.String newIncidents) {
		try { 
			set_Incidents((java.lang.String) getIncidentsConverter().toDB(newIncidents));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Incidents", "Delivery", "java.lang.String"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Delivery", "String"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "Delivery", "String"));
		}		
	} 	
	/**
	 * 
	 * 
	 */
	public String getTransportMode() { 		
		try {			
			org.openxava.test.calculators.DeliveryTransportModeCalculator transportModeCalculator= (org.openxava.test.calculators.DeliveryTransportModeCalculator)
				getMetaModel().getMetaProperty("transportMode").getMetaCalculator().createCalculator();  	
			
			transportModeCalculator.setVehicle(getVehicle()); 
			return (String) transportModeCalculator.calculate();
		}
		catch (NullPointerException ex) {
			// Usually for multilevel property access with null references 
			return null; 			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.calculate_value_error", "TransportMode", "Delivery", ex.getLocalizedMessage()));
		} 		
	}
	public void setTransportMode(String newTransportMode) {
		// for it is in value object
		// para que aparezca en los value objects
	} 
	private static org.openxava.converters.IConverter employeeConverter;
	private org.openxava.converters.IConverter getEmployeeConverter() {
		if (employeeConverter == null) {
			try {
				employeeConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("employee");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "employee"));
			}
			
		}	
		return employeeConverter;
	} 
	private java.lang.String employee;
	private java.lang.String get_Employee() {
		return employee;
	}
	private void set_Employee(java.lang.String newEmployee) {
		this.employee = newEmployee;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getEmployee() {
		try {
			return (String) getEmployeeConverter().toJava(get_Employee());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Employee", "Delivery", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setEmployee(String newEmployee) {
		try { 
			set_Employee((java.lang.String) getEmployeeConverter().toDB(newEmployee));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Employee", "Delivery", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter driverTypeConverter;
	private org.openxava.converters.IConverter getDriverTypeConverter() {
		if (driverTypeConverter == null) {
			try {
				driverTypeConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("driverType");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "driverType"));
			}
			
		}	
		return driverTypeConverter;
	} 
	private java.lang.String driverType;
	private java.lang.String get_DriverType() {
		return driverType;
	}
	private void set_DriverType(java.lang.String newDriverType) {
		this.driverType = newDriverType;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getDriverType() {
		try {
			return (String) getDriverTypeConverter().toJava(get_DriverType());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "DriverType", "Delivery", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setDriverType(String newDriverType) {
		try { 
			set_DriverType((java.lang.String) getDriverTypeConverter().toDB(newDriverType));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "DriverType", "Delivery", "String"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Remarks", "Delivery", "java.lang.String"));
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
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Remarks", "Delivery", "java.lang.String"));
		}		
	} 
	private static org.openxava.converters.IConverter vehicleConverter;
	private org.openxava.converters.IConverter getVehicleConverter() {
		if (vehicleConverter == null) {
			try {
				vehicleConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("vehicle");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "vehicle"));
			}
			
		}	
		return vehicleConverter;
	} 
	private java.lang.String vehicle;
	private java.lang.String get_Vehicle() {
		return vehicle;
	}
	private void set_Vehicle(java.lang.String newVehicle) {
		this.vehicle = newVehicle;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getVehicle() {
		try {
			return (String) getVehicleConverter().toJava(get_Vehicle());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Vehicle", "Delivery", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setVehicle(String newVehicle) {
		try { 
			set_Vehicle((java.lang.String) getVehicleConverter().toDB(newVehicle));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Vehicle", "Delivery", "String"));
		}		
	} 

	// References/Referencias 

	private org.openxava.test.model.ICarrier carrier; 	
	public org.openxava.test.model.ICarrier getCarrier() {
		if (carrier != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				carrier.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return carrier;
	}
	public void setCarrier(org.openxava.test.model.ICarrier newCarrier) {
		if (newCarrier != null && !(newCarrier instanceof org.openxava.test.model.Carrier)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.carrier = newCarrier; 
	} 

	private org.openxava.test.model.IShipment shipment; 	
	public org.openxava.test.model.IShipment getShipment() {
		if (shipment != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				shipment.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return shipment;
	}
	public void setShipment(org.openxava.test.model.IShipment newShipment) {
		if (newShipment != null && !(newShipment instanceof org.openxava.test.model.Shipment)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.shipment = newShipment; 
	} 

	private org.openxava.test.model.IInvoice invoice; 	
	public org.openxava.test.model.IInvoice getInvoice() {
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
	public void setInvoice(org.openxava.test.model.IInvoice newInvoice) {
		if (newInvoice != null && !(newInvoice instanceof org.openxava.test.model.Invoice)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.invoice = newInvoice; 
	} 

	private org.openxava.test.model.IDeliveryType type; 	
	public org.openxava.test.model.IDeliveryType getType() {
		if (type != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				type.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return type;
	}
	public void setType(org.openxava.test.model.IDeliveryType newDeliveryType) {
		if (newDeliveryType != null && !(newDeliveryType instanceof org.openxava.test.model.DeliveryType)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.type = newDeliveryType; 
	} 

	// Colecciones/Collections 
	private java.util.Collection details;
	public java.util.Collection getDetails() {
		return details;
	}
	public void setDetails(java.util.Collection details) {
		this.details = details;
	} 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static Collection findAll()  {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Delivery as o"); 
 			org.hibernate.Query sizeQuery = org.openxava.hibernate.XHibernate.getSession().createQuery("select count(*) from Delivery as o"); 
 			return new org.openxava.hibernate.impl.FastSizeList(query, sizeQuery); 
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Delivery").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "Delivery"));
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