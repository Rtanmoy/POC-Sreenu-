package com.henryschain.loyalty.rewards.process.model;

import com.henryschain.loyalty.rewards.dao.model.CustomerRegDAOReq;

public class CustomerRegReqBuilder {
public CustomerRegDAOReq buildRequest(CustomerRegProcessReq custreq) {
	CustomerRegDAOReq daoreq=new CustomerRegDAOReq();
	daoreq.setClientId(custreq.getClientId());
	daoreq.setRequestId(custreq.getRequestId());
	daoreq.setFirstName(custreq.getFirstName());
	daoreq.setLastName(custreq.getLastName());
	daoreq.setEmailId(custreq.getEmailId());
	daoreq.setDob(custreq.getDob());
	daoreq.setOrganizationName(custreq.getOrganizationName());
	daoreq.setWebsite(custreq.getWebsite());
	daoreq.setPinCode(custreq.getPinCode());
	
	return daoreq;
	
}
}
