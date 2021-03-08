package sec01.exam01;
import java.util.Calendar;

enum Week {
	SUNDAY, MONDAY, TUESDAY, WENDESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null;		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); 
		
		switch(week){
			case 1:
				today = Week.SUNDAY; break;
			case 2: 
				today = Week.MONDAY; break;
			case 3:
				today = Week.TUESDAY; break;
			case 4:
				today = Week.WENDESDAY; break;
			case 5:
				today = Week.THURSDAY; break;
			case 6:
				today = Week.FRIDAY; break;
			case 7:
				today = Week.SATURDAY; break;
		}
		System.out.println("���� ���� : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("��ȸ ���� ���Դϴ�. 4�ð��� �����սô�.");
		} else {
			System.out.println("�Ϸ� 7�ð� �̻� ��! �����սô�.");
		}
	}
}
