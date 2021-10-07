package kr.or.shi.string;

/*
 * trim() = 좌우 공백을 제거함
 */

public class TrimTest {

	public static void main(String[] args) {
		String tel1 = "         02";
		String tel2 = "-1234      ";
		String tel3 = "      -6789";
		
		System.out.println(tel1.trim());
		System.out.println(tel1.trim() + tel2.trim() + tel3.trim());

	}

}
