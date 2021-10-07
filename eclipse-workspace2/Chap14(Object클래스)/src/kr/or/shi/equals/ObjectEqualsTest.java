package kr.or.shi.equals;

public class ObjectEqualsTest {

	public static void main(String[] args) {
		Object object1 = new Object();
		Object object2 = new Object();
		
		boolean result1 = object1.equals(object2);
		System.out.println("equals() : " + result1);
		
		boolean result2 = (object1 == object2);
		System.out.println("== 연산자 : " + result2);
		

	}

}
