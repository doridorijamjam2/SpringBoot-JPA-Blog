package Algorithm;

import java.util.Scanner;

public class A1110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count = 0;
		int cp = n;
		
		while(true) {
			n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
			count++;
			if(cp == n) {
				break;
			}
			
		}
		
		System.out.println(count);
		

	}

}
