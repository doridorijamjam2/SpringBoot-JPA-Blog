package kr.or.shi.arraylist02;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ArrayList
 *    - 객체 배열 클래스
 *    - Vector는 자바2부터 제공된 클래스
 *    - 일반적으로 ArrayList를 더 많이 사용.
 *    - Vector는 멀티 쓰레드 프로그램에서 동기화를 지원
 *    - 동기화(synchronization) : 두 개의 쓰레드가 동시에 하나의 리소스에 접근할때 순서를 맞추어서 접근을 함으로써 데이터의 오류가 일어나지 않도록 함.
 */

public class ArrayListTest02 {
	
	public static void print(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		System.out.println("list1 : " + list1.toString());
		System.out.println("list2 : " + list2.toString());
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		//sublist(): 마지막 인덱스를 포함하지 않고 List타입으로 리텀함
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		
		print(list1, list2);
		
		//정렬하기
		System.out.println("정렬 후");     
		Collections.sort(list1);        //정렬은 기본적으로 오름차순임.
		Collections.sort(list2);
		
		print(list1, list2);
		
		//포함관계
		System.out.println("lis1컬렉션에 list2컬렉션의 모든 요소가 들어있느냐?");
		System.out.println(list1.containsAll(list2));
		System.out.println();
		
		list2.add("B");          //배열복사가 일어나지 않음.
		list2.add("C");          //배열복사가 일어나지 않음.
		print(list1, list2);
		
		list2.add(3, "A");       //배열 복사 일어남.
		print(list1, list2);
		
		list2.add(3, "AA");       //배열 복사 일어남.
		print(list1, list2);
		
		//list2에서 list1에 포함된 객체들을 삭제하기
		System.out.println("포함된 객체들을 삭제하기");
		//tip : contains(), remove()
		for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1, list2);
		
		//list1 : [0, 1, 2, 3, 4, 5]
		//list1 : [AA, B, C]
		
		
		
		

	}

}
