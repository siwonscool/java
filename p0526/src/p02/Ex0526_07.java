package p02;

public class Ex0526_07 {

	public static void main(String[] args) {
		Product[] p = new Product[3];
		p[0] = new Audio();
		p[1] = new Tv();
		p[2] = new Computer();

		Buyer b = new Buyer();

		b.buy(p[0]);
		b.buy(p[0]);
		b.buy(p[1]);
		System.out.println(b.money);
		System.out.println(b.bonusPoint);
		
	}

}
