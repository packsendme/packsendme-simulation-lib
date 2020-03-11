package com.packsendme.lib.simulation.response.dto;

import java.io.Serializable;

import com.packsendme.lib.simulation.to.airway.response.dto.SimulationAirplaneResponse_Dto;
import com.packsendme.lib.simulation.to.airway.response.dto.SimulationContainerAirlineResponse_Dto;

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
	private static final long serialVersionUID = 1L;
	private String currency_simulation;
	private String address_origin;
	private String address_destination;
	private boolean status_simulation;
	
	private SimulationAirplaneResponse_Dto simulationBag = new SimulationAirplaneResponse_Dto();
	private SimulationContainerAirlineResponse_Dto simulationContainerAirline = new SimulationContainerAirlineResponse_Dto();
	
}
