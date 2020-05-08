package com.packsendme.lib.simulation.roadway;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

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
