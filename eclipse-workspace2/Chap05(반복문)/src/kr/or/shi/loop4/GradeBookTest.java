package kr.or.shi.loop4;

import java.util.Scanner;

/*
 * 사용자로부터 번호, 이름, 국어, 영어, 수학 점수를 차례대로 입력받아 형식에 맞춰서 출력하는 프로그램을 작성하시오.
 * 
 * 단, 번호는 1~10	사이다.
 * 국어,영어,수학 점수 모두 0~100 사이다.
 * 만약 사용자가 잘못된 번호 혹은 점수를 입력하면 올바른 값이 입력될때까지 다시 입력을 받도록 프로그램을 작성하시오.
 */

public class GradeBookTest {
	
	static final int ID_MIN = 1;
	static final int ID_MAX = 10;
	static final int SCORE_MIN = 0;
	static final int SCORE_MAX = 100;
	static final int SUBJECT_SIZE = 3;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//학생 이름
		System.out.println("학생 이름 : ");
		String name = scan.nextLine();
		
		//학생 번호
		System.out.println("학생 번호 입력 : ");
		int id = scan.nextInt();
		
		while(id <= SCORE_MIN || id > ID_MAX) {
			System.out.println("잘못 입력했습니다.");
			id = scan.nextInt();
		}
		
		//국어 입력
		System.out.println("국어 입력 : ");
		int korean = scan.nextInt();
		
		while(korean <= SCORE_MIN || korean > SCORE_MAX) {
			System.out.println("잘못 입력했습니다.");
			korean = scan.nextInt();
		}
		
		//영어 입력
		System.out.println("영어 입력 : ");
		int english = scan.nextInt();
		
		while(english <= SCORE_MIN || english > SCORE_MAX) {
			System.out.println("잘못 입력했습니다.");
			english = scan.nextInt();
		}
		
		//수학 입력
		System.out.println("수학 입력 : ");
		int math = scan.nextInt();
		
		while(math <= SCORE_MIN || math > SCORE_MAX) {
			System.out.println("잘못 입력했습니다.");
			math = scan.nextInt();
			System.out.println(math);
		}
		
		//합계, 평균
		int sum = korean + english + math;
		double avg = sum / (double)SUBJECT_SIZE;
		
		
        
		System.out.printf("번호 = %03d번, 이름 = %s\n", id , name);
		System.out.printf("국어 = %03d점, 영어 = %03d점, 수학 = %03d점\n", korean, english, math);
		System.out.printf("총점 = %d점, 평균 = %06.2f점\n", sum , avg);
		
		scan.close();
	

	}

}
