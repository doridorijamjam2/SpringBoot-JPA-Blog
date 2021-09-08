package kr.or.shi.study;

public class CardCompany {
	
	private static CardCompany company = new CardCompany();
	
	private CardCompany instance;
	
	private CardCompany() {}
	
	public static CardCompany getInstance() {
		return company;
		
	}
	
	public Card createCard() {
		 Card card = new Card();
		return card;
	}
	
	
	
}
