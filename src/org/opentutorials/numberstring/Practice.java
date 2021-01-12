package org.opentutorials.numberstring;

public class Practice {

	public static String[] aboutMembers() {
		String[] members = {"¼ÕÈï¹Î", "ÀåÇÑ°­", "±è´ö¹è"};
		return members;
	}
	
	
	
	public static String numbering(int x, int y) {
		String output = "";
		for(int i = x; i <= y; i++) {
			output += i;
		}
		return output;
	}
		
	
	
	public static void main(String[] args) {
		String result = numbering(1, 10);
		System.out.println(result);

		String[] soccerMember = aboutMembers();
		System.out.println(soccerMember[1]);
		
		
		

	}

}
