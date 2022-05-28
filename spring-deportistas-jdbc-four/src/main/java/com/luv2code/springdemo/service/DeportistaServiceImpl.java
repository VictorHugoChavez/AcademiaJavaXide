package com.luv2code.springdemo.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.luv2code.springdemo.entity.Deportistas;

@Service
public class DeportistaServiceImpl implements DeportistaService {

	private RestTemplate restTemplate;

	private String crmRestUrl;
		
	private Logger logger = Logger.getLogger(getClass().getName());

	
	@Autowired
	public DeportistaServiceImpl(RestTemplate theRestTemplate, @Value("${crm.rest.url}") String theUrl) {
		restTemplate = theRestTemplate;
		crmRestUrl = theUrl;
				
		logger.info("CHAVEZ CRUZ VICTOR ------------------- Loaded property:  crm.rest.url=" + crmRestUrl);
	}
	
	@Override

	public List<Deportistas> getDeportista() {
		logger.info("CHAVEZ CRUZ VICTOR ------------------- in getCustomers(): Calling REST API " + crmRestUrl);

		// make REST call
		ResponseEntity<List<Deportistas>> responseEntity = 
											restTemplate.exchange(crmRestUrl, HttpMethod.GET, null, 
																  new ParameterizedTypeReference<List<Deportistas>>() {});

		// get the list of customers from response
		List<Deportistas> deportistas = responseEntity.getBody();

		logger.info("CHAVEZ CRUZ VICTOR ------------------- in getCustomers(): customers" + deportistas);
		
		return deportistas;
		
	}

	@Override

	public void saveDeportista(Deportistas jugador) {
		
		
		int employeeId = jugador.getId();

		// make REST call
		if (employeeId == 0) {
			// add employee
			restTemplate.postForEntity(crmRestUrl, jugador, String.class);			
			logger.info("CHAVEZ CRUZ VICTOR ------------------- in saveCustomer(): Calling REST API " + crmRestUrl);
		} else {
			// update employee
			logger.info("CHAVEZ CRUZ VICTOR ------------------- in UPDATECustomer(): success");
			restTemplate.put(crmRestUrl, jugador);
		}

			
	}

	@Override

	public Deportistas getDeportista(int theId) {
		
		logger.info("CHAVEZ CRUZ VICTOR ------------------- in getCustomer(): Calling REST API " + crmRestUrl);

		// make REST call
		Deportistas jugador = 
				restTemplate.getForObject(crmRestUrl + "/" + theId, 
										  Deportistas.class);

		logger.info("CHAVEZ CRUZ VICTOR ------------------- in saveCustomer(): theCustomer=" + jugador);
		
		return jugador;
	}

	@Override

	public void deleteDeportista(int theId) {
		
		logger.info("CHAVEZ CRUZ VICTOR ------------------- in deleteCustomer(): Calling REST API " + crmRestUrl);

		// make REST call
		restTemplate.delete(crmRestUrl + "/" + theId);

		logger.info("CHAVEZ CRUZ VICTOR ------------------- in deleteCustomer(): deleted customer theId=" + theId);
	}
}





