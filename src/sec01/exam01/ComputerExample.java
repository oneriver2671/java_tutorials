// 매개 변수의 갯수를 모를 경우. (혼공자 예시)

package sec01.exam01;
public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1: " + result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});   // 여기서도 쓰네?? 
		System.out.println("result2: " + result2);
	
	}
}


