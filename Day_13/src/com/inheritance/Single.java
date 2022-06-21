package com.inheritance;
class Cars{
	void engine() {
		System.out.println("engine");
	}
}
class Lightweight_Cars extends Cars{
	void petrol_engine()
	{
	System.out.println("petrol engine");
	}
}
public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Lightweight_Cars lc = new Lightweight_Cars();
lc.petrol_engine();
lc.engine();
	}

}

