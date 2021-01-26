package org.opentutorials.numberstring;

//class C1{
//	static int static_variable = 1;
//	int instance_variable = 2;
//	static void static_static() {    // 클래스 메소드가 클래스 변수를 호출할 때.
//		System.out.println(static_variable);
//	
//	}
//	
//}
//
//class Calculator{
//	static double PI = 3.14;    
//	int Left, Right;   
//	
//	public void setOprands(int left, int right) {
//		int Left;
//		int Right;
//		int PI;
//	}
//}

//public class ObjectPractice {
//		static int i = 0;
//		public static void a() {
//			int i = 0;
//			double PI;
//	}
//	
//	public static void main(String[] args) {
//		for(i = 0; i < 5; i++) {
//			a();
//			System.out.println(i);
//			System.out.println(PI);
//		} 
//	}
//}
//class C{
//	int v = 10;
//	public void m() {
//		int v = 20;
//		System.out.println(v);
//	}
//}
//
//public class ObjectPractice{
//
//	public static void main(String[] args) {
//		C c1 = new C();
//		c1.m();
//	}
//}

//         			**** 오버로딩 공부 ****
class Calculator{
	int left, right;
	int third = 10;
	int arg;
	
	public void setOprands(int left, int right) {
		System.out.println("setOprands(int left, int right)");
		this.left = left;
		this.right = right;
		arg = 2;
	}
	public void setOprands(int left, int right, int third) {
		System.out.println("setOprands(int left, int right, int third)");
		this.left = left;
		this.right = right;
		this.third = third;
		arg = 3;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + this.third);
	}
	
	public void avg() {
		if(arg == 2) {
			System.out.println((this.left + this.right)/arg);
		}else {System.out.println((this.left+this.right+this.third)/arg);
			}
		
	}
}

public class ObjectPractice {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10,20);
		c1.sum();
		c1.avg();
		c1.setOprands(10,20,30);
		c1.sum();
		c1.avg();
	}
}
	








