// 주민등록번호에서 남자, 여자 구분하기.

package sec01.exam01;
public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "910102-1234567";
		char sex = ssn.charAt(7);
		
		switch(sex) {
		case 1 :
		case 3 :
			System.out.println("남자입니다."); break;
		case 2 :
		case 4 :
			System.out.println("여자입니다."); break;
		} 
	}
}
