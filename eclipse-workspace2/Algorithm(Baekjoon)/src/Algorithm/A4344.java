package Algorithm;

import java.util.Scanner;

public class A4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int student[];
		for(int i=0; i<c; i++) {
			int n = sc.nextInt();
			student = new int[n];
			double sum = 0;
			for(int j=0; j<n; j++) {
				int val = sc.nextInt();
				student[j] = val;
				sum += val;
			}
			double mean = (sum /n);
			double count = 0;
			
			for(int j=0; j<n; j++) {
			
					if(student[j] > mean) {
						count++;
					}
				}
			System.out.printf("%.3f%%\n", (count/n)*100);
		}

	}

}
