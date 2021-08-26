package kr.or.shi.decision;

import java.util.Scanner;

/*
 * static 으로 선언된 함수(메소드)나 변수, 상수 == JVM에서 인스턴스 생성없이 호출 가능함.
 * 자바 프로그램을 실행하면 static으로 지정된 메서드를 찾아서 먼저 메모리에 할당시킴.
 */

/*
 *  상수로 관리자의 id와 비밀번호를 만들고 사용자로부터 따로 id와 비밀번호를 입력받아서
 *  만약 관리자의 id와 비밀번호를 일치하면 "관리자 로그인 성공!" 출력하고
 *  그외에는 "로그인 실패"가 출력되는 프로그램을 작성하시오.
 */

public class IfElseTest {
	
	static final String ADMIN_ID = new String("admin");
	static final String ADMIN_PASSWORD = new String("1216");

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ID :");
		String id = scan.nextLine();
		
		System.out.print("PW :");
		String pw = scan.nextLine();
		
		if(id.equals(ADMIN_ID) && pw.equals(ADMIN_PASSWORD)) {
			System.out.println("관리자 로그인 성공!");
		}
		else {
			System.out.println("로그인 실패!");
		}
		
		
		scan.close();
		

	}

}
