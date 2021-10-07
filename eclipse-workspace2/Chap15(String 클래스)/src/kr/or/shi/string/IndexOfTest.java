package kr.or.shi.string;

public class IndexOfTest {

	public static void main(String[] args) {
		//String str = "오늘은 자바 공부하기가 좋네요.";
		String str = "오늘은 자바 하기가 좋네요.";
		int index = str.indexOf("공부");
		System.out.println("공부의 시작 번지 : " + index);
		
		//공부라는 문자열이 포함되어 있다면
		//"공부와 관련된 내용이군요."
		//공부라는 문자열이 포함되어 있지않다면
		//"공부와 관련된 없는 내용이군요.."
		
		if(str.indexOf("공부") != -1) {
			System.out.println("공부와 관련된 내용이군요.");
		}
	
		else {
			System.out.println("공부와 관련된 없는 내용이군요.");
			
		}

	}

}
