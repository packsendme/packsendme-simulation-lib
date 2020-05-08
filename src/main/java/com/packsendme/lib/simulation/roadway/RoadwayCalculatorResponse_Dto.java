package com.packsendme.lib.simulation.roadway;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class RoadwayCalculatorResponse_Dto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String vlr_employer_total;
	public String vlr_packsend_total;
	public String vlr_delivery_total;
	public String vlr_reshipping;
	public String vlr_total;
	public boolean status;
	public Map<String,RoadwayDataCalculatorResponse_Dto> roadwayDataCalculator = new HashMap<String,RoadwayDataCalculatorResponse_Dto>();
	
	
	public RoadwayCalculatorResponse_Dto(String vlr_employer_total, String vlr_packsend_total,
			String vlr_delivery_total, String vlr_reshipping, String vlr_total, boolean status,
			Map<String, RoadwayDataCalculatorResponse_Dto> roadwayDataCalculator) {
		super();
		this.vlr_employer_total = vlr_employer_total;
		this.vlr_packsend_total = vlr_packsend_total;
		this.vlr_delivery_total = vlr_delivery_total;
		this.vlr_reshipping = vlr_reshipping;
		this.vlr_total = vlr_total;
		this.status = status;
		this.roadwayDataCalculator = roadwayDataCalculator;
	}




	public RoadwayCalculatorResponse_Dto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
