package Algorithm;

import java.util.Scanner;

public class A1546 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int score[] = new int[n];
        for (int i=0; i<n; i++)
        	score[i] = scanner.nextInt();
        int M = score[0];
        for (int i=1; i<n; i++) {
        	if (M<score[i]) M=score[i];
        }
        double ans = 0.0;
        for (int i=0; i<n; i++)
        	ans += (double)score[i] / (double)M * 100.0;
        ans = ans / (double)n;
        System.out.println(ans);
        
        scanner.close();
	}
}

