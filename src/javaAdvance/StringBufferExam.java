package javaAdvance;

public class StringBufferExam {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");		// ���ڿ��� �߰��ϴ� �޼ҵ�.
		sb.append(" ");		
		sb.append("world");		
		
		String str = sb.toString();
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");
		if(sb2 == sb3)
			System.out.println("sb2 == sb3");
		// ���ٰ� ��µ�.
		
		// ���� �ۼ��� �ڵ带 �̷��� ���ٷ� ���� �� ����.
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		System.out.println(str2);
	}
}
