package kr.or.shi.generic;

public class ThreeDPrinterTest {
	
	public static void main(String[] args) {
		Powder powder = new Powder();
		ThreeDPrinter01 printer = new ThreeDPrinter01();
		printer.setMaterial(powder);
		
		Powder p = printer.getMaterial();
		
		Plastic plastic = new Plastic();
		ThreeDPrinter02 printer02 = new ThreeDPrinter02();
		printer02.setMaterial(plastic);
		
		Plastic p2 = printer02.getMaterial();
		
		ThreeDPrinter03 printer03 = new ThreeDPrinter03();
		printer03.setMaterial(powder);
		
		//재료를 꺼내는 경우에 형변환 필요함 ==> 번거로움, 성능이슈 ==> 제네릭 P/G 나옴.
		Powder p3 = (Powder)printer03.getMaterial();
		
	}

}





