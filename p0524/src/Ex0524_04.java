
public class Ex0524_04 {

	public static void main(String[] args) {
		Deck deck = new Deck();

		deck.displayDeck(); //덱 초기화 확인
		System.out.println("===============================");
		deck.suffle();
		deck.displayDeck(); // 덱 셔플 확인		
	}

}
