package kr.or.shi.arraydatastructure;

public class ArraydatastructureTest02 {

	public static void main(String[] args) {
		Integer[][] dataList = { {1, 2, 3}, {4, 5, 6} };  //2차원 배열
		
		//데이터 2를 인덱스로 지정해서 출력해보시오		
		System.out.println(dataList[0][1]);
		
		//데이터 2를 인덱스로 지정해서 출력해보시오
		System.out.println(dataList[1][1]);
		
		
		Integer[][][] dataList2 ={ { {1, 2, 3}, {4, 5, 6} },{ {7, 8, 9}, {10, 11, 12} } };  //3차원 배열
		
		//데이터 5를 인덱스로 지정해서 출력해보시오
		System.out.println(dataList2[0][1][1]);
		
		//데이터 12를 인덱스로 지정해서 출력해보시오
		System.out.println(dataList2[1][1][2]);
		
		//8, 10, 2를 순서대로 각각의 라인에 출력하시오
		System.out.println(dataList2[1][0][1]);
		System.out.println(dataList2[1][1][0]);
		System.out.println(dataList2[0][0][1]);
	

	}

}
