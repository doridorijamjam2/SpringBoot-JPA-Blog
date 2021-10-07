package kr.or.shi.hashset02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

import kr.or.shi.hashset.Member;
import kr.or.shi.vector.Board;

public class MemberHashSet {
	private int memberId;
	public String memberName;
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	
	public MemberHashSet(int size) {
		hashSet = new HashSet<>(size);
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	
	public void showAllMember() {
		for(Member member : hashSet) {
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
		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()) {                //가져올 데이터 있는지 접근
			Member memeber = iterator.next();         //있으면 가져옴
			int tempId = memeber.getMemberId();
			
			if(tempId == memberId) {
				hashSet.remove(memeber);
				return true;
			}
			
		}
			System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	@Override
	public int hashCode() {
		
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.getMemberId()) {
				return true;
			}
			else {
				return false;
			}
		}
		return super.equals(obj);
	}
}
