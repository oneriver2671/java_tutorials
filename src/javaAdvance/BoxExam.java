package javaAdvance;

public class BoxExam {
	public static void main(String[] args) {
//		Box box = new Box();
//		box.setObj(new Object());		// 뭐냐 이거.
//		Object obj = box.getObj();
//		
//		box.setObj("hello");
//		String str = (String)box.getObj(); 
//		System.out.println(str);
//		
//		box.setObj(1);
//		box.getObj();
//		int value = (int)box.getObj();

		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();
		box2.setObj("hello");
		String str = box2.getObj();
		
		Box<Integer> box3 = new Box<>();
		box3.setObj(3);
		int v2 = box3.getObj();    // 형변환 하지 않아도, 에러 발생하지 않음. 
		
	}
}

// Object 타입으로 받았기 때문에, 모든 객체가 다 들어갈 수는 있지만,
// 다시 꺼내서 사용할 때 매번 '형변환'을 해야함. -> Generic으로 바꾸면 편함.
// Generic 사용하면 매번 형변환을 하지 않아도 됨!!