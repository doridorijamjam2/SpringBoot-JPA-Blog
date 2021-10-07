package kr.or.shi.operator2;

public class BitOperator {

	public static void main(String[] args) {
		
		// &, |, ^ 3개 비트연산자라고 함.
		
		int x = 8;
		int y = 5;
		
		System.out.println("x를 2진수로 변환한 결과 : " + Integer.toBinaryString(x));
		System.out.println("y를 2진수로 변환한 결과 : " + Integer.toBinaryString(y));
		
		/*
		 * AND연산은 둘다 1일떄만 1을 줌
		 * OR연산은 하나라도 1이면 1을 줌
		 */
		
		
		System.out.println("x와 y를 비트 &(AND) 연산 결과 : " + (x & y));
		System.out.println("x와 y를 비트 &(OR) 연산 결과 : " + (x | y));
		
		//XOR(배타적논리합) : 서로 다를때 1을 줌
		System.out.println("x와 y를 배타적논리합 &^(XOR) 연산 결과 : " + (x ^ y));
		
		//--------------------------------------------------------------------
		
		int x2 = -8;
		int y2 = -5;
		
		System.out.println("x를 2진수로 변환한 결과 : " + Integer.toBinaryString(x2));
		System.out.println("y를 2진수로 변환한 결과 : " + Integer.toBinaryString(y2));
		
		/*
		 * AND연산은 둘다 1일떄만 1을 줌
		 * OR연산은 하나라도 1이면 1을 줌
		 */
		
		
		System.out.println("x와 y를 비트 &(AND) 연산 결과 : " + (x2 & y2));
		System.out.println("x와 y를 비트 &(OR) 연산 결과 : " + (x2 | y2));
		
		//XOR(배타적논리합) : 서로 다를때 1을 줌
		System.out.println("x와 y를 배타적논리합 &^(XOR) 연산 결과 : " + (x2 ^ y2));
 
	}

}
