package org.opentutorials.numberstring;

public class Array {
	public static String numbers(int x, int y) {
		String output = "";
		for(int i = x; i <= y; i++) {
			output += i;
		}
		return output;
		}
	
	public static String[] getMembers() {
		String[] members = {"���Ѱ�", "�����", "�����"};
		return members;
	}
	
	
	public static void sum(int left, int right, int middle) {
		System.out.println(left + right + middle);
	}
	
	
	public static void main(String[] args) {
		String result = numbers(3, 7);
		System.out.println(result);
		
		String[] members = getMembers();
		
		sum(30, 40, 50);
		sum(10, 20, 90);
		
		
		
		
		
		int[] grade = {72, 45, 81, 93, 91, 87, 75, 66, 48, 52};
		
		for(int i : grade) {
			if(i == 75) {
				break;
			}
			System.out.println(i + "���Դϴ�.");
		}
		
		for(int i = 2; i <= 9; i++) {
			System.out.println("****" + i + "���Դϴ�.****");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + " = " + i*j);
			}
		}
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}		
		System.out.println("1���� 100������ ��");
		System.out.println(sum);
		
		
		int sum1 = 0;
		int i = 1;
		while(i <= 100) {
			sum1 += i;
			i++;
		}
		System.out.println(sum1);
	
	
		
	}

	
}
