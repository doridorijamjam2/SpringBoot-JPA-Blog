package kr.or.shi.exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandlingTest {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("finally 구문은 항상 호출된다."
					+ "");
		}
		System.out.println("End");

	}

}
