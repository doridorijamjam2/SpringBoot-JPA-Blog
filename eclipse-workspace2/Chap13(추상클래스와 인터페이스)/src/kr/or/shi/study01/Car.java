package kr.or.shi.study01;


public abstract class Car {
	
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();

	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public final void run() {
		startCar();
		start();
		drive();
		stop();
		turnOff();
		
	}
	
	

}

