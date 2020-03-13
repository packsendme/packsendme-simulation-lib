package com.packsendme.lib.simulation.way.response.dto;

import java.io.Serializable;

import com.packsendme.lib.simulation.way.airway.response.dto.SimulationAirplaneResponse_Dto;
import com.packsendme.lib.simulation.way.airway.response.dto.SimulationContainerAirlineResponse_Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor
public class SimulationAirwayResponse_Dto implements Serializable {
	
	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	public String currency_simulation;
	public String address_origin;
	public String address_destination;
	public boolean status_airway;
	
	public SimulationAirplaneResponse_Dto simulationBag = new SimulationAirplaneResponse_Dto();
	public SimulationContainerAirlineResponse_Dto simulationContainerAirline = new SimulationContainerAirlineResponse_Dto();
	
}
