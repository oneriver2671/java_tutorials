// final ����.

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
		Person p1 = new Person("123456-1234567", "ȣ��¥");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// p1.nation = "US";  -> ������ ���� �߻�.
		p1.name = "���Ѱ�";
	}
	
}
