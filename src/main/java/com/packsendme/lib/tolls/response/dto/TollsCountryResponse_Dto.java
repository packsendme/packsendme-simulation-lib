package com.packsendme.lib.tolls.response.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TollsCountryResponse_Dto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String name_country;
	public int toll_amount;
	public Double distance_country;
	public TollsCostsResponse_Dto costsTolls = new TollsCostsResponse_Dto();

	
}
