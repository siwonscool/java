
public class Point {

	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void getPoint() {
		System.out.printf("( %d , %d )\n", this.x, this.y);
	}
}
