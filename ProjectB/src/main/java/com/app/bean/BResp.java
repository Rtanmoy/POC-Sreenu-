package com.app.bean;

public class BResp {
private String status;
private String desc;
public BResp(String status, String desc) {
	super();
	this.status = status;
	this.desc = desc;
}
public BResp() {
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
	return "BResp [status=" + status + ", desc=" + desc + "]";
}

}
