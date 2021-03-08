package sec01.exam01;
class SmartPhone {
	private String company;
	private String os;

	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	@Override 	// toString 재정의.
	public String toString() {
		return company + "," + os;
	}	
}

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();    // 재정의된 toString 호출.
		System.out.println(strObj);
		System.out.println(myPhone);	// 매개값으로 '객체'를 준 case.
		// 결과는 둘 다 똑같이 출력됨.
		
	}
}
