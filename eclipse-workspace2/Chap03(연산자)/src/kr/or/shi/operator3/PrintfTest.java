package kr.or.shi.operator3;
/*
 * printf() : 형식을 지정해주고 해당 형식에 맞는 값을 직접 넘겨줘서 출력함.
 */

public class PrintfTest {

	public static void main(String[] args) {
		// 1. 10진법 정수 ('d'ecimal)
		int number = 2800;
		System.out.println("===========1. Decimal=========");
		
		// 10진법 정수를 그대로 출력하시오.
		System.out.printf("A. [%d]\n", number);
		
		
		//10진법 정수를 오른쪽 정렬 5자리로 출력하시오.
		System.out.printf("B. [%5d]\n", number);
		
		// 10진법 정수를 오른쪽 정렬 3자리로 출력하시오.
		// 만약 출력해야할 내용이 지정된 자리수보다 많으면 자리수 지정은 무시됨.
		System.out.printf("C. [%3d]\n", number);
		
		//10진법 정수를 왼쪽 정렬 5자리로 출력하시오.
		System.out.printf("D. [%-5d]\n", number);
		
		//10진법 정수를 오른쪽 정렬 5자리로 맞추고, 왼쪽 공백을 0으로 출력하시오.
		System.out.printf("E. [%05d]\n", number);
		
		
		
		
		// 2. 16진법 정수 (He'x'adecimal)
		System.out.println("===========2. HexDecimal=========");
		
		//16진법 정수를 자릿수는 그대로, 알파벳은 소문자로 출력하시오.
		System.out.printf("A. [%x]\n", number);
		
		//16진법 정수를 자릿수는 그대로, 알파벳은 대문자로 출력하시오.
		System.out.printf("B. [%X]\n", number);
		
		//16진법 정수를 5자리 오른쪽 정렬하고, 알파벳은 대문자로 출력하시오.
		System.out.printf("C. [%5X]\n", number);
		
		//16진법 정수를 5자리 왼쪽 정렬하고, 알파벳은 대문자로 출력하시오.
		System.out.printf("D. [%-5X]\n", number);
		
		//16진법 정수를 5자리 왼쪽 정렬하고, 알파벳은 소문자로 출력하시오.
		System.out.printf("E. [%-5x]\n", number);
		
		//16진법 정수를 5자리 오른쪽 정렬하고, 알파벳은 대문자로 출력하시오.
		System.out.printf("F. [%05X]\n", number);
		
		
		
		
		// 3. 실수형 ('f'loat)
		double d = 123.45;
		
		System.out.println("===========3. float=========");
		
		//실수를 그대로 출력하시오.
		System.out.printf("A. [%f]\n", d);
		
		//실수를 15자리 오른쪽 정렬로 출력하시오.
		System.out.printf("B. [%15f]\n", d);
		
		//실수를 소수점 1번째 차리까지 출력하시오.
		System.out.printf("C. [%.1f]\n", d);
		
		//실수를 15자리 오른쪽 정렬하고, 소수점 1번째 자리까지 출력하시오.
		System.out.printf("D. [%15.1f]\n", d);
		
		//실수를 15자리 왼쪽 정렬하고, 소수점 3번째 자리까지 출력하시오.
		System.out.printf("E. [%-15.3f]\n", d);
		
		//실수를 15자리 오른쪽 정렬하고, 왼쪽 빈자리는 0으로, 소수점 3번째 자리까지 출력하시오.
		System.out.printf("F. [%015.3f]\n", d);

		
		System.out.println("===========3. float=========");
		String str1 = new String("abcDEF");
		
		//String을 그래도 출력하시오.
		System.out.printf("A. [%s]\n", str1);
		
		//String을 모두 대문자로 바꿔서 출력하시오.
		System.out.printf("B. [%S]\n", str1);
		
		
		// printf()를 사용할때 주의할 점
		// 1. %문자와 넘겨받는 값의 종류가 다르면 에러가 발생함.
		//System.out.printf("%d" , 3.4);
		// 2. 존재하지 않는 %문자를 사용하면 에러가 발생함.
		//System.out.printf("%z" , 3);
		// 3. %문자의 갯수보다 넘어오는 값의 갯수가 많으면 문제 없음.
		//System.out.printf("%d %d" , 1,2,3,4);
		// 4. %문자의 갯수가 넘어오는 값의 갯수보다 많으면 문제 발생함.
		//System.out.printf("%d %d %d" , 1);
		

	}

}
