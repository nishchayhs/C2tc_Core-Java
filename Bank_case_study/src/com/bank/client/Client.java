package com.bank.client;

import com.bank.application.MMBank_factory;
import com.bank.application.MMCurrent_ACC;
import com.bank.application.MMSaving_ACC;
import com.bank.framework.Bank_ACC;
import com.bank.framework.Bank_factory;
import com.bank.framework.Current_ACC;
import com.bank.framework.Saving_ACC;

public class Client {

	public static void main(String[] args) {
		Bank_factory bf =new MMBank_factory();

		Saving_ACC sa = new MMSaving_ACC(123456,"NISHCHAY",5000,true);
			
		Current_ACC ca = new MMCurrent_ACC(654321,"NAVNEETH",5000,6000);
		
				
		sa.withdraw(sa.getAccBal());
		sa.toString();
		
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
		
		
	
			
			
		

	}

	
	}


