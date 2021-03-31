package com.packsendme.lib.roadway.simulation.request;

import java.io.Serializable;
import java.util.Locale;

import com.packsendme.lib.common.exchange.Exchange;
import com.packsendme.lib.common.response.dto.api.GoogleAPITrackingResponse_Dto;
import com.packsendme.roadbrewa.entity.Roadway;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SimulationRoadwayRequest_Dto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String address_origin;
	public String address_destination;
	public String type_transport;
	public String product_transport;
	public int people;
	public Double weight_max;
	public String unity_weight;
	public Double height_max;
	public Double width_max;
	public Double length_max;
	public String delivery_type;
	public String language_locale;
	public String language_country;
	public Exchange exchangeObj;
	public GoogleAPITrackingResponse_Dto googleTracking;
	public Roadway roadwayRule;
	
	public SimulationRoadwayRequest_Dto(String address_origin, String address_destination, String type_transport,
			String product_transport, int people, Double weight_max, String unity_weight, Double height_max,
			Double width_max, Double length_max, String delivery_type, String language_locale, String language_country,
			Exchange exchangeObj, GoogleAPITrackingResponse_Dto googleTracking, Roadway roadwayRule) {
		super();
		this.address_origin = address_origin;
		this.address_destination = address_destination;
		this.type_transport = type_transport;
		this.product_transport = product_transport;
		this.people = people;
		this.weight_max = weight_max;
		this.unity_weight = unity_weight;
		this.height_max = height_max;
		this.width_max = width_max;
		this.length_max = length_max;
		this.delivery_type = delivery_type;
		this.language_locale = language_locale;
		this.language_country = language_country;
		this.exchangeObj = exchangeObj;
		this.googleTracking = googleTracking;
		this.roadwayRule = roadwayRule;
	}
	
	
	
	

}
