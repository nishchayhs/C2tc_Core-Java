package com.bank.application;

import com.bank.framework.Saving_ACC;

public class MMSaving_ACC extends Saving_ACC {
	private static final float MINBAL= 1000.0f;
	public MMSaving_ACC(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo,accNm,accBal,isSalaried);}
		public void withdraw(float amount ) {
			System.out.println(" dear saving account user amount withdrawn: "+amount );
			}
			@Override
			public String toString() {
				return "Saving_ACC [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
						+ hashCode() + "]";
		}
	}
	


