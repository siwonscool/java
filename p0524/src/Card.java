
public class Card {
	final static String[] Card_Kind = { "SPADE", "DIAMOND", "CLOVER", "HEART" };
	final static String[] Card_Number = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String number;
	String Kind;

	Card() {
		this(0, 0);
	}

	Card(int kind, int number) {
		this.Kind = Card_Kind[kind];
		this.number = Card_Number[number];
	}
	
	public void getCard() {
		System.out.println(this.Kind + " " + this.number);
	}
}
