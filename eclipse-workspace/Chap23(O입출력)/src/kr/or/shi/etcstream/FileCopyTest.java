package kr.or.shi.etcstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String[] args) {
		
		long milisecond = 0;
		
		try(BufferedInputStream bis = new BufferedInputStream( new FileInputStream("a.zip"));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))){
			
			milisecond = System.currentTimeMillis();
			
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			
			milisecond = System.currentTimeMillis() - milisecond;
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(milisecond + "소요되었습니다");
	}
}
