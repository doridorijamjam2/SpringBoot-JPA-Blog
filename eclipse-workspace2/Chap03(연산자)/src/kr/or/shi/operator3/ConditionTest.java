package kr.or.shi.operator3;

/*
 *  두 수를 받아서 더 큰 수를 출력하세요.
 *  입력1 : 80
 *  입력2 :90
 *  큰 수는 : 90
 */ 
 

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		
		int max;
		System.out.println("두 수를 받아서 더 큰 수를 출력하세요.\n");
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		System.out.printf("입력1 : %d\n", n);
		
		int n2 = scan.nextInt();
		System.out.printf("입력2 : %d\n", n2);
		
		
		max = (n > n2) ? n : n2;
		System.out.println("큰 수는 : " + max);
		

	}

}
