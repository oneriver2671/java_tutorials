package org.opentutorials.practice;
class V {
	public int id;
	V(int id){
		this.id = id;
	}
}

public class ReferenceDemo1 {
	public static void runValue() {
		int a = 1;
		int b = a;
		b = 2;
		System.out.println(a);
	}
	
	public static void runReference() {
		V v = new V(3);
		V w = v;
		// w = new V(2);   �߰��� �̰� ���� v.id�� 3�� ��µ�.
		w.id = 2;		// �̰� ������ v.id�� 3�� ��µ�. 
		System.out.println(v.id);
	}
	
	public static void main(String[] args) {
		runValue();
		runReference();
	}
}
