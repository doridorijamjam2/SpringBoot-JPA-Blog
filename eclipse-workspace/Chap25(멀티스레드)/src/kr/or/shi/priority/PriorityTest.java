package kr.or.shi.priority;

public class PriorityTest {
	public static void main(String[] args) {
		//메인스레드
		Thread thread0 =Thread.currentThread();
		System.out.println(thread0.getName() + ":" + thread0.getPriority());

		for(int i=1; i<=20; i++) {
			Thread thread = new CalcThread("Thread : " + i);
			
			if(i != 20) {
				thread.setPriority(Thread.MIN_PRIORITY);
			}
			else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}

}
