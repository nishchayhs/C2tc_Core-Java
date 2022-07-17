import java.util.*;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>i=new ArrayList<>();
i.add("a");
i.add("b");
Iterator<String> iy = i.iterator();
while(iy.hasNext())
{
	System.out.println(iy.next());
}
i.add("c");
	}

}
