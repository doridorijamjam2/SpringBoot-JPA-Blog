package kr.or.shi.multithread01;

/*
 * 1. Multi-thread 프로그래밍
 *  - 동시에 여러 개의 Thread가 수행되는 프로그래밍.
 *  - Thread는 각각의 작업공간(context)를 가짐.
 *  - 공유 자원이 있는 경우 race condition이 발생.
 *  - critical section에 대한 동기화(sysnchronization)의 구현이 필요.
 *  
 *  
 * 2. Thread status
 *                                      <Run>
 *                                      thread
 *                                      |
 *                                      | CPU 배분
 *                                      |          sleep().wait(),join()
 *          start -------------> <Runnable> ----------------------------------> <Not Running>
 *                               thread thread thread 
 *                               thread thread thread
 *                               thread thread thread
 *                                          <----------------------------------
 *                                      |    	   sleep(시간) -> 시간이지나면
 *                                      |    	   wati() -> notify(), notifyAll()                                      
 *                                      |          join() -> other thread exit 
 *                                      |    
 *                                      |    
 *                                      | thread 종료
 *                                    Dead    
 *                                  
 *  3. join() 메서드
 *    :
 *       Thread1                                  Thread2                                 
 *          |                                        |
 *          |                                        |
 *          |--------------------------------------->|
 *                                                   |
 *        (Non-Runnable)                             |                                 
 *                                                   |
 *           <---------------------------------------|
 *          |
 *          |
 *      다른 thread의 결과를 보고 진행해야 하는 일이 있는 경우 join() 메서드를
 *      활용, join() 매소드를 호출한 Thread가 Non-Runnable 상태가 됨.
 */

public class JoinTest extends Thread{
	
	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		int i;
		for(i =start; i<=end; i++) {
			total += i;
		}
	}
	
	public static void main(String[] args) {
		 JoinTest jt1 = new JoinTest(1, 50);
		 JoinTest jt2 = new JoinTest(51, 100);
		 
		 jt1.start();
		 jt2.start();
		 
		 try {
			jt1.join();      //스레드 상태 제어
			jt2.join();      //jt1, jt2에 join을 main스레드가 요청하고 main스레드는 기다림.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 int total = jt1.total + jt2.total;
		 
		 System.out.println("jt1.total = " + jt1.total);
		 System.out.println("jt1.total = " + jt2.total);
		 System.out.println(total);
	}

}
