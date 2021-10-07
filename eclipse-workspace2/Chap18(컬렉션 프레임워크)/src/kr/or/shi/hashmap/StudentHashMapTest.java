package kr.or.shi.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import kr.or.shi.stack.Coin;

public class StudentHashMapTest {

	public static void main(String[] args) {
		
		
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(1001, "최지만"), 95);
		map.put(new Student(1001, "최지만"), 90);
		map.put(new Student(1001, "류현진"), 100);
		map.put(new Student(1001, "추신수"), 100);
		
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println("최지만 : " + map.get(new Student(1001, "최지만")));

		Set<Student> set = map.keySet();
		Iterator<Student> Iterator = set.iterator();
		while(Iterator.hasNext()) {
			Student key = Iterator.next();
			System.out.println("학번 : " + key.getSno() + ", " + "이름 : " + key.getName() + ", " + "점수 : " + map.get(new Student(key.getSno(), key.getName())));
		}

	}

}
