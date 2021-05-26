
public class Point3D extends Point {
	int z;

	Point3D() {
		super();
	}

	Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	String getLocation(int x, int y, int z) {
		return "X : " + this.x + " Y : " + this.y + " Z : " + this.z;
	}
}
