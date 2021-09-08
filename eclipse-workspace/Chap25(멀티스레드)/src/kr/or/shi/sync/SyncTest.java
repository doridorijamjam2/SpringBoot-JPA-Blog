package kr.or.shi.sync;


/*
 * 1. 동기화(Synchronization) 이슈
 *      1) 동기화 : 작업들 사이에 실행 시기를 맞추는 것.
 *      2) 여러 스레드가 동일한 자원(데이터) 접근시 동기화 이슈 발생.
 *          - 동일 자원을 여러 스레드가 동시 수정시, 각 스레드 결과에 영향을 줌.
 *          
 * 2. 동기화 이슈 해결 방안
 *      1) 상호배제 (Mutual exclusion)
 *          - 임계 영역 (Critical section)
 *          - 임계 자원 (Critical resource)에 대한 접근을 막기위해 Locking 메커니즘.
 *      2) 스레드는 프로세스 모든 데이터를 접근할수 있으므로,
 *          - 여러 스레드가 변경하는 공유 변수에 대해 배타적인 접근 필요로함.
 *          - 어느 한 스레드가 공유 변수를 갱신하는 동안 다른 스레드가 동시 접근하지 못하도록 막음.    
 *      3) thread간의 순서를 맞추는 동기화가 필요.
 *      4) 동기화를 잘못 구현하면 deadlock에 빠질 수 있음.
 *      
 * 3. 자바에서 동기화 구현
 *      1) synchronized 수행문과 synchronized 메서드를 이용.
 *      
 *      2) synchronized 수행문
 *      
 *          synchronized() {
 *          
 *          }
 *          참조형 수식에 해당되는 객체에 lock을 건다.
 *   
 *   
 *      3) synchronized 메서드
 *          현재 이 메서드가 속해 있는 객체에 lock을 건다.
 */

class Bank { // Critical section
	private int money = 10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void saveMoney(int save) {
		synchronized (this) {
			int m = this.getMoney();

			try {
				Thread.sleep(3000); // 저축하는데 3초 걸림(쉼)
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			setMoney(m + save);
		}
		}
		
		

	public void minusMoney(int minus) {
		synchronized (this) {
			int m = this.getMoney();

			try {
				Thread.sleep(200); // 저축하는데 0.2초 걸림(쉼)
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			setMoney(m - minus); // 내가 갖고있는 돈에서 마이너스됨.
		}
	
	}
	
}
	class Ryu extends Thread{
		
		public void run() {
			System.out.println("start save");
			SyncTest.myBank.saveMoney(3000);     //3000원 저금함.
			System.out.println("After save money" + SyncTest.myBank.getMoney());
		}
	}
	class RyuWife extends Thread{
		@Override
		public void run() {
			System.out.println("start minus");
			SyncTest.myBank.minusMoney(1000);        //1000원 소비함
			System.out.println("After minus money" + SyncTest.myBank.getMoney());
		}
	}


public class SyncTest {

	public static Bank myBank = new Bank();
	
	public static void main(String[] args) throws InterruptedException {
		Ryu ryu = new Ryu();
		ryu.start();
		
		Thread.sleep(200);
		
		RyuWife ryuwife = new RyuWife();
		ryuwife.start();
	}

}
