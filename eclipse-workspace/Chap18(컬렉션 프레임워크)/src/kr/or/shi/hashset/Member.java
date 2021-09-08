package kr.or.shi.hashset;
/*
 * 논리적 동등 객체의 조건
 * 1)해쉬코드가 같아야함.(hashCode() 재정의)
 * 2)두개 객체들의 멤버변수들의 값들이 같아야함 (equals() 재정의)
 * 
 */

import java.util.Objects;

public class Member {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return this.getMemberName() + " 회원님의 아이디는 " + this.getMemberId() + "입니다.";
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashCode() 호출");
		return Objects.hash(this.memberId, this.memberName);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return (member.memberName.equals(this.memberName));
		}
		return super.equals(obj);
	}

}
