package kr.or.shi.loop3;

import java.util.Scanner;

/*
 * 사용자로부터 숫자를 입력받아서 해당 숫자가 음의 정수가 아닐 경우
 * 음의 정수를 입력할때까지 다시 입력을 하는 프로그램을 작성하시오.
 * 
 * 음의 정수를 입력해주세요: -7
 * 잘못 입력했습니다.
 * 음의 정수를 입력해주세요: -7
 * 사용자가 입력한 음의 정수: -7
 */

public class WhileTest3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("음의 정수를 입력해주세요.");
		int number = scan.nextInt();
		
		while(number>=0) {
			System.out.println("잘못 입력했습니다.");
			number = scan.nextInt();
		}
		
		System.out.println("사용자가 입력한 음의 정수 : " + number);
		System.out.println("프로그램이 종료됩니다.");
		
//		boolean run = true;
//
//		
//		while(run) {
//			System.out.println("음의 정수를 입력해주세요.");
//			
//			int choice = scan.nextInt();
//			
//			if(choice < 0) {
//				System.out.println("사용자가 입력한 음의 정수 : " + choice);
//				run = false;
//			}
//			else {
//				System.out.println("잘못 입력했습니다.");
//				System.out.printf("\n");
//		}
//		}
//		System.out.println("프로그램을 종료합니다.");
		scan.close();

	}

}
