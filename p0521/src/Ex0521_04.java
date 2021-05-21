
public class Ex0521_04 {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.productName = "OLED TV";
		p1.price = 700;
		p1.bonusPoint = p1.price / 10;

		System.out
				.println(p1.serialNo + ". " + p1.productName + " 의 가격 " + p1.price + "원 이고 보너스 포인트는 " + p1.bonusPoint);
		Product p2 = new Product("냉장고", 500);
		System.out
				.println(p2.serialNo + ". " + p2.productName + " 의 가격 " + p2.price + "원 이고 보너스 포인트는 " + p2.bonusPoint);
		Product p3 = new Product("세탁기", 400);
		System.out
				.println(p3.serialNo + ". " + p3.productName + " 의 가격 " + p3.price + "원 이고 보너스 포인트는 " + p3.bonusPoint);

		System.out.printf("%d \n", 5);
		System.out.printf("%04d \n", 5);
		System.out.printf("%07.2f \n", 78.12345);
		System.out.printf("%,d \n", 12345);
		System.out.printf("%5s\n", "하이용 ㅋㅋㅋㅋㅋ");

	}

}
