//�������̽� ���� ����.

package sec01.exam01;
public interface RemoteControl {
	// ��� �ʵ�.
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

	// �߻� �޼ҵ�. (abstract �����ص� ��)
	public void turnOn();
	public void turnOff();	
	public void setVolume(int volume);	
}
