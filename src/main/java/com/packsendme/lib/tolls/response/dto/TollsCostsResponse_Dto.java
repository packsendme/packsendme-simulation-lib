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
	
	public Double average_price_toll;
	public String currency_price;
	public boolean status;
	
}
