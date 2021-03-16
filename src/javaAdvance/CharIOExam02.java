package javaAdvance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharIOExam02 {

	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter pw = null;
			try {
				// ���ڷ����� ����.
				br = new BufferedReader(new FileReader("src/javaAdvance/CharIOExam02.java"));
				pw = new PrintWriter(new FileWriter("test.txt"));	// ������ ���ڷ����� ���� ����ߴµ�, ��� PrintWriter �ܵ����� ����ص� ��.
			
				// ���Ͽ� �� �ٸ� �� �� �ƴϴ� �ݺ��� Ȱ��.
				String line = null;	// ������ ���� null���� ���ϵǰ�.
				while((line = br.readLine()) != null) {
					pw.println(line);
				}
			
			} catch (Exception e) {
				e.printStackTrace();
			} finally {			// IO���� �̰� ���� �ʼ�!! �� ����ϱ�. �ݾ���� �ϴ� ��.
				pw.close();
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	}
}