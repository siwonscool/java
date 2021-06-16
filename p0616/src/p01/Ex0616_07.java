package p01;

import java.util.Scanner;

public class Ex0616_07 {

	public static void main(String[] args) {
		// 복권 1조12345
		// 마지막자리 1천원
		// 2자리 1만원
		// 3자리 10만원
		// 4자리 100만원
		// 5자리 1000만원
		// 1번째 랜덤으로 숫자를 생성해서 1조12345 복권번호를 생성해 보세요
		// 복권번호 : 9조 4558, 3조 1115, ...
		Scanner in = new Scanner(System.in);
		String[] user = new String[7];
		String[] ball = new String[7];
		int count = 0;

		for (int i = 0; i < ball.length; i++) {
			ball[i] = (int) (Math.random() * 10) + "";
			if (i == 1) {
				ball[i] = "조";
				user[i] = "조";
			}
		}

		for (int i = 0; i < user.length; i++) {
			System.out.println("숫자입력 : ");

			if (i == 1)
				continue;

			user[i] = in.nextLine();
			if (ball[i].equals(user[i])) {
				user[i] = "o";
				count++;
			} else {
				user[i] = "x";
			}
		}
		for (int i = 0; i < user.length; i++) {
			System.out.print(user[i]);
		}
		System.out.println();

		switch (count) {
		case 2:
			System.out.println("1000원 당첨");
			break;
		case 3:
			System.out.println("10000원 당첨");

			break;
		case 4:
			System.out.println("100000원 당첨");

			break;
		case 5:
			System.out.println("100000원 당첨");

			break;
		case 6:
			System.out.println("1000000원 당첨");

			break;

		default:
			System.out.println("꽝 ㅋㅋ");
			break;
		}

	}

}
