package com.packsendme.lib.simulation.http;

import java.io.Serializable;

import com.packsendme.lib.simulation.airway.SimulationAirwayResponse_Dto;
import com.packsendme.lib.simulation.maritimeway.SimulationMaritimewayResponse_Dto;
import com.packsendme.lib.simulation.roadway.SimulationRoadwayResponse_Dto;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class SimulationResponse_Dto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String address_origin;
	public String address_destination;
	public double distances_places;
	public Boolean status_simulation;
	
	public SimulationRoadwayResponse_Dto simulationRoadwayResponse = new SimulationRoadwayResponse_Dto();
	public SimulationAirwayResponse_Dto simulationAirwayResponse = new SimulationAirwayResponse_Dto();
	public SimulationMaritimewayResponse_Dto simulationMaritimewayResponse = new SimulationMaritimewayResponse_Dto();
	
	

}