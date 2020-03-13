package com.packsendme.lib.simulation.way.airway.response.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor
public class SimulationAirplaneResponse_Dto implements Serializable  {
	
	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	public Double cost_bag;	
	public Boolean status_bag;
}
