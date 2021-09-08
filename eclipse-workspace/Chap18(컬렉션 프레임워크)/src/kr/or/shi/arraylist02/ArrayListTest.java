package kr.or.shi.arraylist02;

import java.util.ArrayList;

/*
 * 1. 컬렉션 프레임워크
 *   1) 프로그램 구현에 필요한 자료 구조(Data Structure)를 구현해 놓은 JDK 라이브러리
 *   2) java.util 패키지에 구현되어 있음.
 *   3) 개발에 소요되는 시간을 절약하면서 최적화 된 알고리즘을 사용할수 있음.
 *   4) 여러 구현 클래스와 인터페이스 활용에 대한 이해가 필요함.
 * 
 * 2. Collection 인터페이스
 *  - 하나의 객체를 관리하기 위한 메서드가 선언된 인터페이스.
 *  - 하위에 List와 Set 인터페이스가 있음.
 * 
 * 3. List 인터페이스
 *  - 객체를 순서에 따라 저장하고 관리하는데 필요한 메서드가 선언된 인터페이스
 *  - 자료구조 리스트(배열, 연결리스트)의 구현을 위한 인터페이스
 *  - 중복을 허용함
 *  - ArrayList, Vector, LinkedList, Stack, Queue 등 ....
 * 
 * 4. Set 인터페이스
 *  - 순서와 관계없이 중복은 허용하지 않고 유일한 값을 관리하는데 필요한 메서드가 선언됨.
 *  - 아이디, 주민번호, 사번등을 관리하는데 유용.
 *  - 저장된 순서와 출력되는 순서는 다를 수 있음.
 *  - HashSet, TreeSet 등...
 *  
 * 
 * 5. Map 인터페이스
 *  - 쌍(Pair)로 이루어진 객체를 관리하는데 사용하는 메서드들이 선언된 인터페이스
 *  - 객체는 key-value의 쌍으로 이루어짐
 *  - key는 중복을 허용하지 않음
 *  - HashTable, HashMap, Poperties, TreeMap 등 Map 인터페이스를 구현함.
 */
public class ArrayListTest {

	public static void main(String[] args) {
		
		//기본적으로 10개의 공간을 생섬함.
		ArrayList list = new ArrayList();
		
		//저장된 객체가 하나도 없기 때문에 0을 리턴함.
		System.out.println("총 크기 : " + list.size());
		
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("444");


		System.out.println("총 크기 : " + list.size());
		
		
		list.add("333");
		System.out.println("총 크기 : " + list.size());
		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		//0번째 인덱스에 "333" 추가하기
		list.add(0, "333");
		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		//객체 삭제하기
		//앞에서부터 검색하여 "333"을 삭제함(가까운 것 한개만 삭제)
		list.remove("333");
		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		//저장된 객체의 인덱스를 찾아오기(없으면 -1 리턴)
		System.out.println("index = " + list.indexOf("333"));
		System.out.println("index = " + list.indexOf(0));
		
		/*
		 * 인덱스 0을 삭제할때, 당연히 index[0]에 있는 객체는 삭제가 되지만
		 * 이후 i값이 증가되면서 제대로 삭제가 되지 않는 것임.
		 */
//		for(int i=0; i<list.size(); i++) {
//			list.remove(i);
//		}
		//삭제시키려면 항상 뒤에서부터 삭제해주셔야 함.
		
//		for(int i=list.size()-1; i>=0; i--) {
//			list.remove(i);
//		}
		
		list.clear();
		
		System.out.println("ArrayList에 있는 값 : " + list.toString());
	}

}
