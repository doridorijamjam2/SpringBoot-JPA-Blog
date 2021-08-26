package kr.or.shi;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		/*
		 * Ctrl + shift + o : 자동임포트
		 * Scanner 클래스 : 입력을 받기 위한 클래스이고, 입력스트림임.
		 * 자원(Resource)은 사용하고 나서 반드시 닫아줘야 함.(scan.close())
		 */
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("정수 한자리 입력 : ");
//		int num = scan.nextInt();
//		System.out.println("사용자로부터 입력받은 숫자 :" + num);
//		
//		
//		System.out.println("실수 한자리 입력 :");
//		double num2 = scan.nextDouble();
//		System.out.println("사용자로부터 입력받은 숫자 :" + num2);
		
		
		
//		System.out.println("문자열을 입력 : ");
		
		/*
		 * next() : 공백을 기준으로 해서 문자를 입력 --> 단어를 입력시 사용.
		 * nextLine : 엔터키를 입력할떄까지 문자열을 입력 --> 문장을 입력시 사용.
		 */
		
//	    String str = scan.nextLine();     
//	    System.out.println("사용자로부터 입력받은 문자열 :" + str);
		
	    
	    
		System.out.println("문자열을 입력(숫자) : ");
		int result = 100;
		String num2 = scan.nextLine();
		
		int temp = Integer.parseInt(num2);   //Interger.parseInt() : String을 Int로 바꿔준
		
		int total = result + temp;
		System.out.println("연산결과 : " + total);
	    
		
		scan.close();
	}

}