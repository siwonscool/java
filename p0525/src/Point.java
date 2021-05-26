
public class Point extends Object {
	int x;
	int y;

	Point() {
		super();
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "X : " + this.x + "Y : " + this.y;
	}
}
