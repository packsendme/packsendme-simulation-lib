package com.packsendme.lib.roadway.simulation.request;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SimulationRoadwayRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String address_origin;
	public String address_destination;
	public String type_transport;
	public String product_transport;
	public int people;
	public Double weight_max;
	public String unity_weight;
	public Double height_max;
	public Double width_max;
	public Double length_max;
	public String delivery_type;
	

}
