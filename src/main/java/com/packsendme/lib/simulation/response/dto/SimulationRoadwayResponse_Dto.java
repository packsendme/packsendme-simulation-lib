package com.packsendme.lib.simulation.response.dto;

import java.io.Serializable;

import com.packsendme.lib.simulation.to.roadway.response.dto.SimulationBicycleResponse_Dto;
import com.packsendme.lib.simulation.to.roadway.response.dto.SimulationCarResponse_Dto;
import com.packsendme.lib.simulation.to.roadway.response.dto.SimulationMotorcycleResponse_Dto;
import com.packsendme.lib.simulation.to.roadway.response.dto.SimulationTruckResponse_Dto;
import com.packsendme.lib.simulation.to.roadway.response.dto.SimulationWalkResponse_Dto;

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
	private static final long serialVersionUID = 1L;
	private String currency_simulation;
	private String address_origin;
	private String address_destination;
	private boolean status_simulation;
	
	private SimulationBicycleResponse_Dto simulationBicycle = new SimulationBicycleResponse_Dto();
	private SimulationCarResponse_Dto simulationCar = new SimulationCarResponse_Dto();
	private SimulationMotorcycleResponse_Dto simulationMotorcyle = new SimulationMotorcycleResponse_Dto();
	private SimulationTruckResponse_Dto simulationTruck = new SimulationTruckResponse_Dto();
	private SimulationWalkResponse_Dto simulationWalk = new SimulationWalkResponse_Dto();

}
