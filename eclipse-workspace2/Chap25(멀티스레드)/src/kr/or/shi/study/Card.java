package kr.or.shi.study;

public class Card {
	private int cardNumber;
	private static int serialNum = 20211216;
	
	public Card() {
		serialNum++;
		cardNumber = serialNum;
		
		
	}
	public int getCardNumber() {
		return cardNumber;
		
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	


}
