package kr.or.shi.study;

public class MyListNode {
	
	private String data;        //자료
	public MyListNode next;     //다음 노드를 가리키는 링크
	
	public MyListNode() {
		data = null;
		next = null;
	}
	
	public MyListNode(String data) {
		this.data = data;
		next = null;
	}

	public String getData() {
		return data;
	}
}
