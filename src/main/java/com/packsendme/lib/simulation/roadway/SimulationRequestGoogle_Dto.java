package com.packsendme.lib.simulation.roadway;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class SimulationRequestGoogle_Dto implements Serializable {
	
	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	public String origin_from;
	public String destination_to;
}
