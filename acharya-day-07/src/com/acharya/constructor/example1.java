package com.acharya.constructor;
class employee{
	int id;
	String name;
	float salary;
	public employee(int i, String n, float s) {
		id=i;
	    name=n;
	    salary=s;
	}
	void display() {
		System.out.println(id+""+name+""+salary);
	}
	
}
public class example1 {
	public static void main(String[] args) {
		employee e1 = new  employee(111,"NISHCHAY",5000f);
employee e2 = new  employee(222,"NAVNEETH",5000f);
employee e3 = new employee(333,"vishma",6000f);
e1.display();
e2.display();
e3.display();	}

}
