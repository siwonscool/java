
public class Ex0524_02 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("(" + c1.center.x + "," + c1.center.y + ")" + "반지름 : " + c1.r);
		c1.area();
		Circle c2 = new Circle(new Point(50, 50), 150);
		System.out.println("(" + c2.center.x + "," + c2.center.y + ")" + "반지름 : " + c2.r);
		c2.area();

		Point p[] = { new Point(0, 0), new Point(100, 0), new Point(100, 100) };

		Triangle t = new Triangle(p);
		System.out.println("삼각형의 첫번쨰 좌표 : " + "(" + t.p[0].x + "," + t.p[0].y + ")");
		System.out.println("삼각형의 두번쨰 좌표 : " + "(" + t.p[1].x + "," + t.p[1].y + ")");
		System.out.println("삼각형의 세번쨰 좌표 : " + "(" + t.p[2].x + "," + t.p[2].y + ")");
		
	}

}
