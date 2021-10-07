package kr.or.shi.study02;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyTest {

	public static void main(String[] args) {
		
		int[] data = {1,3,3,2,1,1,3,0,1,2};
		
		//data 배열내 숫자가 배열(arr)이 인덱스로 적용해서 해당 인덱스의 요소 값을 1씩 증가시킨다.
		int[] arr = new int[4];
//		int count = 0;
		
		for(int i=0; i<data.length; i++) {
			arr[data[i]]++;
			
		for(int i1=0; i1<arr.length; i1++)
			System.out.println(i1 + "번 숫자 --> " + arr[i1] + "회");
		System.out.println();
//			if(data[i] == 0) {
//				count++;
//			}
		}
//		System.out.println("0번 숫자 --> " + count);
		
		
		
		
//		Integer[] b = Arrays.stream(data).boxed().toArray(Integer[]::new);
//		System.out.println("0번 숫자 --> "Collections.frequency(Arrays.asList(b), 0));
//		System.out.println("1번 숫자 --> "Collections.frequency(Arrays.asList(b), 1));
//		System.out.println("2번 숫자 --> "Collections.frequency(Arrays.asList(b), 2));
//		System.out.println("3번 숫자 --> "Collections.frequency(Arrays.asList(b), 3));
				
	

	}

}
