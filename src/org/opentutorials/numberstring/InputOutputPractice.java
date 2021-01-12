package org.opentutorials.numberstring;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
public class InputOutputPractice {
	
	public static void main(String[] args) {
		try {
			File file = new File("out.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt()*1000);
			}
			sc.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	
		

		
		for(String e : args) {
		System.out.println(e);
		}
		
		
		
		
		
	}

}


