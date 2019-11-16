package com.app.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ConsumerTest2 {
public static void main(String[] args) {
	String body="{\"empId\":202,\"empName\":\"tommy\",\"empSal\":24.48}";
	String url="http://localhost:7070/Spring5ProviderAppPart1/emp/data";
	HttpHeaders hds=new HttpHeaders();
	hds.add("Content-Type", "application/json");
	hds.add("Accept", "application/json");
	
	HttpEntity<String> he=new HttpEntity<>(body,hds);
	RestTemplate tr=new RestTemplate();
	ResponseEntity<String>re=tr.postForEntity(url, he, String.class);
	System.out.println(re.getBody());
	System.out.println(re.getStatusCode());
	System.out.println(re.getStatusCodeValue());
	System.out.println(re.toString());
}
}
