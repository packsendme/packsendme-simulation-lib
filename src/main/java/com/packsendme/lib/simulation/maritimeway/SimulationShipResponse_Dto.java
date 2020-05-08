package com.packsendme.lib.simulation.maritimeway;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor
public class SimulationShipResponse_Dto implements Serializable  {
	
	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	public Double cost_shipcontainer;
}
