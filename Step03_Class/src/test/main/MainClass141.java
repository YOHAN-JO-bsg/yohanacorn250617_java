package test.main;

import test.mypac.PostDto;

public class MainClass141 {
	public static void main(String[] args) {
		new PostDto();
		
		PostDto dto = new PostDto();
		
		PostDto dto2 = new PostDto(1, "안녕", "반가워");
		
		PostDto dto3 = new PostDto();
		
		dto3.setId(1);
		dto3.setContent("안녕하세요");
		dto3.setAuthor("홍길동");
		
		
		System.out.println(dto.getId());
		System.out.println(dto.getContent());
		System.out.println(dto.getAuthor());
	}
}
