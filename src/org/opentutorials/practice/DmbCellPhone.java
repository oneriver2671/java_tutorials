package org.opentutorials.practice;

class DmbCellPhone1 extends CellPhone {
	// �ʵ�
	int channel;
	
	// ������ (�Ű������� �����Ƿ�, '�⺻ ������'�� �ƴ�)
	DmbCellPhone1(String model, String color, int channel){
		this.model = model;			// �� �κ� ���� �䰡�ΰ�. 
		this.color = color;
		this.channel = channel;
	}
	
	// �޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}

public class DmbCellPhone {
	public static void main(String[] args) {
		DmbCellPhone1 dmbCellPhone = new DmbCellPhone1("�ڹ���", "����", 10);
		
		 // CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("��: " + dmbCellPhone.model);
		System.out.println("����: " + dmbCellPhone.color);
		
		// DmbCellPhone1 Ŭ������ �ʵ�
		System.out.println("ä��: " + dmbCellPhone.channel);
		
		// CellPhone Ŭ�����κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������?");
		dmbCellPhone.receiveVoice("�ȳ�.. �������̾�.");
		dmbCellPhone.sendVoice("...��������?");
		dmbCellPhone.receiveVoice("���� �̸���..!");
		dmbCellPhone.hangUp();
		
		// DmbCellPhone1 Ŭ������ �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(23);
		dmbCellPhone.turnOffDmb();
	}
}
