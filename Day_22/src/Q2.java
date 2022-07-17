import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>list = new ArrayList<>();
  list.add("bannana");
  list.add("apple");
Iterator itr = list.iterator();
Collections.sort(list);
while(itr.hasNext()) {
	System.out.print(itr.next()+" ");
}
	}

}
