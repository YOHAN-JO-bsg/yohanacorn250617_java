package test.main;

import test.mypac.MemberInfo;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		 *  1. MemberInfo 객체를 3개 생성해서 그 참조값을 m1, m2, m3 라는 변수에 각각 담아 보세요.
		 *  
		 *  3줄 코딩
		 *  
		 *  2. m1, m2, m3 에 들어있는 참조값을 이용해서 3명의 회원정보를 각각 객체에 담아 보세요.
		 *  
		 *  9줄 코딩
		 *  
		 *  3. 각각의 객체가 가지고 있는 printData() 메소드를 호출해 보세요.
		 *  
		 *  3줄 코딩 
		 *  
		 */
		MemberInfo m1 = new MemberInfo();
		MemberInfo m2 = new MemberInfo();
		MemberInfo m3 = new MemberInfo();
		
		m1.num = 1;
		m1.name = "원빈";
		m1.addr = "서울";
		
		m2.num = 2;
		m2.name = "장동건";
		m2.addr = "경기도";
		
		m3.num = 3;
		m3.name = "정우성";
		m3.addr = "충청도";
		
		m1.printData();
		m2.printData();
		m3.printData();
		
	}
}
