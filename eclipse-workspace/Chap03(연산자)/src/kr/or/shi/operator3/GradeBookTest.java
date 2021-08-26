package kr.or.shi.operator3;

import java.util.Scanner;

/*
 * 사용자로 부터
 * 번호, 이름, 국어, 영어, 수학 점수순으로 입력받아서
 * 다음과 같은 양식대로 출력되게 프로그램을 작성하시오.
 * 
 * 번호: 3
 * 이름: 류현진
 * 국어: 80
 * 영어: 70
 * 수학: 90
 * 번호: 003번 이름: 류현진
 * 국어: 080점 영어: 070점 수학: 090점
 * 총점: 240 평균: 080.00
 */

public class GradeBookTest {
	
	static final int SUBJECT_SIZE = 3;
	

	public static void main(String[] args) {
		
		System.out.println("번호, 이름, 국어, 영어, 수학 점수순으로 입력받아서\n" + "다음과 같은 양식대로 출력되게 프로그램을 작성하시오.");
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.printf("번호 = %d\n", number);
		
		scan.nextLine();
		String name = scan.nextLine();
		System.out.printf("이름 = %s\n", name);
		
		int korean = scan.nextInt();
		System.out.printf("국어 = %d\n", korean);
		
		int english = scan.nextInt();
		System.out.printf("영어 = %d\n", english);
		
		int math = scan.nextInt();
		System.out.printf("수학 = %d\n", math);
		
		
		int sum = korean + english + math;
		double avg = sum / (double)SUBJECT_SIZE;
		
		
        
		System.out.printf("번호 = %03d번, 이름 = %s\n", number , name);
		System.out.printf("국어 = %03d점, 영어 = %03d점, 수학 = %03d점\n", korean, english, math);
		System.out.printf("총점 = %d점, 평균 = %06.2f점\n", sum , avg);
		
		
		

	}

}
