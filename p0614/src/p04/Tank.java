package p04;

public class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("탱크는 길이있어야 이동가능 좌표[" + x + " , " + y + "]");
	}

	void changeMode() {
	}
}
