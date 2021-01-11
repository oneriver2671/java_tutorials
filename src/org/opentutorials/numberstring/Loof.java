package org.opentutorials.numberstring;

public class Loof {
	public static void main(String[] args) {
		
		int i = 1; int sum = 0;
		while(i<=100) {
			sum += i++;
		}
		System.out.println(sum);
		
		for (int j = 1; j < 10; j++) {
			if (j == 5)
				continue;
			System.out.println("Hello World " + j);
		}

	
		
	}
}