package kr.or.shi.Initialize;

public class BlockTest {
	
	//인스턴스 초기화 블록 :
	{
		System.out.println("인스턴스 초기화 블럭 실행됨");
	}
	
	//정적 초기화 블럭 : 단 한번 수행이 이루어짐 (class area에 생성)
	static {
		System.out.println("정적 초기화 블럭 실행됨");
	}
	
	public BlockTest() {
		System.out.println("생성자 호출됨");
	}
	public static void main(String[] args) {
		BlockTest blockTest = new BlockTest();
		
	}

}
