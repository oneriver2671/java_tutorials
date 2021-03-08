package org.opentutorials.practice;
class Student implements Cloneable {
	String name;
	Student(String name){
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException {		// ���⿡ Object ��� �� �� ����?
		return super.clone();
	}
}

public class ObjectDemo {
	public static void main(String[] args) {
		Student s1 = new Student("egoing");
		try {
			Student s2 = (Student)s1.clone();    // s1.clone�� return���� object��.
			System.out.println(s1.name);
			System.out.println(s2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
