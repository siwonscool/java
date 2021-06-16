package p01;

public class Ex0616_08 {

	public static void main(String[] args) {

		String hobby = "";
		String[] hobby1 = { "game", "movie", "reading", "golf" };
		String[] hobby2 = { "movie" };
		String[] hobby3 = { "game", "reading" };
		// db 저장하는 방법
		// 1개의 데이터로 변경을 해야한다.
		// String hobby <- hobby1의 배열을 1개의 String으로 묶어서 저장.
		for (int i = 0; i < hobby1.length; i++) {
			hobby += hobby1[i];
			if (i != hobby1.length - 1) {
				hobby += ",";
			}
		}

		System.out.println(hobby);

//		String[] stuNum = new String[100];
//		
// 		for (int i = 0; i < 100; i++) {
//			stuNum[i]=String.format("S%04d", i+1);
//		}
// 		
// 		for(int i=0;i<100;i++) {
// 			System.out.println(stuNum[i]);
// 		}
	}// main
}// class
