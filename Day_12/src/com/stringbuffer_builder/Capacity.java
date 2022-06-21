package com.stringbuffer_builder;

public class Capacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb=new StringBuffer();
System.out.println(sb.capacity());
sb.append("hello");
System.out.println(sb.capacity());
sb.append("java is my favourite language");
System.out.println(sb.capacity());
}

}
