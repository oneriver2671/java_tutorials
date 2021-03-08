package org.opentutorials.practice;
import java.io.*;		// �ؿ� BufferedReader, FileReader, readLine�� �����ִ� ��Ű��.
public class CheckedExceptionDemo {
	public static void main(String[] args) {
		BufferedReader bReader = null;		// null �߰�����.
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String input = null;		// null �߰�����.
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(input);
	}
}
