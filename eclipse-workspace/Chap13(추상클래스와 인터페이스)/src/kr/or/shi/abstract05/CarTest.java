
package kr.or.shi.abstract05;

public class CarTest {

	public static void main(String[] args) {
		
		Car aicar = new AICar();
		aicar.run();
		
		System.out.println();
		Car mcar = new MenualCar();
		mcar.run();

	}

}
