package kr.or.shi.finalconstant;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person(30);
		
		//final 속성은 상수이므로 값을 변경 절대 못함.
//		person.NATION = "China";   //(불가함 확인.)
//		person.AGE = 60;           //(불가함 확인.)
		
		System.out.println(person);
		
		System.out.println(Person.MAX_NUMBER);
		
		Person person0 = new Person(50);
		Person person1 = new Person(150);
		Person person2 = new Person(200);
		
		System.out.println(person0);
		System.out.println(person1);
		System.out.println(person2);
		
		System.out.println(person0.AGE);
		System.out.println(person1.AGE);
		System.out.println(person2.AGE);
		
		double d = Math.PI;

	}

}
