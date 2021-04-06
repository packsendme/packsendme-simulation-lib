package com.packsendme.lib.roadway.simulation.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.packsendme.lib.common.response.dto.api.GoogleAPITrackingResponse_Dto;
import com.packsendme.lib.roadway.simulation.request.SimulationRoadwayRequest_Dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SimulationRoadwayResponse implements Serializable {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String distance_total;
	public int duration;
	public int toll_total;
	
	public SimulationRoadwayRequest_Dto requestData;
	public List<CostsRoadway> responseData = new ArrayList<CostsRoadway>();
	public Date dt_simulation;
	

	public SimulationRoadwayResponse(String distance_total, int duration, int toll_total,
			SimulationRoadwayRequest_Dto requestData, List<CostsRoadway> responseData, Date dt_simulation) {
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
