import java.util.Scanner;

public class Triangle extends Shape {
	Scanner in = new Scanner(System.in);
	Point[] p;

	Triangle() {
	}

	Triangle(Point[] p) {
		this.p = p;
	}

	Triangle(Point p1, Point p2, Point p3) {
		this.p = new Point[] { p1, p2, p3 };
	}

	public void setTrianglePoint() {
		for (int i = 0; i < p.length; i++) {
			p[i] = new Point();
			System.out.println((i + 1) + "번째 x 좌표를 입력하세요");
			p[i].x = in.nextInt();
			System.out.println((i + 1) + "번째 y 좌표를 입력하세요");
			p[i].y = in.nextInt();
		}
	}

	public void getTrianglePoint() {
		for (int i = 0; i < p.length; i++) {
			System.out.print("p" + (i + 1) + " : ");
			p[i].getPoint();
		}
	}

	public double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}

	public double area(Point p1, Point p2, Point p3) {
		double s = 0;

		for (int i = 0; i < 3; i++) {
			switch (i) {
			case 0:
				s += this.distance(p1, p2);
				break;
			case 1:
				s += this.distance(p1, p3);
				break;
			case 2:
				s += this.distance(p2, p3);
				break;
			default:
				break;
			}// 세변의 길이 더하기
		}
		s = s / 2;

		return Math.sqrt(s * (s - this.distance(p1, p2)) * (s - this.distance(p1, p3)) * (s - this.distance(p3, p2)));
	}
}
