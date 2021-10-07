package kr.or.shi.abstract02;

public class SenderTest {

	public static void main(String[] args) {
		//추상클래스는 절대 인스턴스를 생성할수 없음.
		//ContentSender contentSender = new ContentSender();
		
	
		
		ContentSender contentSender = new SmsSender("Sms", "박성광", "네 귀하고 씩씩했던 삶!") {
		};
		contentSender.sendMessage("박지선");
		System.out.println();
		
		ContentSender contentSender2 = new KakaoSender2("카카오" , "김원효", "안녕 해피바이러스!") {
		};
		contentSender2.sendMessage("박지선");

	}

}
