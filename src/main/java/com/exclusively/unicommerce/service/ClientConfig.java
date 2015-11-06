package com.exclusively.unicommerce.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ClientConfig {

	@Bean
	public Jaxb2Marshaller marshaller() 
	{
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.unicommerce.wsdl");
		return marshaller;
	}
		
	@Bean
	public SaleOrderClient saleorderclient(Jaxb2Marshaller marshaller) {
		SaleOrderClient client = new SaleOrderClient();
		client.setDefaultUri("https://exclusively.unicommerce.com/services/soap/?version=1.6");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

	
}