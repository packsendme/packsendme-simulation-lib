package com.packsendme.lib.simulation.way.roadway.response.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor
public class SimulationWalkResponse_Dto implements Serializable  {
	
	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	public Double cost_walk;
	public Boolean status_walk;
}
