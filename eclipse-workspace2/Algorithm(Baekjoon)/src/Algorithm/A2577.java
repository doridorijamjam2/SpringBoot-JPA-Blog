package Algorithm;

import java.util.Scanner;

public class A2577 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		
		int[] arr = new int[10];
		
		while(value != 0) {
			arr[value%10]++;
			value /= 10;
		}
		for(int result : arr) {
			System.out.println(result);
		}


	}

}
