package p01;

import java.util.Scanner;

public class Ex0528_01 {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		Number n = new Number();
		int number1=0;
		int number2=0;
		System.out.println("첫번째 수를 입력하세요");
		number1 = in.nextInt();
		
		System.out.println("두번째 수를 입력하세요");
		number2 = in.nextInt();

		System.out.println(n.compare(number1, number2));
		
	}//main

}//class