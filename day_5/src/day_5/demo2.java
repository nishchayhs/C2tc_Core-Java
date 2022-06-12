package day_5;

 class Demo2 {
int rollno;
String name;
void insertRecord(int r,String n) {
rollno = r;
name = n;
}
void displayInformation() {
	System.out.println(rollno +" "+ name);

	}

}
class main{
public static void Main(String[] args) {
	// TODO Auto-generated method stub
Demo2 s1 = new Demo2();
Demo2 s2 = new Demo2();
s1.insertRecord(111, "karan");
s2.insertRecord(222, "aryan");
s1.displayIformation();
s2.displayIformation();
}

}
