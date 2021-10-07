package kr.or.shi.study02;

import java.util.Scanner;

public class PlayerLevelTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1, 2, 3번 중에 고르시오. : ");
		
		int a = scan.nextInt();
		
		if(a == 1) {	
			PlayerLevel aLevel = new AdvancedLevel();
			aLevel.run();
			aLevel.jump();
			aLevel.turn();
		}
		
		else if(a == 2){
			PlayerLevel bLevel = new BeginnerLevel();
			bLevel.run();
			bLevel.jump();
			bLevel.jump();
			bLevel.turn();
			
		}
		else if(a ==3){
			PlayerLevel sLevel = new SuperLevel();
			sLevel.run();
			sLevel.jump();
			sLevel.jump();
			sLevel.turn();
			
		}
		else {
			System.out.println("다른번호는 선택할수없습니다.");
			
		}
		
		return;
		
		
		
		

	}

}
