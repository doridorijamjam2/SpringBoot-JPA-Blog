package kr.or.shi.interface05.case01;

/*
 * 여러 개의 인터페이스 구현하기
 *  - 하나의 클래스에서 여러 인터페이스를 구현 할수 있음.
 *  - 디폴트 메서드의 이름이 중복되는 경우에는 재정의 함.
 */

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("Customer sell");
		
	}

	@Override
	public void buy() {
		System.out.println("Customer buy");
		
	}

	@Override
	public void order() {
		System.out.println("Customer order");
	}
	
	public void sayHello() {
		System.out.println("hello");
	}

}
