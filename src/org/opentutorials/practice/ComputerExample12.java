package org.opentutorials.practice;

class Calculator1 {
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
		
}

class Computer extends Calculator1 {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;    // Math : 자바 표준 API
	}
}

public class ComputerExample12 {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator1 calculator = new Calculator1();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();    // 한 줄 띄기
		
		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(r));
		
	}
}