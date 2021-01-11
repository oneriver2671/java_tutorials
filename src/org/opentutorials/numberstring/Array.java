package org.opentutorials.numberstring;

public class Array {
	public static void numbering(int init, int limit) {
		for(int i = init; i <= limit; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		String classGroup[] = {"¾Æ°Ô·Î", "¼ÕÈï¹Î", "ÀÌ°íÀ×", "¸Ş½Ã"};
		System.out.println(classGroup[1]);
		
		String[] member = {"ÀåÇÑ°­", "¼ÕÈï¹Î", "±è´ö¹è"};
			for(int i = 0; i < member.length; i++) {
				System.out.println(member[i] + "´ÔÀÌ »ó´ãÀ» ¹Ş¾Ò½À´Ï´Ù.");
			}
			
			
			for (String e : member) {
				System.out.println(e + "´ÔÀÌ »ó´ãÀ» ¹Ş¾Ò½À´Ï´Ù.");
			}
			
			
		int[] scores = {67, 92, 84, 45, 75, 94, 64, 84, 81, 53};
			System.out.println(scores.length);
			
			int sum = 0;
			for(int x=0; x<10; x++) {
				sum += scores[x];
			}
			int avg = sum/10;
			System.out.println(avg);
			
			
			numbering(2, 5);
			
			
	}

	
}
