package com.example.client;

import org.springframework.web.client.RestTemplate;

public class HelloClientMain {
	public static void main(String[] args) {
		RestTemplate rest = new RestTemplate();
		String greeting = rest.postForObject(
				"http://localhost:8080/hi", "Javier", String.class);
		
		System.out.println(greeting);

		
		Client response = rest.postForObject(
				"http://localhost:8080/hi-client-echo", 
				new Client("1", "Javier"), 
				Client.class);
		
		System.out.println(response);
	}
}
