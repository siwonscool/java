package p02;

import java.util.ArrayList;
import java.util.Scanner;

public class Test0527 {

	public static void main(String[] args) {
		// 학생성적프로그램
		Scanner in = new Scanner(System.in);
		ArrayList<Student> s = new ArrayList<Student>();
		String choice;

		loop1: while (true) {
			ArrayList<Integer> index = new ArrayList<Integer>();

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
				s.add(new Student());
				s.get(Student.count - 1).setStudent();
				Student.doRank(s);
				break;

			case "2":
				System.out.println("번호\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 등수\t");
				System.out.println("__________________________________________________________");
				for (int i = 0; i < s.size(); i++) {
					s.get(i).getScore();
				}
				System.out.println("___________________________________________________________");
				break;

			case "3":
				Student.findStudent(s, index);
				Student.changeStudentInfo(s, index);
				Student.doRank(s);
				break;

			case "4":
				Student.findStudent(s, index);
				Student.selectStudentInfo(s, index);
				break;

			case "0":
				break loop1;

			default:
				break;
			}// switch

		} // while
	}// main

}// class
