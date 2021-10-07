package kr.or.shi.operator3;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력");
		int number = scan.nextInt();
		System.out.println("사용자가 입력한 숫자 : " + number);
		
		
		System.out.println("실수 입력");
		double d = scan.nextDouble();
		System.out.println("사용자가 입력한 숫자 : " + d);
		
		/*
		 * Scanner의 경우 nextInt(), nextDouble() 등의 숫자를 입력하는 메소드 실행하면 버퍼메모리에 엔터키가 남아있게 됨.
		 * 그후에 nextLine()을 사용하게 된다면 그 버퍼메모리에 남아있는 엔터키때문에 스캐너는 사용자가 아무런 내용없는  스트림을 입력했다고 착각을 함.
		 * => 입력은 불가능해지는 버그가 있음.
		 * ==> 반드시 scanner.nextLine()을 쓰고 나서 다시 입력 받아주면 됨.
		 * 스캐너의 경우에 우리가 키보드로 입력한 데이터를 곧장 읽어오는 것은 아님.
		 * 버퍼메모리라는 임시 저장소에 키보드 입력값을 저장하고,
		 * 해당 키보드값이 유효한지 체크해서 유효하면 데이터를 읽어오는 구조임.
		 */
		
		System.out.print("이름 입력: ");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.printf("사용자가 입력한 이름 : %s\n ", name);
		
		
		
		
		scan.close();
	}

}
