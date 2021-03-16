// 콘솔에 입력해서 받기. 

package javaAdvance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOExam01 {

	public static void main(String[] args) {
		// 이런게 데코레이터 패턴.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		try {
			line = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(line);

	}
}
