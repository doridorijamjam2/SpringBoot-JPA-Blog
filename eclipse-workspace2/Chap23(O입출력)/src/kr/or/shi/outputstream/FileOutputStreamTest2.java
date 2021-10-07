package kr.or.shi.outputstream;

/*
 * try - with - resources문
 * 7) 자바9부터 리소스는 try()외부에서 선언하고 변수만을 try(obj)와 같이 사용할수 있음.
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		OutputStream fos = new FileOutputStream("output3.txt", true);
		
		try(fos){
			
			byte[] bs = new byte[26];
			byte data = 65;
			
				for(int i=0; i<bs.length; i++) {
					bs[i] = data++;

				}
				fos.write(bs, 2, 10);
			

		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("end");

	}

}
