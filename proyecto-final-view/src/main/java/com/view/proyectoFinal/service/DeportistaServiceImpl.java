package com.view.proyectoFinal.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.view.proyectoFinal.entity.Deportistas;

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
		logger.info("CHAVEZ CRUZ VICTOR ------------------- in getDeportista(): Calling REST API " + crmRestUrl);

		ResponseEntity<List<Deportistas>> responseEntity = restTemplate.exchange(crmRestUrl, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Deportistas>>() {
				});
		List<Deportistas> deportistas = responseEntity.getBody();

		logger.info("CHAVEZ CRUZ VICTOR ------------------- in getDeportista(): deportista" + deportistas);

		return deportistas;

	}

	@Override
	public void saveDeportista(Deportistas jugador) {
		int jugadorId = jugador.getId();
		// realiza la llamada al REST
		if (jugadorId == 0) {
			// AGREGA UN DEPORTISTA
			restTemplate.postForEntity(crmRestUrl, jugador, String.class);
			logger.info("CHAVEZ CRUZ VICTOR ------------------- en saveDeportista(): Calling REST API " + crmRestUrl);
		} else {
			// ACTUALIZA LA INFORMACION DEL DEPORTISTA
			logger.info("CHAVEZ CRUZ VICTOR ------------------- en UPDATEDeportista(): ha sido de manera exitosa");
			restTemplate.put(crmRestUrl, jugador);
		}

	}

	@Override
	public Deportistas getDeportista(int theId) {

		logger.info("CHAVEZ CRUZ VICTOR ------------------- in getDeportista(): Calling REST API " + crmRestUrl);

		// make REST call
		Deportistas jugador = restTemplate.getForObject(crmRestUrl + "/" + theId, Deportistas.class);

		logger.info("CHAVEZ CRUZ VICTOR ------------------- in saveDeportista(): theDeportista=" + jugador);

		return jugador;
	}

	@Override
	public void deleteDeportista(int theId) {
		logger.info("CHAVEZ CRUZ VICTOR ------------------- en deleteDeportista(): Calling REST API " + crmRestUrl);
		// llama a la aplicacion REST
		restTemplate.delete(crmRestUrl + "/" + theId);
		logger.info("CHAVEZ CRUZ VICTOR ------------------- in deleteDeportistas(): delete Deportista theId=" + theId);
	}
}
