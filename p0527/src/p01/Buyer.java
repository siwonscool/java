package p01;

import java.util.ArrayList;

public class Buyer {
	private String member_id;
	private String member_pw;
	private String name;
	private int money = 2000;
	private int bonusPoint;
	ArrayList<Product> cart = new ArrayList<Product>();

	Buyer() {
	}

	Buyer(String member_id, String member_pw, String name) {
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.name = name;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	void buy(Product p) {
		if (money < p.getPrice()) {
			System.out.println("돈없다 입금해라");
			return;
		}

		bonusPoint += p.getPrice();
		money -= p.getPrice();
		cart.add(p);

		System.out.println(p.getPro_name() + "를 구매하였습니다.");
	}

	void charge(int money) {
		this.money += money;
		System.out.println("충전이 완료 되었습니다.");
		System.out.println("보유 금액 : " + this.money);
	}

	void buy_info() {
		if (cart.isEmpty()) {
			System.out.println("구매한 물품이 없습니다.");
			return;
		}
		System.out.println("=======================");
		System.out.println("        구매목록");
		System.out.println("=======================");

		for (int i = 0; i < cart.size(); i++) {
			System.out.println(i + 1 + ". " + cart.get(i).getPro_name());
		}

	}

	void buyer_info() {
		System.out.println("보유 금액 : " + this.money);
		System.out.println("보유 보너스 포인트 : " + this.bonusPoint);
	}
}// class
