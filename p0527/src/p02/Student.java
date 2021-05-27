package p02;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	static Scanner in = new Scanner(System.in);
	static int count;
	int studentNum = ++count;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank = 1;

	public void setStudent() {
		System.out.println("학생의 이름을 입력하세요");
		this.name = in.next();
		System.out.println("국어 점수를 입력하세요");
		this.kor = in.nextInt();
		System.out.println("영어 점수를 입력하세요");
		this.eng = in.nextInt();
		System.out.println("수학 점수를 입력하세요");
		this.math = in.nextInt();
		this.total = kor + eng + math;
		this.avg = total / 3.0;
	}

	public void getScore() {
		System.out.printf("%s\t %s\t %d\t %d\t %d\t %d\t %.2f\t %d\n", "S" + String.format("%03d", studentNum), name, kor, eng, math, total, avg,
				rank);
	}

	public void setScore() {
		System.out.println("1.국어 2.영어 3.수학");
		System.out.println("원하는 과목을 선택해 주세요");
		int choice = in.nextInt();

		switch (choice) {
		case 1:

			System.out.println("현재 국어성적 : " + this.kor);
			this.total -= this.kor;
			System.out.println("수정할 점수를 입력하세요 : ");
			this.kor = in.nextInt();
			this.total += this.kor;
			this.avg = total / 3.0;
			break;

		case 2:

			System.out.println("현재 영어성적 : " + this.eng);
			this.total -= this.eng;
			System.out.println("수정할 점수를 입력하세요 : ");
			this.eng = in.nextInt();
			this.total += this.eng;
			this.avg += this.total / 3.0;
			break;

		case 3:

			System.out.println("현재 수학성적 : " + this.math);
			this.total -= this.math;
			System.out.println("수정할 점수를 입력하세요 : ");
			this.math = in.nextInt();
			this.total += this.math;
			this.avg = this.total / 3.0;
			break;

		default:
			break;
		}

	}

	static void doRank(ArrayList<Student> s) {
		for (int i = 0; i < s.size(); i++) {
			s.get(i).rank = 1;
			for (int j = 0; j < s.size(); j++) {
				if (s.get(i).total < s.get(j).total) {
					s.get(i).rank++;
				}
			}
		}
	}

	static void findStudent(ArrayList<Student> s, ArrayList<Integer> index) {
		System.out.println("찾으려하는 학생의 이름을 입력하세요 : ");
		String input = in.next();

		for (int i = 0; i < s.size(); i++) {
			if (s.get(i).name.contains(input)) {
				index.add(i);
			}
		}
	}

	static void selectStudentInfo(ArrayList<Student> s, ArrayList<Integer> index) {
		switch (index.size()) {
		case 0:
			System.out.println("일치하는 학생이 없습니다.");
			break;
		default:
			System.out.println("번호\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 등수\t");
			System.out.println("__________________________________________________________");
			for (int i = 0; i < index.size(); i++) {
				s.get(index.get(i)).getScore();
			}
			System.out.println("___________________________________________________________");
			break;
		}
	}

	static void changeStudentInfo(ArrayList<Student> s, ArrayList<Integer> index) {

		switch (index.size()) {
		case 0:
			System.out.println("일치하는 학생이 없습니다.");
			break;
		case 1:

			System.out.println("번호\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 등수\t");
			System.out.println("__________________________________________________________");
			s.get(index.get(0)).getScore();
			System.out.println("___________________________________________________________");
			s.get(index.get(0)).setScore();

			break;
		default:

			System.out.println("번호\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 등수\t");
			System.out.println("__________________________________________________________");
			for (int i = 0; i < index.size(); i++) {
				s.get(index.get(i)).getScore();
			}
			System.out.println("___________________________________________________________");

			System.out.println("수정하고싶은 학생의 번호를 입력하세요");
			int choice = in.nextInt();

			for (int i = 0; i < index.size(); i++) {
				if (s.get(index.get(i)).studentNum == choice) {
					s.get(index.get(i)).setScore();
				}
			}

			break;
		}

	}

}// class
