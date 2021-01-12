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
		String[] members = {"ÀåÇÑ°­", "¼ÕÈï¹Î", "±è´ö¹è"};
		return members;
	}
	
	
	public static void main(String[] args) {
		String result = numbers(3, 7);
		System.out.println(result);
		
		String[] members = getMembers();
		
			
		int[] grade = new int[10];
		grade[0] = 94;
		grade[1] = 47;
		grade[2] = 87;
		grade[3] = 78;
		grade[4] = 91;
		grade[5] = 30;
		grade[6] = 45;
		grade[7] = 52;
		grade[8] = 60;
		grade[9] = 71;
		
		int sum = 0;
		for(int i=0; i<8; i++) {
			sum += grade[i];
		}
		System.out.println(sum);
		
		
		for(int e : grade) {
			System.out.println(e + "Á¡ÀÔ´Ï´Ù.");
		}
		
		System.out.println(args.length);
		
		
		
			
	}

	
}
