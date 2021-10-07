package kr.or.shi.string;

import java.io.UnsupportedEncodingException;

public class GetByteTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		 String str = "안녕하세요.";
		 
		 //인코딩(encoding : 기계가 편하게 변환하는 과정)
		 byte[] bytes1 = str.getBytes("UTP-8");
		 System.out.println("bytes(UTP-8)의 길이 : " + bytes1.length);
		 
		 byte[] bytes2 = str.getBytes("EUC-KR");
		 System.out.println("bytes(EUR-KR)의 길이 : " + bytes2.length);
		 
		 //디코딩(decoding : 인간이 알아보기 편하게 변환하는 과정)
		 String str1 = new String(bytes1, "utf-8");
		 System.out.println("utf-8로 디코딩한 문자열 : " + str1);
		 
		 str1 = new String(bytes2, "euc-kr");
		 System.out.println("euc-kr로 디코딩한 문자열 : " + str1);

	}

}
