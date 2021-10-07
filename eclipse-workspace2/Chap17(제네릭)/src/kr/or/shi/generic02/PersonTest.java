package kr.or.shi.generic02;

public class PersonTest {

	public static void main(String[] args) {
		Person<String> person = new Person<>();
		person.setT("류현진");
		String str = person.getT();
		System.out.println(str);
		
		Person<Integer> person2 = new Person<>();
		person2.setT(100);
		int value = person2.getT();
		System.out.println(value);
		
		Person<Apple> person3 = new Person<>();
		person3.setT(new Apple());
		Apple apple = person3.getT();
		System.out.println(apple);
	}
}





