package com.packsendme.lib.simulation.way.response.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.packsendme.lib.simulation.way.roadway.response.dto.RoadwayCalculatorResponse_Dto;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class SimulationRoadwayResponse_Dto implements Serializable {
	
	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	public Map<String,RoadwayCalculatorResponse_Dto> roadway = new HashMap<String, RoadwayCalculatorResponse_Dto>();
	
}
