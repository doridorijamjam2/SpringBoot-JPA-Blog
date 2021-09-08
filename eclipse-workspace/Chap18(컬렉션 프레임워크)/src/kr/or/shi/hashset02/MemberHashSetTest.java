package kr.or.shi.hashset02;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberRyu = new Member(1002, "류현진");
		Member memberChoi = new Member(1003, "최지만");
		Member memberKim = new Member(1004, "김하성");
		Member memberKim2 = new Member(1004, "김하성");
		
		
		
		memberHashSet.showAllMember();

		memberHashSet.removeMember(memberRyu.getMemberId());
		memberHashSet.showAllMember();
		
		
		
	}

}
