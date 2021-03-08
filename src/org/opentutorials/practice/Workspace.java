package org.opentutorials.practice;

// ���� ������, ������ �ƺ��� �������̰� �߿�ġ ����. ���α׷��Ӷ�� ��ǿ��� �ָ�.
// Tom�� Jane�� �κ��̸鼭, ���� ���� �� ���α׷��Ӷ�� �����غ���.

interface father{}
interface mother{}
interface programmer{
	public void coding();
}
interface believer{}  // ���⼱ ������ �ǹ�.
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
