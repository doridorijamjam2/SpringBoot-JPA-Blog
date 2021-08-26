package kr.or.shi.polymorphism03;

public class PolyTest {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		buyer.buy(new TV());
		
		System.out.println("현재 남은 돈 : " + buyer.money + "만원입니다.");
		System.out.println("현재 보너스포인트 : " + buyer.bonusPoint + "점입니다.");
		
		
		buyer.buy(new Audio());
		
		System.out.println("현재 남은 돈 : " + buyer.money + "만원입니다.");
		System.out.println("현재 보너스포인트 : " + buyer.bonusPoint + "점입니다.");
		
		
		buyer.buy(new Computer());
		
		System.out.println("현재 남은 돈 : " + buyer.money + "만원입니다.");
		System.out.println("현재 보너스포인트 : " + buyer.bonusPoint + "점입니다.");
		
		//buyer.buy(Apple);

	}

}
