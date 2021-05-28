package p02;

import java.util.Scanner;

public class Ex0528_02 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String choice;
		Lotto_process lotto = new Lotto_process();				
		
		loop1:while(true) {
			System.out.println("[ 로또 프로그램 ]");
			System.out.println("1. 로또번호 생성");
			System.out.println("2. 로또번호 섞기");
			System.out.println("3. 로또번호 개인번호 6개입력");
			System.out.println("4. 로또 당첨번호 출력");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------------------");
			System.out.println("원하는 번호를 입력하세요 >>");
			
			choice = in.next();
			
			switch (choice) {
			case "1":
				lotto = new Lotto_process();
				break;
			case "2":
				lotto.suffle();
				break;
			case "3":
				
				break;
			case "4":
				
				break;
			case "0":
				
				break;

			default:
				break loop1;
			}
		}
	}

}
