package kr.or.shi.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		System.out.println("사이즈 : " + map.size());
		
		map.put("최지만", 95);
		map.put("류현진", 90);
		map.put("김하성", 80);
		map.put("최지만", 95);
		map.put("추신수", 95);
		
		System.out.println("사이즈 : " + map.size());
		
		System.out.println("---------------------------------------");
		
		/*
		 * map은 중복된 키는 저장하지 않음.
		 * 중복저장될 경우 마지막에 저장된 값으로 대체가 됨.
		 */
		
		map.put("최지만", 95);
		map.put("류현진", 90);
		map.put("김하성", 80);
		map.put("최지만", 95);
		map.put("추신수", 95);
		
		System.out.println("사이즈 : " + map.size());
		System.out.println("값 : " + map.get("류현진"));
		System.out.println("값 : " + map.get("추신수"));
		
		
        //map 컬렉션에
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			int value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println("---------------------------------------");
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		System.out.println("entrySet()을 이용해서 출력");
		
		Iterator<Entry<String,Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		System.out.println("---------------------------------------");
		
		//전체 객체 삭제
		map.clear();
		System.out.println("총 MapEntry 수 : " + map.size());
		
	}

}
