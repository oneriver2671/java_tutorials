package org.opentutorials.practice;
class Student implements Cloneable {
	String name;
	Student(String name){
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException {		// 여기에 Object 어떻게 들어갈 수 있지?
		return super.clone();
	}
}

public class ObjectDemo {
	public static void main(String[] args) {
		Student s1 = new Student("egoing");
		try {
			Student s2 = (Student)s1.clone();    // s1.clone은 return값이 object라서.
			System.out.println(s1.name);
			System.out.println(s2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
