package Algorithm;

import java.util.Scanner;

public class A8958 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String arr[] = new String[sc.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next();
		}
		sc.close();
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			int sumok = 0;
			for(int j=0; j<arr[i].length(); j++) {
				char array[] = arr[i].toCharArray();
				if(array[j] == 'o') {
					sum++;
				}
				else {
					sum = 0;
				}
				sumok += sum;
			}
			System.out.println(sumok);
		}
	}

}
