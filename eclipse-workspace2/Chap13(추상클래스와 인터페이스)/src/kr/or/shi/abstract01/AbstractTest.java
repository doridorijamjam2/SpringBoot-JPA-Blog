package kr.or.shi.abstract01;

/*
 *  추상클래스
 *     - 클래스들의 공통적인 특징을 변수나 메소드로 정의만 해 놓은 것.
 *     - 왜 사용하느냐? : 강제하기 위함 ==> 추상클래스가 선언해 놓은 메서드를 상속받은 자식 클래스들이 재정의해서 구현
 */


abstract class Animal{
	//구체적인 내용은 작성하지 않고 공통적인 특징을 추상적으로 선언(추상메서드)
	abstract void sound();
}

class Dog extends Animal {
	
	@Override
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	
	@Override
	void sound() {
		System.out.println("야옹");
	}
}

class Cow extends Animal {
	
	@Override
	void sound() {
		System.out.println("음메");
	}
}


public class AbstractTest {

	public static void main(String[] args) {
		//추상클래스는 구체적인 내용이 없기때문에 객체 생성 불가함.
		//Animal dog = new Animal();      
		
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		Cow cow = new Cow();
		cow.sound();

	}

}
