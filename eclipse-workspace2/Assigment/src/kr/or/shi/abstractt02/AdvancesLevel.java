package kr.or.shi.abstractt02;

public class AdvancesLevel extends PlayerLevel{

	@Override
	public void showLevelMessage() {
		System.out.println("============고급자 레벨입니다.==============");
		
	}
	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 jump 합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn 잘해요.");
		
	}


}
