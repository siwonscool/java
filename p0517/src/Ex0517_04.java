import java.util.Scanner;

public class Ex0517_04 {

	public static void main(String[] args) {
		// 시(0-23),분(0-59),초(0-59.99)를 입력받아 출력하시요.
		// 3개를 입력받아 출력하자 ㅋㅋ

		Scanner in = new Scanner(System.in);
		int hour = 0;
		int min = 0;
		double sec = 0;

		loop1: while (true) {
			System.out.println("==================================");
			System.out.println("         시간 입출력 프로그램");
			System.out.println("==================================");
			System.out.println("1.시간입력");
			System.out.println("2.시간출력");
			System.out.println("3.시간수정");
			System.out.println("0.프로그램 종료");
			System.out.println("번호를 입력하세요 >>");
			String choice = in.next();
			switch (choice) {
			case "1":
				System.out.println("시간을 입력하세요 : ");
				hour = in.nextInt();
				hour = hour % 24;

				System.out.println("분을 입력하세요 : ");
				min = in.nextInt();
				if (min / 60 >= 1) {
					hour += min / 60;
					hour = hour % 24;
					min = min % 60;
				} else {
					break;
				}

				System.out.println("초를 입력하세요 : ");
				sec = in.nextDouble();

				if (sec / 60 >= 1) {
					min += sec / 60;
					if (min / 60 >= 1) {
						hour += min / 60;
						hour = hour % 24;
						min = min % 60;
					}
					sec = sec % 60;
				} else {
					break;
				}

				break;
			case "2":
				System.out.printf("%d : %d : %.2f\n", hour, min, sec);

				break;
			case "3":
				System.out.println("1.시 2.분 3.초");
				choice = in.next();
				switch (choice) {
				case "1":
					System.out.println("시간을 입력하세요 : ");
					hour = in.nextInt();
					hour = hour % 24;
					break;

				case "2":
					System.out.println("분을 입력하세요 : ");
					min = in.nextInt();
					if (min / 60 >= 1) {
						hour += min / 60;
						hour = hour % 24;
						min = min % 60;
					} else {
						break;
					}

					break;
				case "3":
					if (sec / 60 >= 1) {
						min += sec / 60;
						if (min / 60 >= 1) {
							hour += min / 60;
							hour = hour % 24;
							min = min % 60;
						}
						sec = sec % 60;
					} else {
						break;
					}

				default:
					break;
				}

				break;
			case "0":
				System.out.println("시스템을 종료합니다");

				break loop1;

			default:
				break;
			}// switch
		} // while

	}// main

}// class
