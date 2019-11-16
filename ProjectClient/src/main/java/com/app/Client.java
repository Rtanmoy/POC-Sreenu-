package com.app;

import com.app.bean.AReq;
import com.app.bean.AResp;

public class Client {
public static void main(String[] args) {
	
	AReq areq=new AReq();
	areq.setOId(123);
	areq.setOName("Mobile");
	
	A a=new A();
	AResp aresp=a.getResp(areq);
	System.out.println(aresp);
}
}
