package kr.or.shi.inheritance02;

public class Triangle extends Shape{
	
	Point[] point;
	
	public Triangle() {
		this(new Point(0,0), new Point(50, 50), new Point(100, 100));
	}
	
	public Triangle(Point point, Point point2, Point point3) {
		System.out.println("Triangle의 매개변수 3개 호출됨.");
		this.point = new Point[] {point, point2, point3};
		
	}
	@Override
	public void draw() {
		System.out.println("[point] : " + this.point[0].x + ", " + this.point[0].y);
		System.out.println("[point] : " + this.point[1].x + ", " + this.point[1].y);
		System.out.println("[point] : " + this.point[2].x + ", " + this.point[2].y);
	}
	

}
