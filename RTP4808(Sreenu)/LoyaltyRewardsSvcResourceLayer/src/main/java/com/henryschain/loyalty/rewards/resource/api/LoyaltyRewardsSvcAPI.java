package com.henryschain.loyalty.rewards.resource.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.henryschain.loyalty.rewards.process.LoyaltyRewardsProcess;
import com.henryschain.loyalty.rewards.process.impl.LoyaltyRewardsProcessImpl;
import com.henryschain.loyalty.rewards.process.model.CustomerRegProcessReq;
import com.henryschain.loyalty.rewards.process.model.CustomerRegProcessResp;
import com.henryschain.loyalty.rewards.resource.builder.CustomerRegRequestBuilder;
import com.henryschain.loyalty.rewards.resource.builder.CustomerRegRespBuilder;
import com.henryschain.loyalty.rewards.resource.model.CustomerRegReq;
import com.henryschain.loyalty.rewards.resource.model.CustomerRegRes;
import com.henryschain.loyalty.rewards.resource.model.LoyaltyRewardsSvcReq;
import com.henryschain.loyalty.rewards.resource.model.LoyaltyRewardsSvcRes;
@Path("/loyalty")
public class LoyaltyRewardsSvcAPI {
	@POST
	@Path("/registration")
	@Consumes("application/json")
	@Produces("application/json")
	public CustomerRegRes registration(CustomerRegReq custreq) {
		
	//1.Get the	
	CustomerRegRequestBuilder processreq=new CustomerRegRequestBuilder();	
	CustomerRegProcessReq proreq=processreq.buildResisterProcessReq(custreq);
	
	LoyaltyRewardsProcess  res=new LoyaltyRewardsProcessImpl();
	CustomerRegProcessResp pres=res.registration(proreq);
	CustomerRegRespBuilder builder=new CustomerRegRespBuilder();
	CustomerRegRes resp=builder.buildResponse(pres);
	
	return resp;
		
	}
 
 public LoyaltyRewardsSvcRes getVendorDetails(LoyaltyRewardsSvcReq req) {
	return null;
	 
 }
}
