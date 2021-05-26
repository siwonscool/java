import java.util.Scanner;

public class Ex0524_04 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Deck deck = new Deck();
		String choice;
		Card c = new Card();
		System.out.println(c);
		int num;

		loop1: while (true) {
			System.out.println("[카드 프로그램]");
			System.out.println("1.카드 뽑기");
			System.out.println("2.카드 5장 출력");
			System.out.println("3.카드 52장출력");
			System.out.println("4.카드 섞기");
			System.out.println("5.카드 정렬");
			System.out.println("6.컴퓨터 대결");
			System.out.println("0.프로그램 종료");
			System.out.println("번호를 입력하세요>>");
			choice = in.next();
			switch (choice) {
			case "1":
				System.out.println("카드번호를 입력하세요>>");
				num = in.nextInt();
				deck.pick(num - 1);
				break;
			case "2":
				for (int i = 0; i < 5; i++) {
					deck.pick();
				}
				break;
			case "3":
				deck.displayDeck();
				break;
			case "4":
				deck.suffle();
				System.out.println("카드를 섞었습니다.");
				break;
			case "5":
				deck = new Deck();
				System.out.println("카드를 정렬했습니다.");
				break;
			case "6":
				deck.battle(7);
				break;
			case "0":
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			default:
				break;
			}

		}
	}

}
