package kr.or.shi.loop2;

/*
 *   *   *
 *    * *
 *     *
 *    * *
 *   *   * 
 *  그려보자!
 */

public class XTest {
	
	public static void main(String[] args) {
		
		int x = 1;
		int y = 5;
		
		for(int i = x ; i <= 5; i++) {
			for(int j = 0; j <= 5; j++) {
				if(j == x || j == y) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				//System.out.print("*");
			}
			System.out.println();
			x++;
			y--;
		}
		
		
	}
}
//풀이 해봐야함...