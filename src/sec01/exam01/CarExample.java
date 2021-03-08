package sec01.exam01;

class Car {
	String model;
	int speed;
	
	Car(String model){
		this.model = model;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}
	void run() {
		for(int i = 0; i<=100; i+=20) {
			this.setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�.(�ü�:" + this.speed + "km/h)");
		}
	}
}

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("����");
		myCar.run();	
		System.out.println();
		Car yourCar = new Car("������");
		yourCar.run();
	}
}
