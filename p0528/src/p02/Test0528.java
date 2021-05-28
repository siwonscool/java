package p02;

import java.util.*;

public class Test0528 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// 학생성적프로그램
		ArrayList<Student> list = new ArrayList<Student>();
		Student s = new Student();
		String choice;

		loop1: while (true) {
			ArrayList<Integer> index = new ArrayList<Integer>(); //학생 검색시 출력 index 저장공간

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
				s.setStudent(list);
				s.doRank(list);
				break;

			case "2":
				s.displayScore(list);
				break;

			case "3":
				s.findStudent(list, index);
				s.changeStudentInfo(list, index);
				s.doRank(list);
				break;

			case "4":
				s.findStudent(list, index);
				s.selectStudentInfo(list, index);
				break;

			case "0":
				break loop1;

			default:
				break;
			}// switch

		} // while
	}// main

}// class
