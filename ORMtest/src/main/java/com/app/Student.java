package com.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stdtab")
public class Student {
	@Id
	@GeneratedValue
	@Column(name="sid")
	private int stdId;
	@Column(name="sname")
	private String stdName;
	@Column(name="sfee")
	private double stdFee;
	public Student() {
		super();
	}
	public Student(int stdId, String stdName, double stdFee) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdFee = stdFee;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public double getStdFee() {
		return stdFee;
	}
	public void setStdFee(double stdFee) {
		this.stdFee = stdFee;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdFee=" + stdFee + "]";
	}

}
