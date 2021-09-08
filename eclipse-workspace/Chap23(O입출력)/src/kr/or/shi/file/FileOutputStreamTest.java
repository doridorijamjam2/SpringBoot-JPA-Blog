package kr.or.shi.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) throws IOException {
		//파일 복사를 하기위해 경로설정
		String originalFileName = "C:\\Users";
		String targetFileName = "C:\\Temp1\\Storyboard.pptx";
		
		File file = new File(originalFileName);
		
		//파일로부터 데이트를 복사
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteCount;
		int i =0;
		byte[] bArr = new byte[1000];
		
		while((readByteCount = fis.read(bArr)) != -1) {
			//읽은 바이트 수만큼 출력스트림으로 보냄.
			fos.write(bArr, 0, readByteCount);
			i++;
			
		}
		fos.flush();
		
		System.out.println("총 루핑수 : " + i);
		
		fos.close();
		fis.close();
		System.out.println(file.getName() + "파일의 복사가 완료되었습니다.");

	}

}
