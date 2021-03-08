package org.opentutorials.practice;

// 직장 내에선, 엄마건 아빠건 종교인이건 중요치 않음. 프로그래머라는 사실에만 주목.
// Tom과 Jane이 부부이면서, 같은 직장 내 프로그래머라고 가정해보자.

interface father{}
interface mother{}
interface programmer{
	public void coding();
}
interface believer{}  // 여기선 종교를 의미.
class Tom implements father, programmer, believer{
	public void coding() {
		System.out.println("fast");
	}
}
class Jane implements mother, programmer{
	public void coding() {
		System.out.println("elegance");
	}
}
public class Workspace {
	public static void main(String[] args) {
		programmer employee1 = new Tom();
		programmer employee2 = new Jane();
		
		employee1.coding();
		employee2.coding();	
	}
}
