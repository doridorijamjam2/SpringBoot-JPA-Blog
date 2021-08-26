package kr.or.shi.decision2;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("월 : ");
		int month = scan.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일입니다.");
			break;
		case 2:
			System.out.println("28일입니다.");
			break;
		default:
			System.out.println("해당 월은 없습니다.");
			break;
		}


	}

}
