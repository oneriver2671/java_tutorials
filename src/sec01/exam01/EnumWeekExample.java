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
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("교회 가는 날입니다. 4시간은 공부합시다.");
		} else {
			System.out.println("하루 7시간 이상 꼭! 공부합시다.");
		}
	}
}
