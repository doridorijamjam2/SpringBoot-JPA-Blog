package kr.or.shi.carddeck;

public class Deck {

	final int CARD_NUM = 52;             //카드의 개수(13장 * 4)
	
	Card[] card = new Card[CARD_NUM];    //객체 배열(2차원 배열 타입)
	
	int i =0;
	
	//인스턴스 초기화 블럭
	{
		//52번 반복하면서 카드를 초기화
		for(int k=Card.KIND_MAX; k>0; k--) {
			for(int n=1; n<Card.NUM_MAX+1; n++) {   //4,3,2,1 : 무늬
				card[i++] = new Card(k, n);           //13 (카드번호 1부터)
			}
		}
		//카드 초기화 내용 출력
		for(int j=0; j<card.length; j++) {
			System.out.printf("Card[%d]의 무늬 : %d, Card[%d]의 숫자 : %d\n", j, card[j].kind, j, card[j].number);
		}
	}
	public Deck() {
		super();
		System.out.println("Deck 기본생성자 호출");
	}
	public Card pick(int index) {
		if( 0 <= index && index < CARD_NUM) {
			return card[index];
		}
		else {
			return pick();
		}
	}
	//Deck에서 카드 하나를 임의로 선택 (overloading)
	public Card pick() {
		int index = (int)(Math.random()*CARD_NUM);
		System.out.print("임의로 뽑은 카드 : ");
		System.out.printf("%d번은 : ", index);
		
		return pick(index);
		
	}
	
	//단순히 섞는 메서드
	public void shuffle() {
		
		for(int n=0; n<1000; n++) {
			//카드를 무작위로 섞는다.
			int i = (int)(Math.random()*CARD_NUM);
			Card temp = card[0];
			card[0] = card[i];
			card[i] = temp;
		}
		System.out.println();
		System.out.println("카드를 섞은 후 결과 : ");
		
		for(int j=0; j<card.length; j++) {
			System.out.printf("Card[%d]의 무늬 : %d, Card[%d]의 숫자 : %d\n", j, card[j].kind, j, card[j].number);
		}
		
	}
}
