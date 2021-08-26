package kr.or.shi.abstract02;

public abstract class SmsSender extends ContentSender{
	private String content;

	public SmsSender(String title, String name, String content) {
		super(title, name);
		this.content = content;
	}
	
	public String getContent() {
		return this.content;
	}

	@Override
	public void sendMessage(String recipient) {
		System.out.println("제목 : " + this.getTitle());
		System.out.println("이름 : " + this.getName());
		System.out.println("내용 : " + this.getContent());
		System.out.println("받는 사람 : " + recipient);
		
		
	}

}
