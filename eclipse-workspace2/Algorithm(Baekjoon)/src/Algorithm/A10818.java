package Algorithm;

import java.util.Scanner;

public class A10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int min = 1000000;
		int max = -1000000;
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
		arr[i] = sc.nextInt();
		if(max < arr[i]) {
			max = arr[i];
		}
		if(min> arr[i]) {
			min = arr[i];
		}
			
			
		}
		System.out.println(min + " " + max);
		
	}

}
