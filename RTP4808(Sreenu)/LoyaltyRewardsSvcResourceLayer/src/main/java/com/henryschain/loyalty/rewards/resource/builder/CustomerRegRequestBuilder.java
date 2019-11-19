package com.henryschain.loyalty.rewards.resource.builder;

import com.henryschain.loyalty.rewards.process.model.CustomerRegProcessReq;
import com.henryschain.loyalty.rewards.resource.model.CustomerRegReq;

public class CustomerRegRequestBuilder {
 public CustomerRegProcessReq buildResisterProcessReq(CustomerRegReq custreq) {
	    CustomerRegProcessReq processreq=new CustomerRegProcessReq();
		processreq.setClientId(custreq.getClientDetails().getClientId());
		processreq.setRequestId(custreq.getClientDetails().getRequestId());
		processreq.setFirstName(custreq.getCustDetails().getFirstName());
		processreq.setLastName(custreq.getCustDetails().getLastName());
		processreq.setEmailId(custreq.getCustDetails().getEmailId());
		processreq.setDob(custreq.getCustDetails().getDob());
		processreq.setOrganizationName(custreq.getCustDetails().getOrganizationName());
		processreq.setWebsite(custreq.getCustDetails().getWebsite());
		processreq.setPinCode(custreq.getCustDetails().getPinCode());

	return processreq ;
	 
 }
}
