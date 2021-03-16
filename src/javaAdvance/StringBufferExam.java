package javaAdvance;

public class StringBufferExam {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");		// 문자열을 추가하는 메소드.
		sb.append(" ");		
		sb.append("world");		
		
		String str = sb.toString();
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");
		if(sb2 == sb3)
			System.out.println("sb2 == sb3");
		// 같다고 출력됨.
		
		// 위에 작성한 코드를 이렇게 한줄로 만들 수 있음.
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		System.out.println(str2);
	}
}
