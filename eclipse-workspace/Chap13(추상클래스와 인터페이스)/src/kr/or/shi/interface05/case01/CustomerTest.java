package kr.or.shi.interface05.case01;

public class CustomerTest {
	public static void main(String[] arg) {
	Customer customer = new Customer();
	customer.buy();
	customer.sell();
	customer.order();
	customer.sayHello();
	
	System.out.println();
	
	Buy buyer = customer;          //upcating
	buyer.buy();
	buyer.order();
	
	System.out.println();
	
	Sell seller = customer;        //upcating
	seller.sell();
	seller.order();
	
		
	}

}
