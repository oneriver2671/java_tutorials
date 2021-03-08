package org.opentutorials.practice;
import java.io.*;		// 밑에 BufferedReader, FileReader, readLine이 속해있는 패키지.
public class CheckedExceptionDemo {
	public static void main(String[] args) {
		BufferedReader bReader = null;		// null 추가했음.
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String input = null;		// null 추가했음.
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(input);
	}
}
