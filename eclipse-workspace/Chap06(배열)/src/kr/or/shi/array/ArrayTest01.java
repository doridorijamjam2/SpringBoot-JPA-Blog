package kr.or.shi.array;

public class ArrayTest01 {

	public static void main(String[] args) {

		// score 참조변수임.
		int[] score = null;
		// 메모리 할당이 안되었는데, 값을 대입하고 있음(문법 에러)
		// score = {100, 200};

		// score는 5개의 메모리 공간을 heap에다가 생성하고 있음.(20바이트)
		score = new int[5];

		// 배열명이 곧 주소임.
		System.out.println("score의 주소값 : " + score);

		for (int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}
		System.out.println();

		// score[0]는 변수와 동일함.
		// score는 주소임. []안에 들어가는 숫자를 인데스(첨자)라고 함.
		score[0] = 100;
		for (int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}
		System.out.println();

	
		for (int i = 0; i < score.length; i++) {
			score[i] = 10 + i;
		
		}
		for (int i = 0; i < score.length; i++) {
		System.out.println("score[" + i + "] = " + score[i]);
		}

	}

}
