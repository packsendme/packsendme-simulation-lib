package com.packsendme.lib.simulation.request.dto;

import java.io.Serializable;

import com.packsendme.airway.bre.rule.model.AirwayBRE_Model;
import com.packsendme.maritimeway.bre.rule.model.MaritimewayBRE_Model;
import com.packsendme.roadway.bre.rule.model.RoadwayBRE_Model;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class SimulationDataForCalculateRequest_Dto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Double weight_product = 0.0;
	public String weight_measured_unit;
	public String delivery_type;
	public Double rate_exchange = 0.0;
	
	// Locale Origin-Request
	public String locale_language;
	public String locale_country;
	
	public Double exchange_rate;
	public Double percentage_packsend;
	
	public RoadwayBRE_Model roadwayBRE_cache = new RoadwayBRE_Model();
	public MaritimewayBRE_Model maritimewayBRE_cache = new MaritimewayBRE_Model();
	public AirwayBRE_Model airwayBRE_cache = new AirwayBRE_Model();
	

	public SimulationDataForCalculateRequest_Dto(Double weight_product, String weight_measured_unit,
			String delivery_type, String locale_language, String locale_country, Double exchange_rate,
			Double percentage_packsend, RoadwayBRE_Model roadwayBRE_cache) {
		super();
		this.weight_product = weight_product;
		this.weight_measured_unit = weight_measured_unit;
		this.delivery_type = delivery_type;
		this.locale_language = locale_language;
		this.locale_country = locale_country;
		this.exchange_rate = exchange_rate;
		this.percentage_packsend = percentage_packsend;
		this.roadwayBRE_cache = roadwayBRE_cache;
	}
	
	public SimulationDataForCalculateRequest_Dto(Double weight_product, String weight_measured_unit,
			String delivery_type, String locale_language, String locale_country, Double exchange_rate,
			Double percentage_packsend, MaritimewayBRE_Model maritimewayBRE_cache) {
		super();
		this.weight_product = weight_product;
		this.weight_measured_unit = weight_measured_unit;
		this.delivery_type = delivery_type;
		this.locale_language = locale_language;
		this.locale_country = locale_country;
		this.exchange_rate = exchange_rate;
		this.percentage_packsend = percentage_packsend;
		this.maritimewayBRE_cache = maritimewayBRE_cache;
	}
	
	public SimulationDataForCalculateRequest_Dto(Double weight_product, String weight_measured_unit,
			String delivery_type, String locale_language, String locale_country, Double exchange_rate,
			Double percentage_packsend, AirwayBRE_Model airwayBRE_cache) {
		super();
		this.weight_product = weight_product;
		this.weight_measured_unit = weight_measured_unit;
		this.delivery_type = delivery_type;
		this.locale_language = locale_language;
		this.locale_country = locale_country;
		this.exchange_rate = exchange_rate;
		this.percentage_packsend = percentage_packsend;
		this.airwayBRE_cache = airwayBRE_cache;
	}

	public SimulationDataForCalculateRequest_Dto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}
