package kr.or.shi.generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		/*
		 * 다이아몬드 연산자 <>
		 */
		GenericPrinter<Powder> printer = new GenericPrinter<>();
		printer.setMaterial(powder);
		
		//재료를 꺼낼때 형변환이 불필요.
		Powder p = printer.getMaterial();
		System.out.println(printer.toString());
		
		GenericPrinter<Plastic> printer2 = new GenericPrinter<>();
		printer2.setMaterial(plastic);
		
		Plastic p2 = printer2.getMaterial();
		System.out.println(printer2);
		
	}
}

















