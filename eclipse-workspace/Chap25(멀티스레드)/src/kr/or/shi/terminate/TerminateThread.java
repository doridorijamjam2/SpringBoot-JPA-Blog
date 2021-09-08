package kr.or.shi.terminate;

import java.io.IOException;

/*
 * Thread 종료하기
 *   : 데몬등 무한 반복하는 thread가 종료 될수 있도록 run()메서드 내의 while문을 활용.
 *     Thread.stop()은 사용하지 않음.
 */

public class TerminateThread extends Thread{
	
	private boolean flag = false;
	int i;
	
	public TerminateThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		while(!flag) {
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName());
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public static void main(String[] args) throws IOException {
		TerminateThread thread1 = new TerminateThread("A");
		TerminateThread thread2 = new TerminateThread("B");
		
		thread1.start();
		thread2.start();
		
		int in;
		while (true) {
			in = System.in.read();
			if(in == 'A') {
				thread1.setFlag(true);           //첫번째 스레드를 멈추게 함.
			}
			else if (in == 'B') {
				thread2.setFlag(true);           //두번째 스레드를 멈추게 함.
			}
			else if(in == 'M') {
				thread1.setFlag(true);
				thread1.setFlag(true);
				break;
			}
		}
		System.out.println("main end");
	}

}
