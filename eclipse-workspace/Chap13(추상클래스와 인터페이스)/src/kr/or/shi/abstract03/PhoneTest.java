package kr.or.shi.abstract03;

public class PhoneTest {

	public static void main(String[] args) {
		
		SmartPhone smartPhone = new SmartPhone(20210826, "Samsung", "류현진");
		smartPhone.showInfo();
		smartPhone.turnOn();
		smartPhone.turnOff();
	
		
		System.out.println("---------------------------------------");
		
		PoldablePhone poldablePhone = new PoldablePhone(20210901, "SAMSUNG", "김숙");
		poldablePhone.showInfo();
		poldablePhone.turnOn();
		poldablePhone.turnOff();
		poldablePhone.foldOn();
		poldablePhone.foldOff();
		
		System.out.println("---------------------------------------");
		
		//배열에서 다형성을 사용함.
		Phone[] phones = new Phone[10];
		phones[0] = new SmartPhone(20211001, "Apple", "추신수");
		phones[1] = new SmartPhone(20211003, "샤오미", "박지성");
		
		phones[0].turnOn();
		phones[0].turnOff();
		
		phones[1].showInfo();
		
		
	
		

	}

}
