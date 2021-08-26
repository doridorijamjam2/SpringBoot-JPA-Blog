package kr.or.shi.decision3;

public class MethodTest {
	
	/*
	 * 메서드 선언부 구성
	 * 1. 리턴타입(반환값) : int
	 * 2. 메서드명
	 * 3. () : 매개변수, 인자값, arguments, parameter
	 * 
	 * 메서드 구현부(정의부) : { }]
	 */
	
	public static int add(int x, int y) {
		System.out.println("add 메서드 호출함.");
		int temp = x + y;
		return temp;
	}
	
	public static int minus(int x1, int y1) {
		System.out.println("minus 메서드 호출함.");
		return x1 - y1;
	}

	public static void main(String[] args) {
		
		int num1 = 150;
		int num2 = 49;
		
		//값에 의한 복사 (Call by value)
		
		int result = add(num1, num2);
		System.out.println("num1 + num2 = " + result );
		
		result = minus(num1, num2);
		System.out.println("num1 + num2 = " + result );

	}

}
