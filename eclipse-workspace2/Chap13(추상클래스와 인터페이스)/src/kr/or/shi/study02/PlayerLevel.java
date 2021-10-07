package kr.or.shi.study02;

public abstract class PlayerLevel extends Player{
	
	
	public abstract void jump();
	public abstract void run();
	public abstract void showLevelMessage();
	public abstract void turn();
	
	@Override
	public void play(int a) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void upgradeLevel() {
		// TODO Auto-generated method stub
		
	}
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public final void go() {
		showLevelMessage();
		run();
		jump();
		turn();
		
	}

}
