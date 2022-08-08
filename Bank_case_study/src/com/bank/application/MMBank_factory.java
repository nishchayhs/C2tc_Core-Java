package com.bank.application;


import com.bank.framework.Bank_factory;
import com.bank.framework.Current_ACC;
import com.bank.framework.Saving_ACC;

public class MMBank_factory extends Bank_factory {

	@Override
	public Saving_ACC getNewPrimeAccount(int AccNo, String accNm, float accBal, boolean isSalaried) {
			MMSaving_ACC mmsaving = new MMSaving_ACC(AccNo,accNm,accBal,isSalaried);
		return mmsaving;
	}

	@Override
	public Current_ACC getNewNormalAccount(int AccNo, String accNm, float accBal, float creditLimit) {
		MMCurrent_ACC mmcurrent = new MMCurrent_ACC(AccNo,accNm,accBal,creditLimit);
		return mmcurrent;
	}
}
