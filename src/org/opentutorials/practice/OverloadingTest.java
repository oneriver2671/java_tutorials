package org.opentutorials.practice;

class O {
	public void a(int param) {
		System.out.println("�������");
		System.out.println(param);
	}
	
	public void a(String param) {
		System.out.println("�������");
		System.out.println(param);
	}
}

public class OverloadingTest {
	public static void main(String[] args) {
		O o = new O();
		o.a(2);
		System.out.println("-------");
		o.a("two");
		
	}
}
