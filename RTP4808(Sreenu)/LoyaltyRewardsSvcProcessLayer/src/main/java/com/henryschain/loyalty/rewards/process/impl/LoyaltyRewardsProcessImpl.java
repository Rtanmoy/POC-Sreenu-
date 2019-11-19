package com.henryschain.loyalty.rewards.process.impl;

import com.henryschain.loyalty.rewards.dao.LoyaltyRewardsDAO;
import com.henryschain.loyalty.rewards.dao.impl.LoyaltyRewardsDAOImpl;
import com.henryschain.loyalty.rewards.dao.model.CustomerRegDAOReq;
import com.henryschain.loyalty.rewards.dao.model.CustomerRegDAORes;
import com.henryschain.loyalty.rewards.process.LoyaltyRewardsProcess;
import com.henryschain.loyalty.rewards.process.model.CustomerRegProcessReq;
import com.henryschain.loyalty.rewards.process.model.CustomerRegProcessResp;
import com.henryschain.loyalty.rewards.process.model.CustomerRegReqBuilder;
import com.henryschain.loyalty.rewards.process.model.LoyaltyRewardsProcessReq;

public class LoyaltyRewardsProcessImpl implements LoyaltyRewardsProcess {
	
	public CustomerRegProcessResp registration(CustomerRegProcessReq custreq) {
		CustomerRegReqBuilder crrb=new CustomerRegReqBuilder();
		CustomerRegDAOReq daoreq=crrb.buildRequest(custreq);
		
		 
		LoyaltyRewardsDAO dao=new LoyaltyRewardsDAOImpl();
		CustomerRegDAORes daoresp=dao.getResponse(daoreq);
		CustomerRegProcessResp presp=new CustomerRegProcessResp();
		presp.setRespCode(daoresp.getRespCode());
		presp.setRefNum(daoresp.getRefNum());
		presp.setRespMsg(daoresp.getRespMsg());
		presp.setStatus(daoresp.getStatus());
		
		
		return presp;
		
	}

	public LoyaltyRewardsProcessReq getVendorDetails(LoyaltyRewardsProcessReq req) {
		// TODO Auto-generated method stub
		return null;
	}

}
