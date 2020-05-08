package com.packsendme.lib.simulation.http;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class SimulationRequest_Dto implements Serializable {
	
	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	public String address_origin;
	public String address_destination;
	public String type_product;
	public double weight_product;
	public String type_delivery;
	public String unity_measurement_weight;
	public String unity_measurement_distance_txt;
}
