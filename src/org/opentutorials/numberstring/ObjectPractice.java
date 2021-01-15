package org.opentutorials.numberstring;

class Calculator{
	static double PI = 3.14;
	static int base = 0;
	int Left, Right;
	
	public void setOprands(int left, int right) {
		Left = left;
		Right = right;
	}
	
	public void sum() {
		System.out.println(Left + Right + base);
	}
	
	public void avg() {
		System.out.println((Left + Right + base)/3);
	}
	
}

public class ObjectPractice {
	public static void main(String[] args) {
		
		 Calculator c1 = new Calculator();
		 c1.setOprands(20, 40);
		 c1.sum();
		 
		 Calculator.base = 10;
		 c1.sum();
		 
		 Calculator c2 = new Calculator();
	
		
	}

}
