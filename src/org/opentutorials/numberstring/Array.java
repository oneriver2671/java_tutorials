package org.opentutorials.numberstring;

public class Array {
	public static void numbering(int init, int limit) {
		for(int i = init; i <= limit; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		String classGroup[] = {"�ưԷ�", "�����", "�̰���", "�޽�"};
		System.out.println(classGroup[1]);
		
		String[] member = {"���Ѱ�", "�����", "�����"};
			for(int i = 0; i < member.length; i++) {
				System.out.println(member[i] + "���� ����� �޾ҽ��ϴ�.");
			}
			
			
			for (String e : member) {
				System.out.println(e + "���� ����� �޾ҽ��ϴ�.");
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
