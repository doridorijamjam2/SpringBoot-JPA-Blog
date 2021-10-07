package Algorithm;

public class A4673 {

	public static void main(String[] args) {
		  //변수 선언
				int i,n;
				
		        //논리형의 배열선언(셀프넘버인지 확인하는 용도)
				boolean[] self_number = new boolean[10001];
		 
				for (i = 1; i<10001; i++) {
					n = d(i); //n을 d메소드에 넣기
					
					if(n<10001) { //d메소드에서 반환한 temp값을 셀프넘버 배열에 넣기
						self_number[n] = true;
					}
				}
				
		        //StringBuilder에 내장된 메소드를 사용하기 위해 StringBuilder형식의 sb 객체 생성
				StringBuilder sb = new StringBuilder();
				for(i=1; i<10001; i++) {
					if(!self_number[i]) { //self_number배열의 값이 false일 때(==셀프 넘버일 때)
						sb.append(i).append('\n');   //sb에 셀프넘버(==배열의 인덱스)와 줄바꿈 값을 붙임
					}
				}
				System.out.println(sb);
			}
			
		    //d메소드
			public static int d(int n) {
				int temp = n;
				
				while(n != 0) {
					temp += (n%10); //temp값에 n의 일의 자리부터 마지막자리까지 값을 더해주는 코드
					n /= 10; //다음 자리로 넘어가는 코드
				}
				return temp;		
				
				//답지 보고 이해함.

	}

}
