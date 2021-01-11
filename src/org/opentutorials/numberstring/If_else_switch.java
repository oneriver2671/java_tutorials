package org.opentutorials.numberstring;

public class If_else_switch {

	public static void main(String[] args) {
		if(false) {
			System.out.println("result : true");
		}
		
		int score = 68;	
		if(score>=70) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		if(score>=90) {
			System.out.println("A등급");
		} else if(score>=80) {
			System.out.println("B등급");
		} else if(score>=70) {
			System.out.println("C등급");							
		}
		
		String id = args[0];
		String password = args[1];
		if(id.equals("egoing") && password.equals("111111")) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
			
		
		switch(4) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default");
		}
	
		int x = 2;
		if(x == 1) {
			System.out.println("one");
		} else if (x == 2) {
			System.out.println("two");
		} else if (x == 3) {
			System.out.println("three");			
		} 
		
		
	}
}
