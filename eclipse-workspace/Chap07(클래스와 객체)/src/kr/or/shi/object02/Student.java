package kr.or.shi.object02;

public class Student {

		//멤버변수(필드)
		String name;
		int age;

		
		//Object 클래스의 toString() 오버라이딩(재정의)
		/*
		 * this : 객체의 주소 (new라는 연산자가 인스턴스를 생성하면 비로소 활성화됨)
		 *        static메서드나 클래스앞에 사용할수 없음.
		 */
		@Override
		public String toString() {
		
			String str = "이름 : " + this.name +
					     ", 나이 : " + this.age;
		return str;
		}
		

	

}
