package kr.or.shi.interrupt;

/*
 *  interrupt() 메서드
 *     : 다른 thread에 예외를 발생시키는 interrupt를 보냄.
 *       thread기 join(), slepp(), wait() 메서드에 의해 블럭킹(blocking) 되었다면 interrupt에 의해 다시 runnable 상태가 될수 있음.
 */

public class InterruptTest extends Thread{
	
	int i;
	@Override
	public void run() {
		for(i=0; i<100; i++) {
			System.out.println(i);
		}
		
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
			System.out.println("Wake!!");
		}
	}
	
	public static void main(String[] args) {
		
		InterruptTest test = new InterruptTest();
		test.start();
		
		test.interrupt();
		
		System.out.println("end");
	}
	

}
