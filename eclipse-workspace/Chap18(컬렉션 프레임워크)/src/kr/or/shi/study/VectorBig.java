package kr.or.shi.study;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

import kr.or.shi.vector.Board;

public class VectorBig {
	
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		
		vector.add(12);
		vector.add(32);
		vector.add(56);
		vector.add(32);
		vector.add(11);
		vector.add(100);
		vector.add(-1);	
		
	
		System.out.print("정수(-1이 입력될 때까지) >> " + vector);
		
		
		System.out.println();
			
			
		Object obj = Collections.max(vector);
		System.out.println("가장 큰 수는："+obj);
	}

}
