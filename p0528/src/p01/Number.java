package p01;

public class Number {

	int[] callInt(int number1, int number2) {
		int[] temp = { number1, number2 };
		return temp;
	}// 반환값을 배열로 하여 매개변수 모두를 받아오는 아이디어

	String compare(int number1, int number2) {
		if (number1 > number2) {
			return ("큰수 : " + number1 + " 작은수 : " + number2);
		}else if (number1==number2) {
			return ("같습니다.");
		}else {
			return ("큰수 : " + number2 + " 작은수 : " + number1);
		}
	}
}
