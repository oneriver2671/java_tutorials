//인터페이스 연습 예제.

package sec01.exam01;
public interface RemoteControl {
	// 상수 필드.
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

	// 추상 메소드. (abstract 생략해도 됨)
	public void turnOn();
	public void turnOff();	
	public void setVolume(int volume);	
}
