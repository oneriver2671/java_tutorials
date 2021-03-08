// 컬렉션 프레임워크 중, ArrayList 예제.

package org.opentutorials.framework;
import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();    // 제네릭 사용.
		al.add("one");
		al.add("two");
		al.add("three");
		for(int i=0; i<al.size(); i++) {
			String value = al.get(i);
			System.out.println(value);
		}
	}
}
