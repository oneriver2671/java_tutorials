// Generic ����. (Programmers)

package javaAdvance;
public class Box<E> {
	private E obj;
	
	public void setObj(E obj) {     // ����Ÿ�� �ʿ� ����.
		this.obj = obj;
	}
	
	public E getObj() {
		return obj;
	}
}

// box�� ����Ŭ���� E�� ����ϰڴٴ� �ǹ̷�, Object -> E�� ����. (E�� ���� Ŭ������)
// ���� ����� �� ��ü������ �ִ� ��.