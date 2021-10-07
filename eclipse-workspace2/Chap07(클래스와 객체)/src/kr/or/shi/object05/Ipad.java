package kr.or.shi.object05;

public class Ipad {
	
	private String company;
	private String model;
	private String color;
	private int release;
	
	
	public String getCompany() {
		return this.company;
	}
	public String getModel() {
		return this.model;
	}
	public String getColor() {
		return this.color;
	}
	public int getRelease() {
		return this.release;
		
		
	}
	public void setCompany(String company) {
		//예외 처리
		if(!company.equals("애플")) {
			System.out.println("애플제조사가 아닙니다!");
			return;
		}
		this.company = company;
	}
	public void setModel(String model) {
		//예외 처리
		if(!(model.equals("iPadPro") || model.equals("iPadAir") || model.equals("iPad") || model.equals("iPadmini"))) {
			System.out.println("애플제조사 모델이 아닙니다!");
			return;
		}
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setRelease(int release) {
		this.release = release;
	}
	
	@Override
	public String toString() {
		return  this.getCompany() + "회사의 " +
				this.getModel() + "모델이며 " +
				this.getColor() + "색깔이고 출시일은 " +
				this.getRelease() + "년입니다.";
	}
	

}
