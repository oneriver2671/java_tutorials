package org.opentutorials.practice;

	// 오버로딩 연습.


class Calculator {
	// 정사각형의 넓이
	double nemonemo(double width) {
		return width * width;
	}
	
	// 직사각형의 넓이
	double nemonemo(double width, double height) {
		double output;
		return output = width * height;
	}
}


public class Test_02 {
	public static void main(String[] args) {
		Calculator a = new Calculator();
		
		// 정사각형의 넓이 구하기
		double return1 = a.nemonemo(10);
		System.out.println("정사각형의 넓이 : " + return1);
		
		// 직사각형의 넓이 구하기
		double result2 = a.nemonemo(10.5, 20.3);
		System.out.println("직사각형의 넓이 : " + result2);
		
		
	}
}


