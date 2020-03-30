package com.packsendme.lib.simulation.roadway.response.dto;

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
	public String unity_measurement_distance;
	
	public TollsCountryResponse_Dto(String name_country, int toll_amount, Double distance_country,
			String unity_measurement_distance, Double average_price_toll, String currency_price) {
		super();
		this.name_country = name_country;
		this.toll_amount = toll_amount;
		this.distance_country = distance_country;
		this.unity_measurement_distance = unity_measurement_distance;
		this.average_price_toll = average_price_toll;
		this.currency_price = currency_price;
	}
	
	

	

	
}
