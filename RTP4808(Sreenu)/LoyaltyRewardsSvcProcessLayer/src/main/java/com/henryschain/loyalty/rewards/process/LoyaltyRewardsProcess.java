package com.henryschain.loyalty.rewards.process;

import com.henryschain.loyalty.rewards.process.model.CustomerRegProcessReq;
import com.henryschain.loyalty.rewards.process.model.CustomerRegProcessResp;
import com.henryschain.loyalty.rewards.process.model.LoyaltyRewardsProcessReq;

public interface LoyaltyRewardsProcess {
 public LoyaltyRewardsProcessReq getVendorDetails(LoyaltyRewardsProcessReq req);

public CustomerRegProcessResp registration(CustomerRegProcessReq proreq);

}
