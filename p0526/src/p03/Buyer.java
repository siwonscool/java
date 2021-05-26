package p03;

import java.util.Vector;

public class Buyer {
	int money=50000;
	Vector<Product> cart = new Vector<Product>();
	int sum;
	int bonusPoint;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		this.money -= p.price;
		this.bonusPoint = p.bonusPoint;
		sum += p.price;
		cart.add(p);
	}

	void info() {
		System.out.println("총 구매금액은 : " + this.sum);
		System.out.println("총 구매개수는 : " + cart.size());
		System.out.println("총 구매목록은 : ");
		for (int i = 0; i < cart.size(); i++) {
			System.out.println(cart.get(i).prouduct_name);
		}
	}

}
