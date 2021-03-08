// (생활코딩) 컬렉션 프레임워크 중, HashSet 예제.

package org.opentutorials.framework;
import java.util.*;
public class HashSetDemo {
	public static void main(String[] args) {
		Set<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3); 
		
		Iterator hi = A.iterator();
		while(hi.hasNext()) {   // 괄호 안이 true면 실행됨. 
			System.out.println(hi.next());
		}
	}
}
