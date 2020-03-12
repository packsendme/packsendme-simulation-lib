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
	public static final long serialVersionUID = 1L;
	public String currency_simulation;
	public String address_origin;
	public String address_destination;
	public boolean status_simulation;
	
	public SimulationShipResponse_Dto simulationShip = new SimulationShipResponse_Dto();

}
