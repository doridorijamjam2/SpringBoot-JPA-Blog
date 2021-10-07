package kr.or.shi.polymorphism03;

/*
 * 다형성을 사용하는 이유?
 *  : 1) 다른 물품을 추가하는 경우
 *    2) 상속과 메서드 재정의를 활용하여 확장성 있는 프로그램을 만들수 있음.
 *    3) 그렇지 않는 경우 if ~ else if 구현되고, 코드 유지보수의 어려움이 가중됨.
 *    4) 상위 클래스는 공통적인 부분을 제공하고 하위 클래스는 각 클래스에 맞는 기능 구현.
 *    5) 여러 클래스를 하나의 타입(상위 클래스)으로 핸들링 할 수 있음.
 */

public class Product {
	int price;           //제품의 가격
	int bonusPoint;      //제품 구매시 제공하는 보너스
	
	public Product(int price) {
		this.price = price;
		//보너스 점수는 제품가격의 10%를 적립
		this.bonusPoint = (int)(price / 10.0);
		
	}

}
