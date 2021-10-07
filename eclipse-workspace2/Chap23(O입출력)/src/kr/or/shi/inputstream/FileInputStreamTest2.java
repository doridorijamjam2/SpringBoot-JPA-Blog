package kr.or.shi.inputstream;

/*
 * try - with -resource 문
 * 1) 리소스를 사용하는 경우 close()하지 않아도 자동으로 해체되도록 함.
 * 2) java 7부터 제공하는 구문
 * 3) 리소스를 try()내부에서 선언해야만 함.
 * 4) close()를 명시적으로 호출하지 않아도 try()블록에서 생성한 리소스는 정상적인 경우나 예외가 발생한 경우 모두 자동으로 해제됨.
 * 5) 해당 리소스 클래스가 AutoClosable 인터페이스를 구현하고 있음.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		InputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
			try {
				fis.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end");

	}

}
