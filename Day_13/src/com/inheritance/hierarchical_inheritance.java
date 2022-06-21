package com.inheritance;
class p{
	int parentvariable = 5;
}
class c1 extends p{
	int childvariable = 1;
}
class c2 extends p{
	int childvariable = 2;
}
class c3 extends p{
	int childvariable = 3;
}
public class hierarchical_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
c1 child1 = new c1  ();
c2 child2 = new c2  ();
c3 child3 = new c3  ();
System.out.println("parent variable + child variable of child1 = " + (child1.parentvariable +child1.childvariable));
System.out.println("parent variable + child variable of child2 = " + (child2.parentvariable +child2.childvariable));
System.out.println("parent variable + child variable of child3 = " + (child3.parentvariable +child3.childvariable));


	}

}
