package com.bank.application;

import com.bank.framework.Current_ACC;

public class MMCurrent_ACC extends Current_ACC {
	
	public MMCurrent_ACC(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}

	public void withdraw(float amount) {
		System.out.println("dear current account user amount withdrawn:" + getAccBal() + 
				 " and your creditLimit is :" + getCreditLimit());}
		@Override
		public String toString() {
			return "MMCurrent_ACC [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + "]";
		}

}
