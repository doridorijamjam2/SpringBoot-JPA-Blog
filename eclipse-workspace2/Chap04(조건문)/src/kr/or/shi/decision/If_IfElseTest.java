package kr.or.shi.decision;

public class If_IfElseTest {

	public static void main(String[] args) {
		int score = 70;
		
		/*
		 * 몇 수십개의 if문이 존재하더라도, cpu는 모든 
		 */
		
		
		if(score > 90){
			System.out.println("점수가 90보다 크다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score > 80){
			System.out.println("점수가 80보다 크다.");
			System.out.println("등급은 B입니다.");	
		}
		
		System.out.println();
		
		/*
		 * if~else 구문은 50% 확률일때 사용하는게 바람직함.
		 * else 구문 옆에는 조건문이 절대로 오면 안됨.
		 */
		
		
		if(score > 90){
			System.out.println("점수가 90이상입니다.");
		}
		else {
			System.out.println("점수가 90미만입니다.");
		}
		
		
			
	}

}
