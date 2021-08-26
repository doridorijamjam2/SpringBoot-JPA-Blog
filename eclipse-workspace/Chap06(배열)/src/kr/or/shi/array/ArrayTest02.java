package kr.or.shi.array;

public class ArrayTest02 {

	public static void main(String[] args) {
		 
		int sum = 0;
		double avg = 0.0;
		
		//선언과 동시에 초기화
		//int[] score = {100, 200, 300};
		
		int[] score = new int[] {100, 200, 300};
		
		System.out.println(" 배열의 크기 : " + score.length);
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		avg = sum / score.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		

	}

}
