package com.henryschain.loyalty.rewards.resource.builder;

import com.henryschain.loyalty.rewards.process.model.CustomerRegProcessResp;
import com.henryschain.loyalty.rewards.resource.model.CustomerRegRes;

public class CustomerRegRespBuilder {
	
 public CustomerRegRes buildResponse(CustomerRegProcessResp presp) { 
	   
		CustomerRegRes resp=new CustomerRegRes();
		resp.setRespCode(presp.getRespCode());
		resp.setRefNum(presp.getRefNum());
		resp.setRespMsg(presp.getRespMsg());
		resp.setStatus(presp.getStatus());
	return resp;
	 
 }
}
