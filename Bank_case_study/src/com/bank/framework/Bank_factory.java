package com.bank.framework;

public abstract class Bank_factory {
	public abstract Saving_ACC getNewPrimeAccount(int AccNo, String accNm, float accBal, boolean isSalaried);
	public abstract Current_ACC getNewNormalAccount(int AccNo, String accNm, float accBal,float creditLimit);
}
