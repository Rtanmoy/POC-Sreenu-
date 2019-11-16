package com.app.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ConsumerTest {
public static void main(String[] args) {
	
	RestTemplate rt=new RestTemplate();
	String str="http://localhost:7070/Spring5ProviderAppPart1/emp/show";
	ResponseEntity<String> entity=rt.getForEntity(str, String.class);
	System.out.println(entity.getBody());
	System.out.println(entity.getStatusCode());
	System.out.println(entity.getStatusCodeValue());
	System.out.println(entity.toString());
}
}
