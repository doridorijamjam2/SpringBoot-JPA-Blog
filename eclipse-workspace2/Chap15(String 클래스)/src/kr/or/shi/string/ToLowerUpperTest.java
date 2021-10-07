package kr.or.shi.string;

public class ToLowerUpperTest {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println("대문자 : " + str1.toUpperCase());
		System.out.println("소문자 : " + str2.toLowerCase());
		
		System.out.println(str1.equals(str2)); 
	}

}
