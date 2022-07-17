import java.util.ArrayList;
import java.util.List;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>one = new ArrayList<>();
one.add("abc");
List<String>two = new ArrayList<>();
two.add("add");
if(one == two) {
	System.out.println("A");
	
}
else if(one.equals(two)) {
	System.out.println("B");
	
}
else {
	System.out.println("C");

}
	}

}
