package test.main;

import test.mypac.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		// 객체 생성해서 default 생성자에 실행의 흐름이 들어오는지 확인하기
		new MemberDto();
		
		MemberDto dto = new MemberDto();
		
		MemberDto dto2 = new MemberDto(1, "호날두", "사우디");
			
		MemberDto dto3 = new MemberDto();
		
		
		dto3.setNum(2);
		dto3.setName("메시");
		dto3.setAddr("미국");
		
	}
}
