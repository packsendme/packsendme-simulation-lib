package com.packsendme.lib.tolls.response.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TollsResponse_Dto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public boolean status_tolls;
	public Map<String, Integer> countryTolls = new HashMap<String, Integer>();
	public Map<String, TollsCostsResponse_Dto> costsTolls = new HashMap<String, TollsCostsResponse_Dto>();

}
