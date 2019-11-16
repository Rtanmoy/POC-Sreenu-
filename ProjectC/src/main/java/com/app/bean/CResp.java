package com.app.bean;


public class CResp {
private  String status;
private String desc;
public CResp() {
	super();
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getDesc() {
	return desc;
}

public void setDesc(String desc) {
	this.desc = desc;
}

@Override
public String toString() {
	return "CResp [status=" + status + ", desc=" + desc + "]";
}

}
