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
				// 데코레이터 패턴.
				br = new BufferedReader(new FileReader("src/javaAdvance/CharIOExam02.java"));
				pw = new PrintWriter(new FileWriter("test.txt"));	// 지금은 데코레이터 패턴 사용했는데, 사실 PrintWriter 단독으로 사용해도 됨.
			
				// 파일에 한 줄만 들어갈 게 아니니 반복문 활용.
				String line = null;	// 파일의 끝에 null값이 리턴되게.
				while((line = br.readLine()) != null) {
					pw.println(line);        // 이건 무슨 의미인지 모르겠다. 근데 이거 지우니까 출력이 안됨.
					System.out.println(line);	// 이걸 쓰니까 txt파일 내용이 출력됨.
				}
				
			
			} catch (Exception e) {
				e.printStackTrace();
			} finally {			// IO에선 이게 정말 필수!! 꼭 기억하기. 닫아줘야 하는 것.
				pw.close();
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	}
}
