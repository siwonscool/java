package p01;

import java.util.*;

public class Ex0621_02 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner in = new Scanner(System.in);
		StringBuffer sbf = new StringBuffer();
		Student st = new Student();
		String choice="";
		
		st.setStudent(list);

		while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 학생성적추가");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("4. 학생성적조회");
			System.out.println("5. 등수처리");
			System.out.println("0. 프로그램 종료");
			System.out.println("원하는 번호를 입력하세요 >>");
			choice = in.next();
			
			switch (choice) {
			case "1":
				st.setStudent(list);
				break;
			case "2":
				st.getStudent(list);
				break;
			case "3":
				
				break;
			case "4":
				
				break;
			case "5":
				
				break;
				
			case "0":
				
				break;
				

			default:
				break;
			}
		
		}
	}

}
