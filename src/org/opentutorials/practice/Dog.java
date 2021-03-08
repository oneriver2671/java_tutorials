package org.opentutorials.practice;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";			// this. 공부좀 다시 해야겠다.. 생성자도.
	}
	
	public void sound() {
		System.out.println("멍멍");
	}
}


class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
