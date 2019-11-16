package com.app;

import com.app.bean.CReq;
import com.app.bean.CResp;

public class C {
	public CResp getRes(CReq creq) {
		
		
		CResp res=new CResp();
		res.setStatus("delivered");
		res.setDesc("good");
		
		
		
		return res;
	}

}
