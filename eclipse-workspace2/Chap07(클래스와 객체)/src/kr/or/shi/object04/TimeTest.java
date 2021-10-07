package kr.or.shi.object04;

public class TimeTest {

	public static void main(String[] args) {
		 Time t1 = new Time();
		 // t1.hour = 10;      (private으로 불가)
		 
		 System.out.println(t1.getHour());
		 
		 System.out.println(t1);
		 
		 //hour를 설정.
		 t1.setHour(10);
		 //minute를 설정.
		 t1.setMinute(30);
		 //Second를 설정.
		 t1.setSecond(50);
		 
		 System.out.println(t1);
		 
		 t1.setHour(50);
		 t1.setMinute(100);
		 t1.setSecond(500);
		 System.out.println(t1);

	}

}
