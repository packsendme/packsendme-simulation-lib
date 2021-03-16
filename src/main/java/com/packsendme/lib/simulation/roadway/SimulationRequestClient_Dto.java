package com.packsendme.lib.simulation.roadway;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class SimulationRequestClient_Dto implements Serializable {
	
	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	public String origin_from;
	public String destination_to;
	public String transport_type;
	public String product;
	public double weight;
	public String delivery_type;
	public String unity_weight;
}
