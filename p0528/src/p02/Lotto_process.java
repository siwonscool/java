package p02;

import java.util.Scanner;

public class Lotto_process {

	Scanner in = new Scanner(System.in);

	final static int ball_num = 45;
	final static int user_ball_num = 6;

	private int[] ball = new int[ball_num];
	private int[] user = new int[user_ball_num];

	Lotto_process() {
		for (int i = 0; i < ball_num; i++) {
			ball[i] = i + 1;
		}
	}

	public void suffle() {
		int temp = 0;
		for (int i = 0; i < 10000; i++) {
			int random = (int) Math.random() * ball_num;
			ball[temp] = ball[0];
			ball[0] = ball[random];
			ball[random] = ball[temp];
		}
	}

	public void userChoice() {
		for (int i = 0; i < user.length; i++) {
			System.out.println(i + 1 + "번째 번호를 입력하세요 (1부터 45까지) >> ");
			user[i]=in.nextInt();
		}
	}

}
