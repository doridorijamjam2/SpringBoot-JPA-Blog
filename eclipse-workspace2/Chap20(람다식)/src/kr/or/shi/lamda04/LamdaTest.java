package kr.or.shi.lamda04;

public class LamdaTest {

	public static void main(String[] args) {
		
		MyInterface myInterface = null;
		
		myInterface = (x) -> {
			int result = x * 10;
			System.out.println("매개변수 x값을 가지고 람다식 구현한 메서드의 값 : " + result);
			
		};
		//500은 매개변수임 ==> 람다식의 매개변수인 x에 대입 되어짐.
		myInterface.method(500);
		
		myInterface = x -> System.out.println("매개변수 x값을 가지고 람다식 구현한 메서드의 값 : " + x * 10);
		myInterface.method(600);

	}

}
