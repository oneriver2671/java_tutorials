// ���̵�� ��й�ȣ �˻��ϱ�. (ȥ���� p.577)
// ??

package sec01.exam01;
import java.util.*;
public class HashTableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>();
		
		// ID�� PW ����.
		map.put("spring","12");
		map.put("summer","123");
		map.put("fall","124");
		map.put("winter","12345");
	
		Scanner scanner = new Scanner(System.in);  // ���� �𸣰���.
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.print("���̵�: ");    // println���� ���̴�??
			String id = scanner.nextLine();    // Ű����� �Է��� ���̵� ����.
			System.out.print("��й�ȣ: ");
			String password = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {		// id�� Ű�� �����ϴ��� Ȯ��
				if(map.get(id).equals(password)) {
					System.out.println("�α��εǾ����ϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			} else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
		}	
	}
}
