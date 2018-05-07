package com.cheney.thinker.webservice;

import javax.xml.ws.Endpoint;

import com.cheney.thinker.webservice.service.impl.CheneyThinkerWebServiceImpl;

public class CheneyThinkerWebServiceApplication {
	
	private static final String CHENEY_THINKER_WEB_SERVICE_ADDRESS = "http://localhost:8080/CheneyThinker";
	
	public static void main(String[] args) {
		Endpoint.publish(CHENEY_THINKER_WEB_SERVICE_ADDRESS, new CheneyThinkerWebServiceImpl());
		System.err.println("CheneyThinkerWebServiceApplication is Running!");
	}

}
