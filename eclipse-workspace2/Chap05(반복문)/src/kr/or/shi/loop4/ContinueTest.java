package kr.or.shi.loop4;

public class ContinueTest {

	public static void main(String[] args) {
		
		//1~100까지 사이에 홀수만 출력하는 프로그램을 작성하시오.
		
//		for(int i = 1; i <= 100; i++) {
//			if((i%2) == 0) {    //짝수 ! 부정형 쓰면 됩니다.
//				continue;
//			}
//			System.out.println("홀수 : " + i);
//		}
		
		//2와 3의 공배수만 출력하는 프로그램을 작성하시오.
		
		for(int i = 1; i <= 100; i++) {
			if((i%2) == 0 && (i%3) == 0) {   
			}
			System.out.println("2와 3의 공배수 : " + i );
		}
		

	}

}
