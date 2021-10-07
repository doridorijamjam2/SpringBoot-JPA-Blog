package kr.or.shi.lamda03;

public class MyInterfaceTest {

	public static void main(String[] args) {
		/*
		 * 람다식 이용해서 익명구현객체를 생성함.
		 * 매개변수 없을 때, () 생략 불가.
		 * {}는 추상메서드인 method()을 실행할수 없음.
		 */
		
		MyInterface myInterface = () -> {
			String str = "람다식으로 만든 익명구현객체임";
			System.out.println(str);
		};
		myInterface.method();
		
		//익명구현객체
		MyInterface myInterface2 = new MyInterface() {
			
			@Override
			public void method() {
				String str = "직접 만든 익명구현 객체임.";
				System.out.println(str);
				
			}
		};
		
		myInterface2.method();
		
		myInterface = () -> {
			System.out.println("람다식으로 만든 익명구현객체임2");
		};
		myInterface.method();
		
		myInterface = () -> System.out.println("람다식으로 만든 익명구현객체임2");
		myInterface.method();

	}

}
