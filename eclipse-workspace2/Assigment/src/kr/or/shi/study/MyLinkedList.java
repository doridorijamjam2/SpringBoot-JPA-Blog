package kr.or.shi.study;

import kr.or.shi.singlelinkedlist.SingleLinkedList.Node;

public class MyLinkedList {
	
	private MyListNode head;
	int count;
	
	
	public MyLinkedList() {
		head = null;
		count = 0;
	}
	
	public MyListNode addElement(String data) {
		MyListNode newNode;
		if(head == null) {                    //맨처음일떄
			newNode = new MyListNode(data);
			head = newNode;
		}
		else {
			newNode = new MyListNode(data);
			MyListNode temp = head;
			while(temp.next != null) {  //맨뒤에 가서
				temp = temp.next;
			}
			temp.next = newNode;
		}
		count++;
		return newNode;
		
	}
	
	public void printAll() {
		if(count == 0) {
			System.out.print("출력할 데이터가 없습니다.");
			return;
			
			}
		
		MyListNode temp = head;
		while(temp != null) {
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp != null) {
				System.out.print("->");	
			}
			
		}
		System.out.println("");
	}
	

}
