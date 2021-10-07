package kr.or.shi.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\");

		
		System.out.println("파일의 경로 : " + file.getPath());
		System.out.println("파일의 경로 : " + file.getParent());
		System.out.println("파일의 경로 : " + file.canExecute());
		
		InputStream fis = new FileInputStream(file);
		int data;
		int i=0;
		byte[] bArr = new byte[1000];
		
		while((data = fis.read(bArr)) != -1) {
			System.out.write(bArr);
			i++;
		}
		System.out.println("루핑 수 : " + i);
		fis.close();
	}


}
