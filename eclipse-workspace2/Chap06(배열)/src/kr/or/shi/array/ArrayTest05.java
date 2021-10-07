package kr.or.shi.array;

import java.util.Arrays;

public class ArrayTest05 {

	public static void main(String[] args) {
		
		int[] ball = new int[5];
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = (int)(Math.random()*45) + 1;
		}
		System.out.println("정렬 전");
		for(int i=0; i<ball.length; i++) {
			System.out.print(ball[i] + " ");
		}
		
		//버블정렬을 위해서는 반드시 1차원 배열이더라도 더블루프가 필요하고, 조건문 하나 들어와야함.
//		for(int i=0; i<ball.length; i++) {
//			for(int j=0; j<ball.length-1; j++) {
//				//버블정렬 해당
//				if(ball[j] < ball[j+1]) {  
//					int temp = ball[j];
//					ball[j] = ball[j+1];
//					ball[j+1] = temp;
//				}
//				
//			}
//		}
		
		//아래 한줄로 대처 가능함.
		Arrays.sort(ball);  //오름차순 정렬.
		
		System.out.println();
		System.out.println("정렬 후");
//		for(int i=0; i<ball.length; i++) {
//			System.out.print(ball[i] + " ");
//		}
		
		System.out.println(Arrays.toString(ball));

	}

}
