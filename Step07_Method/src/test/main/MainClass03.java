package test.main;

public class MainClass03 {
	public static void main(String[] args) {
	printSum(10, 20);
	MainClass03.printSum(30, 30);
	
	}
	
	public static void printSum(int num1, int num2) {
		int result = num1+num2;
		System.out.println(num1+" 과"+num2+" 의 합:"+result);
	}
}
