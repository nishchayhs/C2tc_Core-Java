package com.Strings;

public class ttest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="this is last index of example";
int index = str.lastIndexOf("last");
System.out.println(index);
index=str.lastIndexOf("of",25);
index=str.lastIndexOf("of",10);
System.out.println(index);
	}

}
