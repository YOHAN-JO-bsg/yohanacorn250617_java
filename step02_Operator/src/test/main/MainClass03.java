package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		/* 
		 * 이런 마음가짐으로 for문 을 보면 된다.
		 * 
		 * i 라는 변수를 만들고 초기값 0 대입
		 * i 가 10 보다 작은 동안에 반복한다.(작으면 for 문 블럭을 실행한다.)
		 * i 를 1 씩 증가 시키면서
		 * i 는 for 문 안에서 만들어진 지역변수 ( for 문이 종료되면 i 는 사라진다. ) 실험 해봐라.
		 *  
		 */
	for(int i=0; i<10; i++) {
		System.out.println(i);
		}
	
		System.out.println("-------------");
	
		// 콘솔창에 9 부터 0 까지 순서대로 출력되도록 for 문을 구성해보세요.
		// 9, 8, 7, 6, ....1, 0
		
		/*
		 * i 라는 변수를 만들고 초기값 9 대입
		 * i 가 0 보다 이상인 동안에 반복한다
		 * i 를 1씩 감소시키면서 
		 */
		for(int i=9; i>0; i--) {
			System.out.println(i);
		}
	}	
}
