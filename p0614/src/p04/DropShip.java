package p04;

public class DropShip extends Unit {
	void move(int x, int y) {
		System.out.println("하늘을통해 바로날아가 좌표[" + x + " , " + y + "]");
	}

	void load() {
		System.out.println("사람8명 또는 탱크2대");
	}

	void unload() {
		System.out.println("내리기");
	}
}
