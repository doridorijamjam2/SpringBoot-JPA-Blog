package kr.or.shi.outputstream;

/*
 * try - with - resources문
 * 7) 자바9부터 리소스는 try()외부에서 선언하고 변수만을 try(obj)와 같이 사용할수 있
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		
		try(OutputStream fos = new FileOutputStream("output.txt")){
			
			fos.write(65);
			fos.write(66);
			fos.write(67);

		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("end");

	}

}
