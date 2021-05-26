package p02;

import java.util.Vector;

public class Buyer {
	int money = 10000;
	int sum;
	int bonusPoint;
	Vector<Product> cart = new Vector();

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
			money -= p.price;
			bonusPoint += p.bonusPoint;
			cart.add(p);
	}

	void getCart() {
		for (int i = 0; i < cart.size(); i++) {
			System.out.println(cart.get(i).product_name);
			System.out.println(this.bonusPoint);
			
			
		}
	}
}
