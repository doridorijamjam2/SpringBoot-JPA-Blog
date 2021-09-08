package kr.or.shi.interface01;

public class Television implements RemoteControl{
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Television 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Television 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		//볼륨이 1~10사이에서만 움직일 것으로 프로그래밍 함.
				if(volume > RemoteControl.MAX_VOLUME) {
					System.out.println("TV 불륨의 최대치 값은 10입니다.");
					this.volume = RemoteControl.MAX_VOLUME;
				}
				else if(volume < RemoteControl.MIN_VOLUME) {
					System.out.println("TV 불륨의 최소치 값은 0입니다.");
					this.volume = RemoteControl.MIN_VOLUME;
				}
				else {
					this.volume = volume;
				}
				System.out.println("현재 TV 볼륨 : " + this.volume);
		
	}

}
