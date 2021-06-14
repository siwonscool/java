package p05;

public class PlayingCardImpl implements PlayingCard {

	@Override
	public String getCardKind() {
		System.out.println("카드종류를 리턴합니다");
		return KIND;
	}

}
