package kr.or.shi.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		System.out.println("사이즈 : " + set.size());
		
		set.add("Java");
		set.add("Java");
		set.add("Java");
		set.add("Java");
		set.add("Java");
		set.add("Java");
		set.add("Java");

		System.out.println("사이즈 : " + set.size());
		System.out.println("------------------------");
		
		set.add("JDBC");
		set.add("JSP");
		set.add("ORACLE");
		set.add("myBatis");
		set.add(null);
		set.add(null);
		
		System.out.println("사이즈 : " + set.size());
		System.out.println("------------------------");
		
		//반복자를 set을 통해서 얻는다.
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		System.out.println("------------------------");
		
		set.remove("JDBC");
		set.remove("myBatis");
		
		System.out.println("사이즈 : " + set.size());
		System.out.println("------------------------");
		
		for(String str : set) {
			System.out.println(str);
		}
		System.out.println("------------------------");
		
		set.clear();
		if(set.isEmpty())
			System.out.println("객체가 없습니다.");
		else
			System.out.println("객체가 존재합니다.");
	}
}
