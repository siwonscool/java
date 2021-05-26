import java.util.Scanner;

public class Ex0521_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Student[] st = new Student[10];
		String choice;

		while (true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 학생성적추가");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("4. 학생성적조회");
			System.out.println("0. 프로그램 종료");
			System.out.println("원하는 번호를 입력하세요 >>");
			choice = in.next();

			switch (choice) {
			case "1":
				if (Student.count > st.length) {
					System.out.println("더이상 학생을 입력할수 없습니다.");
				}
				System.out.println("==============================");
				System.out.println("      학생성적추가 기능 입니다");
				System.out.println("==============================");
				st[Student.count] = new Student();
				st[Student.count - 1].setStudent();
				
				break;

			case "2":
				System.out.println("==============================");
				System.out.println("      학생성적출력 기능 입니다");
				System.out.println("==============================");
				System.out.println("____________________________________________________");
				System.out.println("번호\t 이름\t 국어\t 영어\t 수학\t 합계\t 평균\t 등수\t");
				
				
				for (int i = 0; i < Student.count; i++) {
					st[i].rank=1;
					st[i].doRank(st);
					st[i].getStudent();
				}

				System.out.println("____________________________________________________");
				break;

			case "3":
				System.out.println("==============================");
				System.out.println("      학생성적수정 기능 입니다");
				System.out.println("==============================");
				System.out.println("검색할 단어를 입력하세요");
				String find = in.next();
				Student.check = 0;
				for (int i = 0; i < Student.count; i++) {
					st[i].rank=1;
					st[i].doRank(st);
					st[i].findName(find); 
				}
				
				break;
			case "4":

				break;
			case "0":
				System.out.println("==============================");
				System.out.println("      프로그램을 종료합니다.");
				System.out.println("==============================");
				break;

			default:
				break;
			}
		}
	}

}
