// 문자열 비교.
package sec01.exam01;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "원리버";
		String strVar2 = "원리버";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");			
		}
		
		String strVar3 = new String("원리버");
		String strVar4 = new String("원리버");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");			
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}
	}
}
