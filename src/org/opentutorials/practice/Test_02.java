package org.opentutorials.practice;

	// �����ε� ����.


class Calculator {
	// ���簢���� ����
	double nemonemo(double width) {
		return width * width;
	}
	
	// ���簢���� ����
	double nemonemo(double width, double height) {
		double output;
		return output = width * height;
	}
}


public class Test_02 {
	public static void main(String[] args) {
		Calculator a = new Calculator();
		
		// ���簢���� ���� ���ϱ�
		double return1 = a.nemonemo(10);
		System.out.println("���簢���� ���� : " + return1);
		
		// ���簢���� ���� ���ϱ�
		double result2 = a.nemonemo(10.5, 20.3);
		System.out.println("���簢���� ���� : " + result2);
		
		
	}
}


