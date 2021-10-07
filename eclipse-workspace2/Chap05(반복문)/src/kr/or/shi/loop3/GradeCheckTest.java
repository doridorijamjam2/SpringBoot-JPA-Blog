package kr.or.shi.loop3;

import java.util.Scanner;

/*
 * 사용자로부터 점수를 입력받아서 A,B,C,D,F를 출력하는 프로그램을 작성하시오.
 * 단 사용자가 잘못된 점수를 입력하는 경우올바른 형태의 점수를 입력할때까지 다시 입력받도록 하시오.
 * 
 * 
 * 점수 : -10
 * 잘못 입력하셨습니다.
 * 점수 : -00
 * 잘못 입력하셨습니다.
 * 점수 : 100
 * A
 */

public class GradeCheckTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("점수 : ");
		int score = scan.nextInt();

		while (!(score >= 0 && score <= 100)) {
			System.out.println("잘못 입력했습니다.");
			System.out.println("점수 : ");
			score = scan.nextInt();
		}

		  if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");

		}

		scan.close();

	}

}
