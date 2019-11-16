package com.app.bean;

public class CReq {
private Integer oId;
private String oName;
public CReq() {
	super();
}
public Integer getoId() {
	return oId;
}
public void setoId(Integer oId) {
	this.oId = oId;
}
public String getoName() {
	return oName;
}
public void setoName(String oName) {
	this.oName = oName;
}
@Override
public String toString() {
	return "CReq [oId=" + oId + ", oName=" + oName + "]";
}

}
