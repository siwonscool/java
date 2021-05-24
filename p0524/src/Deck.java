
public class Deck {
	final static int Max_Number = 52;
	Card[] card = new Card[Max_Number];
	Card temp = new Card();

	Deck() {
		for (int i = 0; i < Card.Card_Kind.length; i++) {
			for (int j = 0; j < Card.Card_Number.length; j++) {
				card[i * 13 + j] = new Card(i, j);
			}
		}
	}// card 초기화

	public void pick(int index) {
		card[index].getCard();
	}

	public void pick() {
		int random = (int)(Math.random()*Max_Number);
		this.pick(random);
	}

	public void suffle() {
		for (int i = 0; i < 1000; i++) {
			int random = (int)(Math.random()*Max_Number);
			temp = card[0];
			card[0] = card[random];
			card[random] = temp;
		}
	}
	
	public void displayDeck() {
		for (int i = 0; i < Deck.Max_Number; i++) {
			this.pick(i);
		}
	}
}
