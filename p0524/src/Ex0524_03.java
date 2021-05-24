import java.util.Scanner;

public class Ex0524_03 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Point[] p = new Point[3];
		Triangle t = new Triangle(p);

		t.setTrianglePoint();
		t.getTrianglePoint();

		System.out.printf("p1,p2사이의 거리 : %.2f\n", t.distance(p[0], p[1]));
		System.out.printf("p1,p3사이의 거리 : %.2f\n", t.distance(p[0], p[2]));
		System.out.printf("p2,p3사이의 거리 : %.2f\n", t.distance(p[2], p[1]));
		System.out.printf("삼각형의 넓이 : %.2f", t.area(p[0], p[1], p[2]));

	}

}
