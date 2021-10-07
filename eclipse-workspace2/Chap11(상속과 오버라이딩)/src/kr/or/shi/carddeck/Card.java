package kr.or.shi.carddeck;

public class Card {
	
	//클래스별로 관리함.
	//메모리 클래스영역에 클래스 로딩됨과 동시에 할당됨. 공용데이터로 활용
	static final int KIND_MAX = 4;    //카드 무늬 갯수
	static final int NUM_MAX = 13;    //무늬별 카드 수
	
	//무늬를 상수로 지정
	static final int SPACE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	
	//생성자
	public Card(int kind, int number) {
		super();            //Object의 기본생성자를 호출
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public String toString() {
		String kind = "";
		String number ="";
		
		//무늬설정
		switch(this.kind) {
		case 4:
			kind = "스페이스";
			break;
		case 3:
			kind = "다이아몬드";
			break;
		case 2:
			kind = "하트";
			break;
		case 1:
			kind = "클로버";
			break;
		}
		
		//숫자설정
		switch(this.number) {
		case 13:
			number = "K";
			break;
		case 12:
			number = "Q";
			break;
		case 11:
			number = "J";
			break;
		default:
			number = this.number + "";
		}
		
		
		return "무늬 " + kind + ", 숫자 : " + number;
	}
}
