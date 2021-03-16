package javaAdvance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteIOExam02 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();	// 수행시간 비교 목적.
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/javaAdvance/ByteIOExam01.java");
			fos = new FileOutputStream("byte.txt");
			
			int readCount = -1;
			byte[] buffer = new byte[512];	// 추가.
			while((readCount = fis.read(buffer)) != -1) {		// buffer 추가.
				fos.write(buffer,0,readCount);	// 이거 이해 안됨.
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// 수행시간 비교를 위해 만들어짐.
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
}
