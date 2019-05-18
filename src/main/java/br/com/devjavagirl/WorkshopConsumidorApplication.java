package br.com.devjavagirl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.devjavagirl.consumer.Consumer;

@SpringBootApplication
@ComponentScan(basePackageClasses = { Consumer.class })
@EnableAutoConfiguration
public class WorkshopConsumidorApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkshopConsumidorApplication.class, args);
	}

}
