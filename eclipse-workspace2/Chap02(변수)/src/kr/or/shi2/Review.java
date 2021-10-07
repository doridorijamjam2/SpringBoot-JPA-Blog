package kr.or.shi2;

public class Review {
	
	/*
	 * 1. main() 메서든가 없다면 기본 메서드를 찾을 수 없다라고 에러 발생.
	 * _>자바 프로그램이 실행되면 제일 먼저 메인 메서드를 찾아서 실행.
	 * --> entry point 
	 */
	
	/*
	 * 2. 자바 NamingConvension
	 *  - 낙타등 표기법 (camel back notation)
	 *    : 이름이 여러 단어로 이루어져 있는 경우
	 *      두번째 단어부터는 첫글자는 대문자로 써서 단어의 구별을 쉽게 할수 있게 적는 표기법.
	 *  - 뱀 표기법 (Snake notation)
	 *    : 모든 글자를 대문자로 적어주고 이름이 여러 단어일때 단어 사이마다 "_"를 넣어서 단어 구별을 쉽게 할수 있게 적는 표기법.
	 *    
	 *  - 클래스 : 클래스는 대문자로 시작하고 낙타등 표기법을 사용하는 명사임.
	 *     상수 : 모든 글자를 대문자로 적고 뱀 표기법을 사용하는 명사임.
	 *    메서드 : 소문자로 시작하고 낙타등 표기법을 사용하는 동사임.
	 *     변수 : 소문자로 시작하고 낙타등 표기법을 사용하는 명사임.
	 */

	public static void main(String[] args) {
		
		/*
		 *  연산자 혹은 메서드의 결과로 사용하는 것이 대부분임.
		 *  어떤 조건식이 참일때 실행 혹은 반복문이 되는 제어문에서 값에 따라서 실행 혹은 반복이 됨.
		 */
		
		
		boolean boo = true;
		System.out.println(boo);
		
		boo = false;
		System.out.println(boo);
		
		
		
		//print(), println()
		
		//printf() --> 지시자를 사용
		// %d(정수),%f (실수) ,%c(문자), %s(문자열), %b(부울), %n(줄바꿈), %o(8진수), %x(16잔수)
		
		int a = 25;
		float f = 9.8F;
	    char c = 'A';
		
		System.out.printf("나는 %d살의 대학생이다. 소수점 형식 --> %.1f, 문자 --> %c " ,a , f, c);
		
	}

}
