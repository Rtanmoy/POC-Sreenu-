package com.henryschain.loyalty.rewards.resource.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerRegRes {
	private String respCode;
	private String respMsg;
	private String status;
	private String refNum;
}
