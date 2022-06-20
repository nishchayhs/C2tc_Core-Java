package stringbuffer_builder;

public class Ensurecapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("hello");
		System.out.println(sb.capacity());
		sb.append("java is my fav lang");
		System.out.println(sb.capacity());
		sb.ensureCapacity(10);
		System.out.println(sb.capacity());
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());
		}

}
