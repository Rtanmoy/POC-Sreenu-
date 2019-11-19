package com.henryschain.loyalty.rewards.dao;

import com.henryschain.loyalty.rewards.dao.model.CustomerRegDAOReq;
import com.henryschain.loyalty.rewards.dao.model.CustomerRegDAORes;
import com.henryschain.loyalty.rewards.dao.model.LoyaltyRewardsDAOReq;
import com.henryschain.loyalty.rewards.dao.model.LoyaltyRewardsDAORes;

public interface LoyaltyRewardsDAO {

	public LoyaltyRewardsDAORes getVendorDetails(LoyaltyRewardsDAOReq req);

	public CustomerRegDAORes getResponse(CustomerRegDAOReq daoreq);
}
