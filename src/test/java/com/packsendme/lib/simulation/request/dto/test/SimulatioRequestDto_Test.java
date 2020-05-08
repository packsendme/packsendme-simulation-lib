package com.packsendme.lib.simulation.request.dto.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.packsendme.lib.simulation.http.SimulationRequest_Dto;

public class SimulatioRequestDto_Test {

	private SimulationRequest_Dto simulationRequest_Dto = new SimulationRequest_Dto();
	private String jsonSouthAmerica = null;
	private String url_json = "src/test/resources/simulation_request_v1.json";
	
	@Test
	void generateSimulationRequest() throws URISyntaxException, IOException {
	
		simulationRequest_Dto.address_origin = "Barcelona";
		simulationRequest_Dto.address_destination = "Madrid";
		simulationRequest_Dto.type_product = "Document";
		simulationRequest_Dto.type_delivery = "Express";
		simulationRequest_Dto.weight_product = 20.00;
		simulationRequest_Dto.unity_measurement_weight = "gr";
		simulationRequest_Dto.unity_measurement_distance_txt = "KM";
		
		ObjectMapper mapper = new ObjectMapper();
		jsonSouthAmerica = mapper.writeValueAsString(simulationRequest_Dto);
		System.out.println(jsonSouthAmerica);
   		Assert.notNull(jsonSouthAmerica);
   		inputJsonFileSouthAmerica(jsonSouthAmerica);
	}
	
	void inputJsonFileSouthAmerica(String jsonSouthAmerica) throws IOException, URISyntaxException {
		ObjectMapper mapper = new ObjectMapper();
		
		File file = new File(url_json);
		if (file.length() != 0) {
			String absolutePath = file.getAbsolutePath();
			SimulationRequest_Dto obj = mapper.readValue(new File(absolutePath), SimulationRequest_Dto.class);
			Assert.notNull(obj);
		}
		else {
			try (FileWriter fileWriter = new FileWriter(url_json, true)) {
			    fileWriter.write(jsonSouthAmerica);
			}
		}
	}
	
}
