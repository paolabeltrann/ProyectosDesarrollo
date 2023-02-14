package com.recuento.demo;

import java.io.IOException;
import org.json.JSONException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecuentoSpringBootApplication {

	public static void main(String[] args)  throws IOException, JSONException  {
		SpringApplication.run(RecuentoSpringBootApplication.class, args);
	}

}
