package org.opentutorials.practice;

class Calculator1 {
	double areaCircle(double r) {
		System.out.println("Calculator ��ü�� areaCircle() ����");
		return 3.14159 * r * r;
	}
		
}

class Computer extends Calculator1 {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;    // Math : �ڹ� ǥ�� API
	}
}

public class ComputerExample12 {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator1 calculator = new Calculator1();
		System.out.println("������ : " + calculator.areaCircle(r));
		System.out.println();    // �� �� ���
		
		Computer computer = new Computer();
		System.out.println("������ : " + computer.areaCircle(r));
		
	}
}