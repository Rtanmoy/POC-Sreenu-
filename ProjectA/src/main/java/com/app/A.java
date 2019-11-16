package com.app;

import com.app.bean.AReq;
import com.app.bean.AResp;
import com.app.bean.BReq;
import com.app.bean.BResp;

public class A {
	public AResp getResp(AReq areq) {
		//1.get the req from client
		//2.prepare breq with the help of areq i.e areq-->breq
		BReq breq=new BReq();
		breq.setOId(areq.getOId());
		breq.setOName(areq.getOName());
		//3.call b and get the bresp
		B b=new B();
		BResp bresp=b.getRes(breq);
		//4.prepare AResp
		AResp aresp=new AResp();
		aresp.setStatus(bresp.getStatus());
		aresp.setDesc(bresp.getDesc());
		
		return aresp;
		
	}

}
