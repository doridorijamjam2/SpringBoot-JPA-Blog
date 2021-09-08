package kr.or.shi.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/*
 * *스크림(stream)
 *      : 자료의 대상과 상관없이 동일한 연산을 수행
 *        배열, 컬렉션을 대상으로 연산을 수행함.
 *        스트림 연산은 중간 연산과 최종 연산으로 구분함.
 *        
 *        
 *  자바 입출력을 위한 스트림
 *     1) 자료의 흐름이 물이 흐름과 같다는 비유에서 유래됨.
 *     2) 다양한 입출력 장치에 독립적으로 일관성있는 입출력을 스트림을 통해 제공
 *     3) 입출력 스트림의 구분
 *         - 대상 기준 : 입력 스트림 / 출력 스트림
 *         - 자료의 종류 : 바이트 스트림 / 문자 스트림
 *         - 기능 : 기반 스트림 / 보조 스트림
 *         
 *     4) 자바프로그램                   입출력 자료
 *                     입력 스트림(대상으로부터 자료를 읽어들이는 스트림)
 *                   ------------->
 *                   <-------------
 *                     출력 스트림(대상으로부터 자료를 출력하는 스트림)
 *        
 */

public class FileReaderTest {
	public static void main(String[] args) {
		try(Reader fis = new FileReader("reader.txt")){
			int i;
			while((i = fis .read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}

}
