package kr.or.shi.system;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {
		
		System.out.print("알파벳 하나를 입력하고 [Enter]를 누르세요. : ");
		
		int i;
		
		try {
			
			InputStreamReader isr = new InputStreamReader(System.in);
			while((i = isr.read()) != '\n') {
				System.out.print((char)i);
				//System.out.print(i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e);
		}
		

	}

	private static Object print(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
