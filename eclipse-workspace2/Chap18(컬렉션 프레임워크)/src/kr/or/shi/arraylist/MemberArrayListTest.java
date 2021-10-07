package kr.or.shi.arraylist;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberRyu = new Member(1002, "류현진");
		Member memberChoi = new Member(1003, "최지만");
		Member memberKim = new Member(1004, "김하성");
		Member memberKim2 = new Member(1004, "김하성");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberRyu);
		memberArrayList.addMember(memberChoi);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberKim2);
		
		memberArrayList.showAllMember();

		memberArrayList.removeMember(memberRyu.getMemberId());
		memberArrayList.showAllMember();
		
		
		
	}

}
