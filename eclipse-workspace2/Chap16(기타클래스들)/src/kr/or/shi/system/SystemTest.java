package kr.or.shi.system;

public class SystemTest {

	public static void main(String[] args) {
		//프로그램의 성능을 테스트 할때 사용하면 유용한 메서드
		long sum = 0;
		
		//long start = System.currentTimeMillis();
		long start = System.nanoTime();			//10의 9승분의 1
		for(long i=1; i<1000000000; i++) {
			sum += i;
		}
		//long end = System.currentTimeMillis();
		long end = System.nanoTime();
		
		System.out.println(sum);
		System.out.println("소요된 시간 : " + (end - start) + "ns");
		System.out.println("소요된 시간 : " + (end - start)/1000000000.0 + "초");
		
	}
}





