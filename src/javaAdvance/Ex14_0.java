package javaAdvance;

public class Ex14_0 {
	public static void main(String[] args) {
		/*
		MyFunction f = new MyFunction() {
			public int max(int a, int b) {
				return a > b? a:b;
			}
		};
		*/
		
		MyFunction2 f = (a,b) -> a > b ? a : b;
		
		int value = f.max(3,5); 
		System.out.println("value="+value);
		
	}
}

@FunctionalInterface
interface MyFunction2{
	public abstract int max(int a, int b);
}
