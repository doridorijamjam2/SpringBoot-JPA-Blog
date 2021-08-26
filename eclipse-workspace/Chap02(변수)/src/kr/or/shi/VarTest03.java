package kr.or.shi;

public class VarTest03 {

	public static void main(String[] args) {
		int num = 10;                   //10진수(Decimal)
		int bNum = 0B1010;              //2진수(Binary)
		int oNum = 012;                 //8진수(Octal)
		int xNum = 0xA;                 //16진수(Hexadecimal)
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
		
		byte b1 = 127;
		byte b2 = (byte)(b1 + 2);  //오버플로우 (129)
		System.out.println(b1);
		System.out.println("강제캐스팅 후 : " + b2);
		
		int i1 = (int)b1;    //자동캐스팅 (형변환 코드 생략가능)
		System.out.println("자동캐스팅 후 : " + i1);
		
		byte b3 = 127;
		int i2 = 350;
		b3 = (byte)i2;    //큰 바이트 -> 작은 바이트 (바이트 손실 일어남 => 원하지 않는 값 나옴)
		System.out.println(b3);
		
		/*
		 * 정수와 실수간의 캐스팅
		 * => 저장하는 방식이 틀리기 때문에, 반드시 데이터 손실이 있고, 아울러 명시적 캐스팅 코드 들어가야함
		 */
		
		int i3 = 100;
		float f1 = i3;
		System.out.println("정수 -> 실수 : " + f1);
		
		float f2 = 10.55f;
		int i4 = (int)f2;
		System.out.println("실수 -> 정수 : " + i4);
		
		//any타입 + " => 문자열 타입
		int i5 = 100;
		String str = "java" + i5;
		System.out.println(str);
	}

}
