

package org.opentutorials.framework;
import java.util.*;
public class ArrayListExmaple {
	public static void main(String[] args) {
		List<String> list = new ArrayList();   // ������Ÿ���� List�� �߳�.
		
		list.add("Java");
		list.add("Spring");
		list.add("Oracle");
		list.add("Oneriver");
		list.add("DataBase");

		int size = list.size();
		System.out.println(size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println(skill);
	}

}
