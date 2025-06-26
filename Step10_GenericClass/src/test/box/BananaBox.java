package test.box;

import test.fruit.Banana;

public class BananaBox {
	// 필드
	private Banana item;
	
	// 사과를 포장하는 메소드
	public void pack(Banana item) {
		this.item = item;
	}
	
	// 사과를 꺼내는 메소드
	public Banana unPack() {
		return item;
	}
	
}

