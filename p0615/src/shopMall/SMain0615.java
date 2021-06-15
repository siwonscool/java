package shopMall;

import java.util.Scanner;

public class SMain0615 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String choice;
		Buyer b = new Buyer();
		
		loop1: while(true) {
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
				b.Buy(new Laptop());
				break;
			case "2":
				b.Buy(new SmartPhone());
				break;
			case "3":
				b.Buy(new Tv());
				break;
			case "4":
				b.getCart();
				break;
			case "5":
				b.charge();
				break;
			case "0":
				break loop1;
			default:
				break;
			}
			
			
		}
	}

}
