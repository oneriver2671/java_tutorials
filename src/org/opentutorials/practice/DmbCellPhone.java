package org.opentutorials.practice;

class DmbCellPhone1 extends CellPhone {
	// 필드
	int channel;
	
	// 생성자 (매개변수가 있으므로, '기본 생성자'가 아님)
	DmbCellPhone1(String model, String color, int channel){
		this.model = model;			// 이 부분 조금 긴가민가. 
		this.color = color;
		this.channel = channel;
	}
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}

public class DmbCellPhone {
	public static void main(String[] args) {
		DmbCellPhone1 dmbCellPhone = new DmbCellPhone1("자바폰", "검정", 10);
		
		 // CellPhone 클래스로부터 상속받은 필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		
		// DmbCellPhone1 클래스의 필드
		System.out.println("채널: " + dmbCellPhone.channel);
		
		// CellPhone 클래스로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요?");
		dmbCellPhone.receiveVoice("안녕.. 오랜만이야.");
		dmbCellPhone.sendVoice("...누구시죠?");
		dmbCellPhone.receiveVoice("너의 이름은..!");
		dmbCellPhone.hangUp();
		
		// DmbCellPhone1 클래스의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(23);
		dmbCellPhone.turnOffDmb();
	}
}
