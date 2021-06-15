package shopMall;

import java.util.ArrayList;
import java.util.Scanner;

public class Buyer {
	
	Scanner in = new Scanner(System.in);
	int money;
	int bonusPoint;
	ArrayList<I> cart = new ArrayList<I>();

	public Buyer() {
	}

	public Buyer(int money) {
		this.money = money;
	}

	public void Buy(I i) {
		System.out.println("1.현금결제 2.보너스 포인트 결제");
		String choice=in.next();
		switch (choice) {
		case "1":
			
			if (this.money > i.getPrice()) {
				System.out.println(i.getName() + "를 구매하였습니다.");
				this.money -= i.getPrice();
				this.bonusPoint += i.getBonusPoint();
				System.out.println("현재 포인트 : "+this.bonusPoint);
				cart.add(i);
			} else {
				System.out.println("금액이 부족합니다.");
			}
			break;
		case "2":
			if(this.bonusPoint>i.getPrice()) {
				System.out.println(i.getName() + "를 구매하였습니다.");
				this.bonusPoint -= i.getBonusPoint();
				cart.add(i);
			}else {
				System.out.println("포인트가 부족합니다.");
			}
			break;

		default:
			break;
		}
		

	}

	public void getCart() {
		for (int i = 0; i < cart.size(); i++) {
			System.out.println(i+1+". "+cart.get(i).getName());
		}
	}
	
	public void charge() {
		System.out.println("충전하실 금액을 입력하세요");
		this.money+=in.nextInt();
	}

}
