package test.mypac;

public class Post {
    // 필드
    private int id;
    private String title;
    private String author;

    // 기본 생성자
    public Post() {
    }

    // 모든 필드를 초기화하는 생성자
    public Post(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // getter / setter 메서드들
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // (선택) 디버깅이나 출력 편하게 하기 위해 toString() 메서드 추가
    @Override
    public String toString() {
        return "Post [id=" + id + ", title=" + title + ", author=" + author + "]";
    }
}
