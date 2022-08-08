package com.bank.framework;

public abstract class Bank_ACC {

private int accNo;
private String accNm;
private float accBal;
public Bank_ACC(int accNo, String accNm, float accBal) {
	super();
	this.accNo = accNo;
	this.accNm = accNm;
	this.accBal = accBal;
}
public void withdraw(float amount) {
	System.out.println("amount is withdrawn:"+ amount);
}
public void deposite(float amount) {
	System.out.println("amount is deposited:"+ amount);
}
public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getAccNm() {
	return accNm;
}
public void setAccNm(String accNm) {
	this.accNm = accNm;
}
public float getAccBal() {
	return accBal;
}
public void setAccBal(float accBal) {
	this.accBal = accBal;
}
@Override
public String toString() {
	return "Bank_ACC [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	
	
}
	
}
