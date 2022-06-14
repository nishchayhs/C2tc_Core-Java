package day_9;

public class Cs12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int first = 5,second =20;

do {
	if(first++ > --second) {
		continue;
	}
	
}while(first<15);
System.out.println("first="+first+"and second ="+second);
	}

}
