import java.util.Scanner;

public class Ex0524_01 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// 3개의 점을 만듭니다. (0,0) (10,5) (5,40)
		Point3D p1 = new Point3D(0, 0, 0);
		Point3D p2 = new Point3D(10, 5, 3);
		Point3D p3 = new Point3D(5, 40, 20);

		System.out.println("" + p1.x + "," + p1.y + "," + p1.z);
		System.out.println("" + p2.x + "," + p2.y + "," + p2.z);
		System.out.println("" + p3.x + "," + p3.y + "," + p3.z);
	}// main
}// class