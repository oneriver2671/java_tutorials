// ���ڿ� ��.
package sec01.exam01;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "������";
		String strVar2 = "������";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		} else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");			
		}
		
		String strVar3 = new String("������");
		String strVar4 = new String("������");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");
		} else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");			
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ������ ����");
		}
	}
}
