package org.opentutorials.practice;
class DivideException extends Exception {
	DivideException(){
		super();
	}
	DivideException(String message){
		super(message);
	}
}

class CalculatorSecond {
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void divide() {
		try {
			if(right == 0) {
				throw new DivideException("0으로 나눌 수 없습니다.");
			} 
			System.out.print("계산결과는");
			System.out.print(this.left / this.right);
			System.out.print("입니다.");
		} catch(DivideException e) {
			e.printStackTrace();
		}
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		CalculatorSecond c1 = new CalculatorSecond();
		c1.setOprands(10, 0);
		try {
			c1.divide();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		c1.divide();
	}
}
