package org.opentutorials.practice;

public class Dog extends Animal {
	public Dog() {
		this.kind = "������";			// this. ������ �ٽ� �ؾ߰ڴ�.. �����ڵ�.
	}
	
	public void sound() {
		System.out.println("�۸�");
	}
}


class Cat extends Animal {
	public Cat() {
		this.kind = "������";
	}
	
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
}
