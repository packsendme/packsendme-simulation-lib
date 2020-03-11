package com.packsendme.lib.simulation.response.dto;

import java.io.Serializable;

import com.packsendme.lib.simulation.to.maritimeway.response.dto.SimulationShipResponse_Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor
public class SimulationMaritimewayResponse_Dto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String currency_simulation;
	private String address_origin;
	private String address_destination;
	private boolean status_simulation;
	
	private SimulationShipResponse_Dto simulationShip = new SimulationShipResponse_Dto();

}
