package com.henryschain.loyalty.rewards.dao.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerRegDAOReq {
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
