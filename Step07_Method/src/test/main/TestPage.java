package test.main;

import test.mypac.Messenger;
import test.mypac.Post;

public class TestPage {
	public static void main(String[] args) {
		// Messenger type 객체의  sendPost() 메소드를 호출해 보세요.
		// 실행했을 때 Exception 이 발생하지 않아야 합니다.
		
		Messenger m1 = new Messenger();
		m1.sendPost(new Post(1,"ddd","ddd" ));
		
		
	}
}
