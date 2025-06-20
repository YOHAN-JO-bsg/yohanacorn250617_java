package test.mypac;

public class PostDto {
	// 글 번호를 저장할 필드
	public int id;
	// 글 내용을 저장할 필드
	public String content;
	// 글 작성자를 저장할 필드
	public String author;
	
	
	// 객체의 필드에 있는 정보를 이쁘게 출력해 보세요.
	public PostDto() {
		System.out.println("PostDto 클래스의 생성자가 호출 됨!");
	}
	
	
	public void printData() {

		 String data = String.format("번호:%d 내용:%s 작성자:%s ", this.id, this.content, this.author);
		 System.out.println(data);
		
	}
	
	public PostDto(int id, String content, String author) {
		this.id = id;
		this.content = content;
		this.author= author;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
