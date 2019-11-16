package com.app;

import com.app.bean.BReq;
import com.app.bean.BResp;
import com.app.bean.CReq;
import com.app.bean.CResp;

public class B {
public BResp getRes(BReq breq) {
	CReq creq=new CReq();
	creq.setoId(breq.getOId());
	creq.setoName(breq.getOName());
	
	C c=new C();
	CResp cres=c.getRes(creq);
	
	BResp bresp=new BResp();
	bresp.setStatus(cres.getStatus());
	bresp.setDesc(cres.getDesc());
	
	return bresp;
	
	
}
}
