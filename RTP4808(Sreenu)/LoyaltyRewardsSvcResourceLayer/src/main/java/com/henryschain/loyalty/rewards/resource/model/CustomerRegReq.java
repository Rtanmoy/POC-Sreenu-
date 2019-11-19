package com.henryschain.loyalty.rewards.resource.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
@XmlRootElement
@Data
public class CustomerRegReq {
 private ClientDetails clientDetails;
 private CustomerDetails custDetails;
}
