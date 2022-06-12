package day_07;

public class demo1 {
int id;
String name;
float salary;
demo1(){
	System.out.println("user defined no-argumet"+"constructor executed");
}
void display() {
	System.out.println(id+""+name+""+salary);
	}
}
public class Main{
	public static void main(String[] args) {
		demo1 e1 = new demo1();
		demo1 e2 = new demo1();
		e1.display();
		e2.display();
		
	}
}

public class demo2 {
int id;
String name;
float salary;
demo2(int id, String name, float salary){
	System.out.println("user defined no-argument"+"constructor executed");
}
void display() {
	System.out.println(id+""+name+""+salary);
}

	public static void main(String[] args) {
		demo2 e1 = new demo2(101,"ajeeth",45000);
		demo2 e2 = new demo2(102,"ifran",45767);
		demo2 e3 = new demo2(103,"nakul",55000);
		e1.display();
		e2.display();
		e3.display();
	}

}
