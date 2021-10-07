package kr.or.shi.object04;

public class Time {

	/*
	 * 접근제어자(Access Modifier)의 종류 
	 * private : 같은 클래스에서만 접근 가능함. 
	 * protected : 같은 패키지, 자손클래스에서만 접근이 가능함. 
	 * (default) : 같은 패키지에서만 접근 가능함. 
	 * public : 누구나 다 접근 가능함.
	 */
	
	/*
	 * 멤버변수는 대개 private 접근제어자로 선언하고(캡슐화),
	 * 각 멤버변수는 해당하는 getter()를 제공해주는 방법으로 클래스를 작성함.
	 */

	private int hour;
	private int minute;
	private int second;

	/*
	 * getter() : 멤버변수의 값을 읽어가는 메서드 setter() : 멤버변수의 값을 수정하는 메서드
	 * 
	 * source메뉴 => Generate getter and setter를 클릭 후 원하는 멤버변수를 체크해서 getter, setter
	 * 메서드를 자동완성하면 됨.
	 */

	public int getHour() {
		return this.hour;
	}

	public int getMinute() {
		return this.minute;
	}

	public int getSecond() {
		return this.second;
	}

	public void setHour(int hour) {
		// hour에 대한 에외처리 코드를 작성
		if (hour < 0 || hour > 23) {
			System.out.println("시간을 잘못 입력했습니다.");
			return;
		}
		this.hour = hour;
	}

	public void setMinute(int minute) {
		// minute에 대한 에외처리 코드를 작성
		if (minute < 0 || minute > 59) {
			System.out.println("분을 잘못 입력했습니다.");
			return;
		}
		this.minute = minute;
	}

	public void setSecond(int second) {
		// second에 대한 에외처리 코드를 작성
		if (second < 0 || second > 59) {
			System.out.println("초를 잘못 입력했습니다.");
			return;
		}
		this.second = second;
	}
	@Override
	public String toString() {
			return this.getHour() + "시" +
					this.getMinute() + "분" +
					this.getSecond() + "초 입니다.";
	}

}
