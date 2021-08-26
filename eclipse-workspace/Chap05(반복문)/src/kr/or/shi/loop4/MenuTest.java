package kr.or.shi.loop4;

import java.util.Scanner;

public class MenuTest {
	
	static final int ID_MIN = 1;
	static final int ID_MAX = 10;
	static final int SCORE_MIN = 0;
	static final int SCORE_MAX = 100;
	static final int SUBJECT_SIZE = 3;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int id = 0;
		String name = new String();
		int korean = 0;
		int english = 0;
		int math = 0;
		boolean inputSwitch = false;
		
		
		while (true) {
			System.out.println("=============================");
			System.out.println("      대학교 성적관리프로그램      ");
			System.out.println("1.입력    2.출력    3.종료    ");
			System.out.println("=============================");
			System.out.println(">");
			
			int userchoice = scan.nextInt();
			
		   
			
			if(userchoice == 1) {
				//성적을 입력하는 코드를 여기에 구현
				
				inputSwitch = true;
				System.out.println("학생 번호 입력 : ");
				id = scan.nextInt();
				
				while(id <= SCORE_MIN || id > ID_MAX) {
				    
					System.out.println("잘못 입력했습니다.");
					System.out.println("번호 : ");
					id = scan.nextInt();
				}
				scan.nextLine();
				System.out.println("학생 이름 : ");
				name = scan.nextLine();
				
				//국어 입력
				System.out.println("국어 입력 : ");
				korean = scan.nextInt();
				
				while(korean <= SCORE_MIN || korean > SCORE_MAX) {
					System.out.println("잘못 입력했습니다.");
					System.out.println("국어 : ");
					korean = scan.nextInt();
				}
				
				//영어 입력
				System.out.println("영어 입력 : ");
				english = scan.nextInt();
				
				while(english <= SCORE_MIN || english > SCORE_MAX) {
					System.out.println("잘못 입력했습니다.");
					System.out.println("영어 : ");
					english = scan.nextInt();
				}
				
				//수학 입력
				System.out.println("수학 입력 : ");
				math = scan.nextInt();
				
				while(math <= SCORE_MIN || math > SCORE_MAX) {
					System.out.println("잘못 입력했습니다.");
					System.out.println("수학 : ");
					math = scan.nextInt();
					System.out.println(math);
				}
			}
			
			else if(userchoice == 2) {
				
				if(inputSwitch) {
					
					int sum = korean + english + math;
					double avg = sum / (double)SUBJECT_SIZE;
					
					System.out.printf("번호 = %03d번\n", id);
					System.out.printf("국어 = %03d점, 영어 = %03d점, 수학 = %03d점\n", korean, english, math);
					System.out.printf("총점 = %d점, 평균 = %06.2f점\n", sum , avg);
				}
				else {
					System.out.printf("아직 입력한 정보가 존재하지 않습니다.");
				}
	
				
			}
			else if(userchoice == 3) {
				//사용 주셔서 감사합니다.
				break;
			
				
			}
		}
		scan.close();

	}

}
