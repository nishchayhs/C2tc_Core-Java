package com.inheritance;
class Cars1{
	void engine() {
		System.out.println("engine");
	}
}
class Lightweight_Cars1 extends Cars1{
	void petrol_engine()
	{
	System.out.println("petrol engine");
	}
}
class Heavyweight_cars extends Lightweight_Cars{
	void diesel_engine()
	{
		System.out.println("diesel engine");
	}
}
public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heavyweight_cars hc = new Heavyweight_cars();
		hc.diesel_engine();
		hc.petrol_engine();

	}

}
