package kr.or.shi.modifier01;

/*
 * 접근 제어자(access modifier)의 가시성
 * --------------------------------------------------------------------
 *                    외부 클래스     하위 클래스     동일 클래스     내부 클래스
 *  public                o            o            o             o
 *  --------------------------------------------------------------------
 *  protected             x            o            o             o
 *  --------------------------------------------------------------------
 *  선언되지않음
 *  (default)             x            x            o             o
 *  --------------------------------------------------------------------
 *  private               x            x            x             x
 */

public class Phone {
	
	//접근제어자 protect : 같은패키지, 상속한 경우에 접근가능.(상속 받지않은 클래스도 같은패키지에서는 접근 가능.)
//	                    다른 패키지에서 접근불가
	public String model;
	private String color;
	private String company;

	public Phone() {
	}

	public Phone(String model, String color, String company) {
		super();
		this.model = model;
		this.color = color;
		this.company = company;
	}
	
	// getter()
	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public String getCompany() {
		return company;
	}

	@Override
	public String toString() {
		String str = "모델 : " + this.getModel() + ", 색상 : " + this.getColor() + ", 제조사 : " + this.getCompany();
		
		return str;
	}

}
