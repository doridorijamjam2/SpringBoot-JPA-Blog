package Algorithm;

import java.util.Scanner;

public class A2562 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		
		int max = 0;
		int number = 0;
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
				number = (i+1);
			}
		}
		System.out.println(max);
		System.out.println(number);
		

	}

}
