package org.opentutorials.practice;

enum Fruit {
	APPLE("red"), PEACH("pink"), BANANA("yellow");    // 암기의 영역.
	private String color;	  // 메소드를 밑에 추가해서, private으로 바꿔줬음. 
	public String getColor() {
		return this.color;
	}
	Fruit(String color) {
		System.out.println("Call Constructor " + this);
		this.color = color;
	}
}

public class ConstantDemo {
	public static void main(String[] args) {
		Fruit type = Fruit.APPLE;
		switch(type) {
		case APPLE:
			System.out.println(57 + " kcal, color " + Fruit.APPLE.getColor());
			break;
		case PEACH:
			System.out.println(34 + " kcal, color " + Fruit.PEACH.getColor());
			break;
		case BANANA:
			System.out.println(93 + " kcal, color " + Fruit.BANANA.getColor());
			break;
		}
	}
}
