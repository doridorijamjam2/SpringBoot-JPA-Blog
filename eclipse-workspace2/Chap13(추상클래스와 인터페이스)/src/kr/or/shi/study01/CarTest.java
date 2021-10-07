package kr.or.shi.study01;

public class CarTest {

	public static void main(String[] args) {
		
		Car sCar = new Sonata();
		sCar.start();
		sCar.drive();
		sCar.stop();
		sCar.turnoff();
		
		System.out.println("===============================");
		
		Car aCar = new Avante();
		aCar.start();
		aCar.drive();
		aCar.stop();
		aCar.turnoff();
		
		System.out.println("===============================");
		
		Car gCar = new Grandeur();
		gCar.start();
		gCar.drive();
		gCar.stop();
		gCar.turnoff();
		
		System.out.println("===============================");
		
		Car GCar = new Genesis();
		GCar.start();
		GCar.drive();
		GCar.stop();
		GCar.turnoff();

	}

}
