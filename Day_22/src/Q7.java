import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> i = new ArrayList<>();
		i.add("a");
		i.add("b");
		
ListIterator<String> z = i.listIterator();
while(z.hasNext()) {
	System.out.print(z.next());
	z.previous();
}
	}

}
