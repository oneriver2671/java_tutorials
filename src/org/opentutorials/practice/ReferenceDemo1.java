package org.opentutorials.practice;
class V {
	public int id;
	V(int id){
		this.id = id;
	}
}

public class ReferenceDemo1 {
	public static void runValue() {
		int a = 1;
		int b = a;
		b = 2;
		System.out.println(a);
	}
	
	public static void runReference() {
		V v = new V(3);
		V w = v;
		// w = new V(2);   중간에 이게 끼면 v.id는 3이 출력됨.
		w.id = 2;		// 이게 없으면 v.id는 3이 출력됨. 
		System.out.println(v.id);
	}
	
	public static void main(String[] args) {
		runValue();
		runReference();
	}
}
