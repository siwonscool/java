package p01;

import java.util.Scanner;

public class Ex0527_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Buyer b = new Buyer();
		String choice = "";

		loop1: while (true) {
			System.out.println("[ 쇼핑몰 프로그램 ]");
			System.out.println("---------------------");
			System.out.println("1. 맥북 구매");
			System.out.println("2. 아이폰 구매");
			System.out.println("3. OLED TV 구매");
			System.out.println("4. 구매목록");
			System.out.println("5. 현금 충전");
			System.out.println("0. 프로그램 종료");
			System.out.println("---------------------");
			System.out.println("번호를 입력하세요 >>");
			choice = in.next();

			switch (choice) {
			case "1":
				b.buy(new Computer());
				b.buyer_info();
				break;
			case "2":
				b.buy(new SmartPhone());
				b.buyer_info();
				break;
			case "3":
				b.buy(new Tv());
				b.buyer_info();
				break;
			case "4":
				b.buy_info();
				break;
			case "5":
				b.buyer_info();
				System.out.println("충전할 금액을 입력하세요 : ");
				b.charge(in.nextInt());
				break;
			case "0":
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			default:
				break;
			}

		}

	}
}
