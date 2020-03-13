package com.packsendme.lib.simulation.way.response.dto;

import java.io.Serializable;

import com.packsendme.lib.simulation.way.roadway.response.dto.SimulationBicycleResponse_Dto;
import com.packsendme.lib.simulation.way.roadway.response.dto.SimulationCarResponse_Dto;
import com.packsendme.lib.simulation.way.roadway.response.dto.SimulationMotorcycleResponse_Dto;
import com.packsendme.lib.simulation.way.roadway.response.dto.SimulationTruckResponse_Dto;
import com.packsendme.lib.simulation.way.roadway.response.dto.SimulationWalkResponse_Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor
public class SimulationRoadwayResponse_Dto implements Serializable {
	
	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	public String currency_simulation;
	public String address_origin;
	public String address_destination;
	public boolean status_roadway;
	
	public SimulationBicycleResponse_Dto simulationBicycle = new SimulationBicycleResponse_Dto();
	public SimulationCarResponse_Dto simulationCar = new SimulationCarResponse_Dto();
	public SimulationMotorcycleResponse_Dto simulationMotorcyle = new SimulationMotorcycleResponse_Dto();
	public SimulationTruckResponse_Dto simulationTruck = new SimulationTruckResponse_Dto();
	public SimulationWalkResponse_Dto simulationWalk = new SimulationWalkResponse_Dto();

}
