
public class Ex0524_04 {

	public static void main(String[] args) {
		Deck deck = new Deck();

		for (int i = 0; i < Deck.Max_Number; i++) {
			deck.pick(i);
		}// 덱 초기화 확인
		System.out.println("===============================");
		deck.suffle();
		for (int i = 0; i < Deck.Max_Number; i++) {
			deck.pick(i);
		}// 덱 셔플 확인		
	}

}
