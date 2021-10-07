package kr.or.shi.array;

import java.util.Arrays;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		 //40바이트가 힙에 생성됨
		int[] arr1 = new int[10];
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 10) + 1; 
		}
			
			for(int i=0; i<arr1.length; i++) {
				if(i !=9) {
					System.out.print(arr1[i]+ ",");
				}
				else {
					System.out.print(arr1[i]);
					
				 System.out.println();
				 
				 //Arrays클래스는 배열을 조작하기 쉽게 만들어 놓은 유틸리티 클래스
				 System.out.println(Arrays.toString(arr1));
				 System.out.println();
				 
				
				 //6바이트가 힙에 생성됨.
				char[] arr2 = new char[] {'a', 'b', 'c'};
				System.out.println(Arrays.toString(arr2));
				
				String[] str = new String[10];
				boolean[] bool = new boolean[10];
				
				System.out.println(arr1);
				System.out.println(arr1.toString());
				
				System.out.println(str);
				System.out.println(bool);
				
				//char타입만 주소를 출력하려면 toString()호출 해야함.
				System.out.println(arr2);
				System.out.println(arr2.toString());
				 
				}
			}
		
		}

}

