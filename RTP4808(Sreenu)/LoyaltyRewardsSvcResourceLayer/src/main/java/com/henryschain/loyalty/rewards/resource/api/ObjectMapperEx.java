package com.henryschain.loyalty.rewards.resource.api;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.henryschain.loyalty.rewards.resource.model.ClientDetails;
import com.henryschain.loyalty.rewards.resource.model.CustomerDetails;
import com.henryschain.loyalty.rewards.resource.model.CustomerRegReq;
import com.henryschain.loyalty.rewards.resource.model.CustomerRegRes;

public class ObjectMapperEx {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		CustomerDetails cust=new CustomerDetails();
		cust.setFirstName("A");
		cust.setLastName("B");
		cust.setEmailId("rtan@gamil.com");
		cust.setDob("13/45");
		cust.setAddress("HYD");
		cust.setPinCode("500038");
		cust.setOrganizationName("sreenutech");
		cust.setWebsite("ww.com");
		
		ClientDetails cl=new ClientDetails();
		cl.setClientId("43r");
		cl.setRequestId("r75645");
		
		CustomerRegReq cq=new CustomerRegReq();
		cq.setClientDetails(cl);
		cq.setCustDetails(cust);
		
		LoyaltyRewardsSvcAPI l=new LoyaltyRewardsSvcAPI();
		CustomerRegRes res=l.registration(cq);
		ObjectMapper om=new ObjectMapper();
		String json=om.defaultPrettyPrintingWriter().writeValueAsString(res);
		System.out.println(json);

	}
}
