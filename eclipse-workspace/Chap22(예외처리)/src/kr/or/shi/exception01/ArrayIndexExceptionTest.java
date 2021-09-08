package kr.or.shi.exception01;

public class ArrayIndexExceptionTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		try {
			
		for(int i=0; i<=5; i++) {
			System.out.println(arr[i]);
		   }
	    } catch (ArrayIndexOutOfBoundsException e) {
	    	System.out.println(e.getMessage());
	    	System.out.println(e.toString());
	    }
		System.out.println("프로그램이 예외가 발생되고 비정상적으로 종료됨.");

	}

}
