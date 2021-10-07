package kr.or.shi.inheritance01;

/*
 *  상속을 하는 이유
 *      1) 공통괸 코드는 조상에서 관리
 *      2) 개별적인 부분은 자손에서 따로 관리
 *      3) 코드의 재사용
 */

public class MoutainBicycle extends Bicycle{
	
	
		//멤버 변수 : 5개
		String frame;
		int gear;
		int price;
		String tire;
		
		public void print() {
			System.out.println("id : " + this.id);
			System.out.println("brand : " + this.brand);
			System.out.println("frame : " + this.frame);
			System.out.println("gear : " + this.gear);
			System.out.println("price : " + this.price);
			System.out.println("owner : " + this.owner);
		}
		
		public static void main(String[] args) {
			MoutainBicycle mBicycle = new MoutainBicycle();
		    mBicycle.id = 1216;
		    mBicycle.brand = "LESPO";
		    mBicycle.frame = "알루미늄";
		    mBicycle.gear = 33;
		    mBicycle.price = 30000;
		    mBicycle.owner = "류현진";
		    
		    
		    mBicycle.print();
			
		}
	
}
