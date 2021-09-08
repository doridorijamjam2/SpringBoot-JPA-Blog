package kr.or.shi.interface01;


//인터페이스의 본질은 추상메서드임.
public interface RemoteControl {
	
	//상수 (static final) --부수적 개념
	int MAX_VOLUME =10;
	int MIN_VOLUME =0;
	
	//추상메서드 (abstract)
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	

}
