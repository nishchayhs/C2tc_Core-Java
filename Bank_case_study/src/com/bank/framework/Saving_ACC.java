package com.bank.framework;

 public abstract class Saving_ACC extends Bank_ACC{
	 private boolean isSalaried;
	 private static final float MINBAL=0;
	public Saving_ACC(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	public void withdraw(boolean b) {
		System.out.println("is salaried : " + b);
		
	}
	public boolean isSalaried() {
		return isSalaried;
	}
	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
	public static float getMinbal() {
		return MINBAL;
		
	}
	@Override
	public String toString() {
		return "Saving_ACC [isSalaried=" + isSalaried +", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() +  "]";
	}
	
	
	
	
}
