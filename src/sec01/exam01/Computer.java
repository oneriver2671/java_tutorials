// �Ű������� ������ �� ���. => Array Ȱ��.

package sec01.exam01;
public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		for(int i = 0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
