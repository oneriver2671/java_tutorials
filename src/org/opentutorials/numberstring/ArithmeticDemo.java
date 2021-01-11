package org.opentutorials.numberstring;

public class ArithmeticDemo {

	public static void main(String[] args) {
		
//		int result = 1 +2;
//		System.out.println(result);
//		result = result + 1;
//		System.out.println(result);
		
//		int a = 10;
//		int b = 3;
//		float c = 10.0F;
//		float d = 3.0F;
//		
//		System.out.println(a/b);
//		System.out.println(c/d);
//		System.out.println(a/d);
//		
		int i = 3;
		i++;
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);
		System.out.println("-------------------------");
		
		int x = 10;
		int z;
		
		System.out.println("x=" + x);
		z = ++x;
		System.out.println("z=" + z);
		z = x++;
		z = x;
		System.out.println("z=" + z);
		
		int a = 4-3*6;
		System.out.println(a);
		
		System.out.println("Hello" == "Hello");
		System.out.println("Hello" .equals("Hello"));
		String c = "Hello world"; String d = new String("Hello world");
		System.out.println(c == d);
		System.out.println(c .equals(d));

	}
}
