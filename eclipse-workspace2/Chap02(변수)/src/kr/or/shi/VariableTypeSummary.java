package kr.or.shi;

/* 자바의 데이터 타입(자료형)
 * [1] : 기본형 타입(Primitive Data Type) --> 8개
 *       정수형 타입--> byte(1byte), short(2), int(4), long(8)
 *       실수형 타입--> float(4byte), double(8)
 *       문자형 타입--> char(2byte)
 *       논리형 타입(참, 거짓)--> boolean(1byte) --> true, false
 *       
 * [2] : 참조형 타입(Reference Data Type) --> 위 기본형에 속하지 않는 데이터형들
 *       클래스(Class), 배열(array), 인터페이스(interface), 문자열(String)
 *       특징 --> 데이터가 저장된 메모리 주소 값을 저장하는 변수이다.
 */

public class VariableTypeSummary {
	
	public static void main(String[] arg) {
//		byte, short, int, long, char
		System.out.println("byte \t: " + Byte.BYTES + "(바이트)" + "-->" + Byte.SIZE + "(비트)\t" + Byte.MIN_VALUE +"~"+ Byte.MAX_VALUE);
		System.out.println("short \t: " + Short.BYTES + "(바이트)" + "-->" + Short.SIZE + "(비트)\t" + Short.MIN_VALUE +"~"+ Short.MAX_VALUE);
		System.out.println("integer \t: " + Integer.BYTES + "(바이트)" + "-->" + Integer.SIZE + "(비트)\t" + Integer.MIN_VALUE +"~"+ Integer.MAX_VALUE);
		System.out.println("long \t: " + Long.BYTES + "(바이트)" + "-->" + Long.SIZE + "(비트)\t" + Long.MIN_VALUE +"~"+ Long.MAX_VALUE);
		System.out.println("char \t: " + (int)Character.BYTES + "(바이트)" + "-->" + (int)Character.SIZE + "(비트)\t" + (int)Character.MIN_VALUE +"~"+ (int)Character.MAX_VALUE);
	}
}

