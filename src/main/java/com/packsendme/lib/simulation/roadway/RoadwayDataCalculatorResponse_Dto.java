package com.packsendme.lib.simulation.roadway;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class RoadwayDataCalculatorResponse_Dto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String tolls_total;
	public String fuel_total;
	public double distance;

}
