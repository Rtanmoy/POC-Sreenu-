package com.henryschain.loyalty.rewards.resource.model;

import lombok.Data;

@Data
public class CustomerRegReq {
 private ClientDetails clientDetails;
 private CustomerDetails custDetails;
}
