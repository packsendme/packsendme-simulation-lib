package com.packsendme.lib.simulation.roadway.response.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoadwayCostsResponse_Dto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Map<String, TollsCountryResponse_Dto> countryTolls = new HashMap<String, TollsCountryResponse_Dto>();
	public boolean status_tolls;
	public double distance_total;

}
