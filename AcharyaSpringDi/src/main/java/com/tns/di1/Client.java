package com.tns.di1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		Student s1 =  c.getBean("student",Student.class);
		s1.cheating();
		
		AnotherStudent s2 =  c.getBean("student1",AnotherStudent.class);
		s2.startCheating();
	}

}
