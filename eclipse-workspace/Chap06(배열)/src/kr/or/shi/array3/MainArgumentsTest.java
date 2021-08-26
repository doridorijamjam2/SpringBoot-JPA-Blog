package kr.or.shi.array3;

public class MainArgumentsTest {

	public static void main(String[] args) {
	    //main()의 매개변수 활용
		if(args.length != 2) {
			System.out.println("프로그램 사용법");
			System.out.println("아이디입력 패스워드입력");
		}
		
		String str1 = args[0];
		String str2 = args[1];
		String str3 = args[2];
	
		
		
		System.out.println("아이디 :" + str1);
		System.out.println("패스워드 :" + str2);
		System.out.println("번호 :" + str3);
		
		int count = Integer.parseInt(str2);
		int total = count + 500;
		System.out.println("total 값 :" + total);
				
		

	}

}
