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
	public Double average_price_toll;
	public Double distance_country;
	public String currency_price;
	
	
	public TollsCountryResponse_Dto(String name_country, int toll_amount, Double average_price_toll,
			Double distance_country, String currency_price) {
		super();
		this.name_country = name_country;
		this.toll_amount = toll_amount;
		this.average_price_toll = average_price_toll;
		this.distance_country = distance_country;
		this.currency_price = currency_price;
	}
	
	

	
}
