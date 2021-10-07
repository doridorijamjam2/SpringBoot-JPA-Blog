package kr.or.shi.inputstream;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class FileInputStreamTest {

	public static void main(String[] args) {
		int i;
		try (InputStream fis = new FileInputStream("input2.txt");){
			
			byte[] bs = new byte[10];
			
			while(( i = fis.read(bs, 1, 9)) != -1) {
				for(int j=0; j<i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : " + i + "바이트 읽음");
			}
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
			}
		System.out.println("end");

	}

}
