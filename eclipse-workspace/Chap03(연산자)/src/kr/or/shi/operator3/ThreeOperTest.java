package kr.or.shi.operator3;

import java.util.Scanner;

public class ThreeOperTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		//삼항연산자
		//(조건식) ? 1 : 2
		//String grade = (score >= 90) ? "A" : "A가 아닙니다.";
		char grade = (score >= 90) ? 'A' : 'B';
	    System.out.println("당신의 등급은 : " + grade);
	    
	    //삼항연산자 중첩함
	    grade = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');
	    System.out.println("당신의 등급은 : " + grade);
		
		
		scan.close();  
	}

}
