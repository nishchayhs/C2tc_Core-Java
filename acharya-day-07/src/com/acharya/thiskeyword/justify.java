package com.acharya.thiskeyword;
class student{
	void display() {
		System.out.println(this);
		System.out.println("in display method");
	}
}
public class justify {

	public static void main(String[] args) {
		student s1=new student();
		System.out.println(s1);
		s1.display();

	}

}
