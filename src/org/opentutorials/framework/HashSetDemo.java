// (��Ȱ�ڵ�) �÷��� �����ӿ�ũ ��, HashSet ����.

package org.opentutorials.framework;
import java.util.*;
public class HashSetDemo {
	public static void main(String[] args) {
		Set<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3); 
		
		Iterator hi = A.iterator();
		while(hi.hasNext()) {   // ��ȣ ���� true�� �����. 
			System.out.println(hi.next());
		}
	}
}
