import java.util.Scanner;

public class Ex0517_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] name = new String[5];
		int[][] score = new int[5][4];
		int[] rank = { 1, 1, 1, 1, 1 };
		String[] subject = { "국어", "영어", "수학" };
		int count = 0;

		Student st = new Student();

		loop1: while (true) {
			System.out.println("===========================");
			System.out.println("    학생관리 프로그램 입니다.    ");
			System.out.println("===========================");
			System.out.println("1. 학생성적추가");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("4. 학생성적검색");
			System.out.println("0. 프로그램종료");
			System.out.println("원하시는 기능을 입력하세요>>");
			String choice = in.next();

			switch (choice) {
			case "1":
				if (count > name.length - 1) {
					System.out.println("__________________________");
					System.out.println("학생을 더이상 입력할 수 없습니다.");
					System.out.println("__________________________");
					break;
				}
				System.out.println("===========================");
				System.out.println("학생성적 추가기능 입니다.");
				System.out.println("===========================");
				System.out.println("학생의 이름을 입력하세요 >> [0].뒤로가기");

				String str = in.next();
				name[count] = str;
				if (str.equals("0")) {
					break;
				}

				for (int i = 0; i < score[count].length - 1; i++) {
					System.out.println(subject[i] + " 성적을 입력하세요 >>");
					score[count][i] = in.nextInt();
					score[count][3] += score[count][i];
				}
				count++;

				st.rank(rank, score, count);

				break;
			case "2":
				System.out.println("===========================");
				System.out.println("학생성적 출력기능 입니다.");
				System.out.println("===========================");
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수\t");
				System.out.println("_____________________________________________________");
				for (int i = 0; i < count; i++) {
					System.out.print(name[i] + "\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}
					System.out.printf("%.2f\t", score[i][3] / 3.0);
					System.out.println(rank[i] + "\t");
				}
				System.out.println("_____________________________________________________");

				break;
			case "3":
				System.out.println("===========================");
				System.out.println("학생성적 수정기능 입니다.");
				System.out.println("===========================");
				System.out.println("학생의 이름을 입력하세요>> [0].뒤로가기");
				String input = in.next();

				if (input.equals("0")) {
					break;
				}

				int check = -1;

				check = st.same(count, check, name, input);
	

				if (check == -1) {
					System.out.println("일치하는 학생이 없습니다.");
				} else {
					System.out.println("변경할 과목을 입력하세요");
					System.out.println("1.국어 2.영어 3.수학");
					int subNum = in.nextInt();
					if (subNum < 1 || subNum > 3) {
						System.out.println("번호를 잘못 입력하셨습니다.");
						break;
					}
					switch (subNum) {
					case 1:
						st.change(subject, score, subNum, check);
						break;
						
					case 2:
						st.change(subject, score, subNum, check);				
						break;
						
					case 3:
						st.change(subject, score, subNum, check);
						break;
						
					default:
						break;
					}
				}
				st.rank(rank, score, count);

				break;
			case "4":
				System.out.println("===========================");
				System.out.println("학생성적 검색기능 입니다.");
				System.out.println("===========================");
				System.out.println("학생의 이름을 입력하세요>>");
				String input2 = in.next();

				if (input2.equals("0")) {
					break;
				}

				int check2 = -1;
				check2 = st.same(count, check2, name, input2);

				if (check2 == -1) {
					System.out.println("일치하는 학생이 없습니다.");
				} else {
					System.out.println(name[check2] + "의 성적");
					for (int i = 0; i < score[check2].length - 1; i++) {
						System.out.println(subject[i] + " : " + score[check2][i]);
					}
					System.out.println("합계 : " + score[check2][3]);
					System.out.println("등수 : " + rank[check2]);
				}

				break;

			case "0":
				System.out.println("===========================");
				System.out.println("프로그램을 종료합니다.");
				System.out.println("===========================");

				break loop1;

			default:
				break;

			}// switch
		} // while
		
		in.close();
	}// main

}// class
