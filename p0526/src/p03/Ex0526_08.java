package p03;

public class Ex0526_08 {

	public static void main(String[] args) {
		//조상 : Product
		//자손 : Refrigerator - 비스포크,300,30
		//Washer - 트럼,180,18
		//Conditioner -무풍,230,23
		//Styler -스타일러,130,13
		//초기보유금액 - 2000
		//구매물품- 비스포크2대 트럽3대 무풍 1대 스타일러 2대
		//총구매금액 출력, 총구매 개수 출력, 총구매목록 출력
		Buyer b = new Buyer();
		Product p = new Product();
		
		b.buy(new Refrigerator());
		b.buy(new Refrigerator());
		b.buy(new Washer());
		b.buy(new Washer());
		b.buy(new Washer());
		b.buy(new Conditioner());
		b.buy(new Styler());
		
		b.info();
	}

}
