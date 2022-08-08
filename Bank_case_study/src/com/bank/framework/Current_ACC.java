package com.bank.framework;

public abstract class Current_ACC extends Bank_ACC {
     private final float creditLimit;

	public Current_ACC(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	public void withdraw(float amount) {
		System.out.println("amount is withdrawn : " + amount);
	}
	public float getCreditLimit() {
		return creditLimit;
	}
	@Override
	public String toString() {
		return "Current_ACC [creditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	}
	
	
	

