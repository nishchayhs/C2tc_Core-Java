import java.util.Scanner;

public class Main 
{

public static void main(String[]
args){

Scanner s = new Scanner(System.in);

String title = s.nextLine();

Mymovie m = new Mymovie();

m.setTitle(title);

System.out.println("The title is:"+m.getTitle());

}

}