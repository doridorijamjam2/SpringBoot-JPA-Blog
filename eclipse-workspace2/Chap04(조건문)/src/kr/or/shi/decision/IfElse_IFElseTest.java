package kr.or.shi.decision;

import java.util.Scanner;

public class IfElse_IFElseTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세여: ");
		int score = scan.nextInt();
		
		
		//score변수의 값에 따라서 아래 조건문에서 분기가 일어남.
		if(score >= 90) {
			System.out.println("점수가 90~100점 사이입니다.");
		}
		else if(score >= 80) {
			System.out.println("점수가 80~89점 사이입니다.");
		}
		else if(score >= 70) {
			System.out.println("점수가 70~79점 사이입니다.");
		}
		else {
			System.out.println("점수가 70미만 입니다.");
		}
		
		scan.close();

	}

}
