package javaAdvance;
import java.util.ArrayList;
import java.util.List;
public class ListExam {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("kim");
		list.add("kang");
		list.add("kim");
		
		System.out.println(list.size());		// 출력결과 : 3
		
		// List는 순서가 있는 자료이기 때문에, index를 활용해 꺼내오기.
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
	}
}
