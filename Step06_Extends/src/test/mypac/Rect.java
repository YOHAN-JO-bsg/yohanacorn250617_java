package test.mypac;

public class Rect extends Shape {
	
	public int rect;

	
	public Rect(int x, int y, int rect) {
		super(x, y); 
		this.rect = rect;	
	}
	
	public void printArea() {
		// 원의 넓이
		int area = rect * rect ;
		System.out.println("사각형의 넓이는:" + area);
		
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("사각형의 좌표, 한변의 길이:" + rect);
	}
}
	
