package com.tns.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		Student s1 = c.getBean("student", Student.class);
		s1.display();
		
		Student s2 = c.getBean("student1", Student.class);
		s2.display();
	}

}
//<!-- bean definitions here -->
//<bean id = "student" class="com.tns.di.Student">
//<property name = "name" value="nishchay"/>
//<property name = "id" value="414"/>
//</bean>

//<bean id = "student1" class="com.tns.di.Student">
//<property name = "name" value="navneeth"/>
//<property name = "id" value="415"/>
//</bean>