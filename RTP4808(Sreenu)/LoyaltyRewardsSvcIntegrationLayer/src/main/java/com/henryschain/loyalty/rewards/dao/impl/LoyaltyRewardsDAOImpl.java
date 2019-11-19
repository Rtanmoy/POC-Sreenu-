package com.henryschain.loyalty.rewards.dao.impl;

import com.henryschain.loyalty.rewards.dao.LoyaltyRewardsDAO;
import com.henryschain.loyalty.rewards.dao.model.CustomerRegDAOReq;
import com.henryschain.loyalty.rewards.dao.model.CustomerRegDAORes;
import com.henryschain.loyalty.rewards.dao.model.LoyaltyRewardsDAOReq;
import com.henryschain.loyalty.rewards.dao.model.LoyaltyRewardsDAORes;

public class LoyaltyRewardsDAOImpl implements LoyaltyRewardsDAO {
	
	public CustomerRegDAORes getResponse(CustomerRegDAOReq req) {
		CustomerRegDAORes daores=new CustomerRegDAORes();
		daores.setRespCode("Rf009");
		daores.setRefNum("F435t");
		daores.setRespMsg("OK");
		daores.setStatus("good");
		return daores;
		
	}

	public LoyaltyRewardsDAORes getVendorDetails(LoyaltyRewardsDAOReq req) {
		// TODO Auto-generated method stub
		return null;
	}

}
