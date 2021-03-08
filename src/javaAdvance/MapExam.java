// Programmers ����. (Map)

package javaAdvance;
import java.util.*;

public class MapExam {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("001", "kim");
		map.put("002", "jang");
		map.put("003", "cho");
		map.put("001", "kang");		// "kim" ��� "kang"�� ���� ��.
		
		
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
	}
}
