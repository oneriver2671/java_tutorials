package org.opentutorials.framework;
import java.util.*;
class Computer implements Comparable{
	int serial;
	String owner;
	Computer(int serial, String owner){
		this.serial = serial;
		this.owner = owner;
	}
	public int compareTo(Object o) {
		return this.serial - ((Computer)o).serial;		// 뭐임 이게..?
	}
	public String toString() {
		return serial + " " + owner;		// " "는 중간에 띄어쓰기를 위해.
	}
}

public class CollectionsDemo {
	public static void main(String[] args) {
		List<Computer> computers = new ArrayList<Computer>();
		computers.add(new Computer(500, "egiong"));
		computers.add(new Computer(200, "oneriver"));
		computers.add(new Computer(3233, "hangaram"));
		Iterator i = computers.iterator();
		System.out.println("before");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Collections.sort(computers);
		System.out.println("\nafter");
		i = computers.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}	
	}
}
