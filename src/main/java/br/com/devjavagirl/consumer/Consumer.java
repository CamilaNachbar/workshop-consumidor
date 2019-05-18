package br.com.devjavagirl.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.util.JSONPObject;

@Component
public class Consumer {

	 @JmsListener(destination = "workshop-mensageria")
	    public void receiveMessage(String message) {
	        System.out.println( message);
	    }
	
}
