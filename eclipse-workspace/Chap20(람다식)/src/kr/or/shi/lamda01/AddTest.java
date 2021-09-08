package kr.or.shi.lamda01;

public class AddTest {

	public static void main(String[] args) {
		
//		Add addObj = (x,y) -> {return x + y;};     //add() 구현
		Add addObj = (x,y) -> x + y;
		
		System.out.println(addObj.add(2, 3));      //add() 호출
		 

	}

}
