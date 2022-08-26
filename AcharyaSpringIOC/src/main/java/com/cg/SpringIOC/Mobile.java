package com.cg.SpringIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
	ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");// defining the ioc container part
  //  Airtel a  = (Airtel)c.getBean("airtel");
   // a.data();
  //  a.calling();
 //  Jio j = c.getBean("jio",Jio.class);
  // j.data();
  // j.calling();
	Sim s = c.getBean("Sim",Sim.class);
	s.data();
	s.calling();
	}
}
