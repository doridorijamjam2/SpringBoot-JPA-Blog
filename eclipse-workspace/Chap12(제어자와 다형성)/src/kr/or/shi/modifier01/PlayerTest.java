package kr.or.shi.modifier01;

import kr.or.shi.polymorphism01.Defender;
import kr.or.shi.polymorphism01.MidFielder;
import kr.or.shi.polymorphism01.Player;
import kr.or.shi.polymorphism01.Striker;

public class PlayerTest {

	public static void main(String[] args) {
		//다형성 미적용
		Player player1 = new Player("박지성", 40, 20, 60);
		player1.info();
		System.out.println();
		
		//다형성 적용
		//원타입은 벗어나지 못함. 그래서 Striker클래스에 있는 getShoot()메서드는 접근이 안됨.
		Player player2 = new Striker("손흥민", 25, 10, 90, 50);
		//메서드에서 상속관계에 있다면, 자손클래스에서 오버라이딩을 하게 되면 현재 참조하고 있는 인스턴스의 메서드를 호출함.
		player2.info();
		System.out.println();
		
		Player player3 = new MidFielder("이강인", 10, 30, 50, 100);
		player3.info();
		System.out.println();
		
		Player player4 = new Defender("이용", 10, 20, 30, 20);
		player4.info();
		System.out.println();

	}

}
