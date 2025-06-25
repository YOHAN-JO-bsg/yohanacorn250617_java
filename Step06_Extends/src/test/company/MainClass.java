package test.company;

public class MainClass {
	public static void main(String[] args) {
		Manager m1 = new Manager("KING", 3000, new Department("기획부", "서울"));		
		m1.setPosition("이사");
		m1.printInfo();
	}

	
}
