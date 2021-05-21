
public class Product extends Object {
	static int count = 0; // 클래스변수
	
	String serialNo = "S"+String.format("%04d", ++count); // 인스턴스변수
	
	String productName;
	int price;
	int bonusPoint;

	

	Product() {
	}

	Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
		this.bonusPoint = price / 100;
	}

	Product(String productName, int price, int bonusPoint) { // 생성자 오버로딩
		this.productName = productName;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
}