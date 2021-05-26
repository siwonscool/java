package p03;

public class Product {
	String prouduct_name;
	int price;
	int bonusPoint;

	Product() {
		this("", 0);
	}

	Product(String name, int price) {
		this.prouduct_name = name;
		this.price = price;
		this.bonusPoint = price / 10;
	}
}
