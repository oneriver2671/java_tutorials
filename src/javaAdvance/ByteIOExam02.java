package javaAdvance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteIOExam02 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();	// ����ð� �� ����.
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/javaAdvance/ByteIOExam01.java");
			fos = new FileOutputStream("byte.txt");
			
			int readCount = -1;
			byte[] buffer = new byte[512];	// �߰�.
			while((readCount = fis.read(buffer)) != -1) {		// buffer �߰�.
				fos.write(buffer,0,readCount);	// �̰� ���� �ȵ�.
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
		// ����ð� �񱳸� ���� �������.
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
}
