package test.mypac;

import javax.print.attribute.standard.PrinterInfo;

public class Circlelab2 extends Shape {

	private int radius2;
	
	public Circlelab2(int x, int y, int radius2) {
		super(x, y); // super() 는 부모 클래스의 생성자를 의미한다.
		this.radius2 = radius2;
		
	// Circle 클래스 안에 printArea() 메소드를 구현하여 원의 넓이를 출력하세요.
    //→ 넓이는 Math.PI * radius * radius를 이용.
		
		}
		public void prittArea() {	
		double area = Math.PI * radius2 * radius2;
		System.out.println("원의 넓이는:"+ area);
		
		}
		
		//printInfo() 메소드를 오버라이드(재정의)하여
		// 부모의 printInfo()를 호출한 후, 반지름을 출력하세요.
		
		public void printInfo() {
			super.printInfo();
			System.out.println("반지름은 :"+radius2);		
	}
}
