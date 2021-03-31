package javaAdvance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteIOExam01 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		// 읽어들이기 위한 객체.
		FileInputStream fis = null;
		// 파일에 쓸 수 있는 객체가 필요함.
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/javaAdvance/ByteIOExam01.java");
			fos = new FileOutputStream("byte.txt");
			
			// FileInputStream으로 읽어들인 값을 'readData'에 담기.
			int readData = -1;
			while((readData = fis.read()) != -1) {
				// 읽어들일 코드가 여러줄 일 수 있으니, 반복문으로.
				// 읽어들인 값이 -1이 아닐 때에만, 반복해서 수행하라는 뜻.
				fos.write(readData);
				System.out.println(readData);
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
		// 수행시간 비교.
//		long endTime = System.currentTimeMillis();
//		System.out.println(endTime-startTime);
		
	}
}
