package com.henryschain.loyalty.rewards.resource.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@XmlRootElement
public class CustomerRegRes {
	private String respCode;
	private String respMsg;
	private String status;
	private String refNum;
}
