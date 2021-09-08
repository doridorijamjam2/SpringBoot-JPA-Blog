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
 */

public class JoinTest {

}
