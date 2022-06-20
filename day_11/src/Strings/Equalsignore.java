package Strings;

public class Equalsignore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="the walking dead";
String s2="the walking dead";
String s3="THE WALKING DEAD";
String s4="the WESTweeed";
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s1.equalsIgnoreCase(s3));
System.out.println(s1.equalsIgnoreCase(s4));
	}

}
