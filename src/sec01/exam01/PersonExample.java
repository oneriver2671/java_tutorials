// final 개념.

package sec01.exam01;
class Person {
		final String nation = "Korea";
		final String ssn;
		String name;

	Person(String ssn, String name){
		this.ssn = ssn; this.name = name;
	}
	public static void main(String[] args) {
	}
}

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "호잇짜");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// p1.nation = "US";  -> 컴파일 에러 발생.
		p1.name = "장한강";
	}
	
}
