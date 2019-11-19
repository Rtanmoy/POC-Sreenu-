package com.henryschain.loyalty.rewards.process.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerRegProcessResp {
	private String respCode;
	private String respMsg;
	private String status;
	private String refNum;
}
