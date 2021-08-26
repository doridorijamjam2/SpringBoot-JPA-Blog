package kr.or.shi.decision;

import java.util.Scanner;

public class IFNestedTest {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("점수를 입력하세여: ");
		 int score = scan.nextInt();
		 
		 if(score >= 90) {
			 /*
			  * 중첩 if문 (무제한적 중첩if문을 들어갈수 있음.)
			  */
			 if(score >= 95) {
				 System.out.println("당신은 A+ 등급입니다.");
			 }
			 else {
				 System.out.println("당신은 A0 등급입니다.");
			 }
		 }
		else if(score >= 80) {
			 if(score >= 85) {
				 System.out.println("당신은 B+ 등급입니다.");
			 }
			 else {
				 System.out.println("당신은 B0 등급입니다.");
			 }
			 
		 }
		 else {
			 System.out.println("분발해 주세요.");
			 
		 }
		
		 
		 scan.close();

	}

}
