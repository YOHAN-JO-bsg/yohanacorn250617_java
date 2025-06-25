package test.mypac;

public class YHlab1 extends Shape {
	private int base;
	private int height;
	
	public YHlab1(int x, int y, int base, int height) {
		super(x, y);
		this.base = base;
		this.height = height;
	}
	
	public void PrintArea() {
		double area = (base * height) / 2.0;
		System.out.println("삼각형의 넓이:"+area);
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("밑변:"+base+"높이:"+height);
	}

}
