package kr.or.shi.object05;

public class IpadTest {

	public static void main(String[] args) {
		Ipad ipad = new Ipad();
		ipad.setCompany("애플");
		ipad.setModel("iPadPro");
		ipad.setColor("골드");
		ipad.setRelease(2021);
		System.out.println(ipad.toString());
		
		Ipad ipad2 = new Ipad();
		ipad.setCompany("삼성");
		ipad.setModel("갤럭시탭S7");
		ipad.setColor("실버");
		ipad.setRelease(2020);
		System.out.println(ipad.toString());

	}

}
