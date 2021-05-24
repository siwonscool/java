
public class Circle extends Shape {
	Point center;
	int r;

	Circle() {
		this(new Point(0, 0), 100);
	}

	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}

	public void area() {
		System.out.println("원의 넓이 : " + (this.r * this.r * 3.14));
	}
}
