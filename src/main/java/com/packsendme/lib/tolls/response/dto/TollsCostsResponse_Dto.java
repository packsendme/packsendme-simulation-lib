package com.packsendme.lib.tolls.response.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TollsCostsResponse_Dto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String name_country;
	public Double toll_cost;
	public String currency_cost;
	public String currency_desc;
	public String status;
	
}
