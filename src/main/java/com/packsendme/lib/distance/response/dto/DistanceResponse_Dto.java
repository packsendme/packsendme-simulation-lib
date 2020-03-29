package com.packsendme.lib.distance.response.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DistanceResponse_Dto implements Serializable {
	
	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	
	public String destination;
	public String origin;
	public int distance;
	public String measureUnit;
	public String status;
}
