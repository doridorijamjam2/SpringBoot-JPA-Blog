package kr.or.shi.thread02;

/*
 * 1. Process
 *       : 실행중인 프로그램
 *         OS로부터 메모리를 할당 받음.
 * 2. Thread
 *       : 실제 프로그램이 수행되는 작업의 최소 단위
 *         하나의 프로세스는 하나 이상의 Thread를 가지게 됨.
 *         스레드들은 동시에 실행 가능.
 *         프로세스 안에 있으므로, 프로세스의 데이터를 모두 접근 가능.
 * 3. Thread 장점
 *       : CPU 활용도를 높이고,
 *       : 성능 개선 가능
 *       : 응답성 향상
 *       : 자원 공유 효율
 *    Thread 단점
 *       : 하나의 스레드 문제가, 프로세스 전반에 영향을 미침
 *       : 여러 스레드 생성시 성능 저하 가능
 * 4. Thread 구현하기
 *       1) 자바 Thread 클래스부터 상속 받아 구현    
 *       2) Runnable 인터페이스 구현
 *           - 자바는 다중 상속이 허용되지 않으므로 이미 다른 클래스를 상속한 경
 *             thread를 만드려면 Runnable interface를 implements 하도록 함. 
 */

class MyThread implements Runnable{

	@Override
	public void run() {
		int i;
		for(i=0; i<=50; i++) {
			System.out.print(i + "\t");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}

public class MyThreadTest {
	
	public static void main(String[] args) {
		
		System.out.println("start");
//		Thread thread= Thread.currentThread();
//		System.out.println("프로그램 시작 스레드 이름 : " + thread.getName());
		
		MyThread runner1 = new MyThread();
		Thread thread1 = new Thread(runner1);          //thread 생성
		thread1.start();
		
		
		MyThread runner2 = new MyThread();
		Thread thread2 = new Thread(runner2);           //thread 생성
		thread2.start();
		
		
		System.out.println("end");
		
	}

}
