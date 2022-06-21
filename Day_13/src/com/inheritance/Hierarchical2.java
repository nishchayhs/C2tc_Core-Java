package com.inheritance;
class Vehicle{
	void numplates1()
	{
		System.out.println("all vehicles must have a num plate");
	}
}
class Karnataka extends Vehicle{
	void numplates2()
	{
		System.out.println("karnata vehicles nhum plates startes from KA");
		
	}
}
class Tamilnadu extends Vehicle{
	void numplates3()
	{
		System.out.println("tamilnadu's vehicles num plates starts from TN");
	}
}
public class Hierarchical2 {

	public static void main(String[] args) {
Vehicle v = new Vehicle();		
Karnataka k = new Karnataka();
Tamilnadu t = new Tamilnadu();
Vehicle a = new Karnataka();

k. numplates1();
k. numplates2();
t. numplates1();
t. numplates3();
v. numplates1();
a. numplates1();

	}

}
