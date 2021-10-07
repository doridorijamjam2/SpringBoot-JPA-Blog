package Algorithm;

import java.util.Scanner;

public class A10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int a = sc.nextInt();
		int b;
		
		for(int i=0; i<N; i++ ) {
			b = sc.nextInt();
			if(a > b)
				System.out.print( b + " ");
		}

	}

}
