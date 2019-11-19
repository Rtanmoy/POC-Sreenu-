package com.henryschain.loyalty.rewards.process.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerRegProcessReq {
	private String clientId;
	private String requestId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String dob;
	private String address;
	private String website;
	private String organizationName;
	private String pinCode;
}
