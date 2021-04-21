package com.packsendme.lib.roadway.simulation.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.packsendme.lib.roadway.simulation.request.SimulationRoadwayRequest;
import com.packsendme.lib.roadway.simulation.request.SimulationRoadwayRequest_Dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Document(collection = "pcks_roadway_simulationbre")
public class SimulationRoadwayResponse implements Serializable {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	public String id;
	public double distance_total;
	public int duration;
	public int toll_total;
	
	public SimulationRoadwayRequest requestData;
	public List<CostsRoadway> responseData = new ArrayList<CostsRoadway>();
	public Date dt_simulation;
	

	public SimulationRoadwayResponse(double distance_total, int duration, int toll_total,
			SimulationRoadwayRequest requestData, List<CostsRoadway> responseData, Date dt_simulation) {
		super();
		this.distance_total = distance_total;
		this.duration = duration;
		this.toll_total = toll_total;
		this.requestData = requestData;
		this.responseData = responseData;
		this.dt_simulation = dt_simulation;
	}





	public SimulationRoadwayResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	


}
