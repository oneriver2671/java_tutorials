// Generic 강의. (Programmers)

package javaAdvance;
public class Box<E> {
	private E obj;
	
	public void setObj(E obj) {     // 리턴타입 필요 없음.
		this.obj = obj;
	}
	
	public E getObj() {
		return obj;
	}
}

// box는 가상클래스 E를 사용하겠다는 의미로, Object -> E로 변경. (E는 가상 클래스임)
// 실제 사용할 때 구체적으로 넣는 것.