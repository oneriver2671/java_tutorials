package javaAdvance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharReaderExam1 {
	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new BufferedReader(new FileReader("test.txt"));
			while(true) {
				int data = reader.read();
				if(data == -1) break;
				System.out.println(data);		// int값을 리턴하니, char로 변환해줘야함.
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
