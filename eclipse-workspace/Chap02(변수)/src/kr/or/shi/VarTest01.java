package kr.or.shi;

public class VarTest01 {
	
	public static void main(String[] args) {
		
		int year = 2021;
		int age = 20;
		
		/*
		 * sys 입력하고 ctrl + space 자동완성
		 */
		System.out.println(year);
		System.out.println(age);
		System.out.println(year + age);
		
		String str = new String("자바");
		System.out.println(str);
		
		System.out.println(str.toString());
		
		/*
		 * 사용자 정의 클래스이거나 toString() 재정의를 하지않은 클래스의 참조변수는 출력을 하게 되면, 클래스입@16진수(주소)
		 */
		Object obj1 = new Object();
		System.out.println(obj1);
		System.out.println(obj1.toString());
		
		/*
		 * 리터럴(literal) : 프로그램에서 사용하는 그자체의 숫자, 문자, 논리값을 뜻함
		 * 정수 리터럴은 int로 저장.
		 * - 정수의 범위가 넘어가는 경우는 L,l을 써줘야 함
		 * 실수 리터럴은 double로 저장
		 *  -float로 사용하려는 경우는 F,f 식별자를 써줘야 함
		 */
		
		//아래코드에서 L은 long을 지정하기 위해서 접미사 l,L를 붙힘
		long result = 10L;
		System.out.println("long 타입 출력 :" + result);
		
		//아래코드에서 F는 float를 지정하기 위해서 접미사 f,F를 붙힘
		float result2 = 10.1F;
		double dou = 9.9999;
		System.out.println(result);
		System.out.println(dou);
	}

}
