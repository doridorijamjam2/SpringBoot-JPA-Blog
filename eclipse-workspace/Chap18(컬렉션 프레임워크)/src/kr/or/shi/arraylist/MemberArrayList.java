package kr.or.shi.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import kr.or.shi.vector.Board;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	public MemberArrayList(int size) {
		arrayList = new ArrayList<>(size);
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	public boolean removeMember(int memberId) {
//		for(int i=0; i<arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			int tempId = member.getMemberId();
//			
//			if(tempId == memberId) {
//				arrayList.remove(i);
//				return true;
//			}
		Iterator<Member> iterator = arrayList.iterator();
		while(iterator.hasNext()) {                //가져올 데이터 있는지 접근
			Member memeber = iterator.next();         //있으면 가져옴
			int tempId = memeber.getMemberId();
			
			if(tempId == memberId) {
				arrayList.remove(memeber);
				return true;
			}
			
		}
			System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
}
