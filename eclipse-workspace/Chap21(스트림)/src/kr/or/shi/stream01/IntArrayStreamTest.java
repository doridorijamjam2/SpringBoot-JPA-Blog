package kr.or.shi.stream01;

import java.util.Arrays;
/*
 * 스트림(Stream)
 *  1)자료의 대상과ㅑ 상관없이 동일한 연산을 수행할수 있는 기능(자료의 추상)
 *  2)배열, 컬렉션에 동일한 연산이 수행되어 일관성 있는 처리 가능
 *  3)한번 생성하고 사용한 스트림은 재사용할수 없음
 *  4)스트림 연산은 기존 자료를 변경하지 않음.
 *  5)중간 연산은 최종 연산으로 구분 됨.
 *  6)최종 연산이 수핼되어야 모든 연산이 적용
 */
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		for(int num : arr) {
			System.out.println(num);
		}
		System.out.println();
		
		//IntStream을 생성하고, 하나씩하나씩 꺼내는 연산자로 람다식으로 배열 내용을 출력됨.
		Arrays.stream(arr).forEach(n -> System.out.println(n));
		System.out.println();
		
		//위 파이프라인 풀이
		IntStream intStream = Arrays.stream(arr);
		intStream.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		//intStream을 다시 사용하지 못함. 한번 연산이 되고 나서는 소모가 되버림.
		//다른 연산을 하고자 한다면 다시 스트림을 생성해야됨.
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);

		
	}

}
