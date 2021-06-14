package p02;

import java.util.*;

public class Student {
	static Scanner in = new Scanner(System.in);
	static int count = -1;
	int studentNum = ++count;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank = 1;

	public void setStudent(ArrayList<Student> list) {
		while (true) {
			System.out.println("학생의 이름을 입력하세요 [0].뒤로가기");
			String input = in.next();
			if (input.equals("0")) {
				break;
			}
			list.add(new Student());
			
			Student s = (Student) list.get(count - 1);
			s.name = input;
			System.out.println("국어 점수를 입력하세요");
			s.kor = in.nextInt();
			System.out.println("영어 점수를 입력하세요");
			s.eng = in.nextInt();
			System.out.println("수학 점수를 입력하세요");
			s.math = in.nextInt();
			s.total = s.kor + s.eng + s.math;
			s.avg = s.total / 3.0;
		}

	}// setStudent()

	public void getScore() {
		System.out.printf("%s\t %s\t %d\t %d\t %d\t %d\t %.2f\t %d\n", "S" + String.format("%03d", studentNum), name,
				kor, eng, math, total, avg, rank);
	}// getScore()

	public void displayScore(ArrayList<Student> list) {
		System.out.println("번호\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 등수\t");
		System.out.println("__________________________________________________________");
		for (int i = 0; i < list.size(); i++) {
			list.get(i).getScore();
		}
		System.out.println("___________________________________________________________");
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
		}// switch

	}// setScore()

	public void doRank(ArrayList<Student> list) {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).rank=1;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).total < list.get(j).total) {
					list.get(i).rank++;
				} // if
			} // for : j
		} // for : i

	}// doRank()

	public void findStudent(ArrayList<Student> list, ArrayList<Integer> index) {
		System.out.println("찾으려하는 학생의 이름을 입력하세요 : ");
		String input = in.next();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).name.contains(input)) {
				index.add(i);
			}
		}

	}// findStudent()

	public void selectStudentInfo(ArrayList<Student> list, ArrayList<Integer> index) {
		switch (index.size()) {
		case 0:
			System.out.println("일치하는 학생이 없습니다.");

			break;

		default:
			System.out.println("번호\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 등수\t");
			System.out.println("__________________________________________________________");
			for (int i = 0; i < index.size(); i++) {
				list.get(i).getScore();
			}
			System.out.println("___________________________________________________________");

			break;
		}
	}// selectStudentInfo()

	public void changeStudentInfo(ArrayList<Student> list, ArrayList<Integer> index) {

		switch (index.size()) {
		case 0:
			System.out.println("일치하는 학생이 없습니다.");

			break;

		case 1:
			System.out.println("번호\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 등수\t");
			System.out.println("__________________________________________________________");
			list.get(index.get(0)).getScore();
			System.out.println("___________________________________________________________");
			list.get(index.get(0)).setScore();

			break;

		default:
			System.out.println("번호\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 등수\t");
			System.out.println("__________________________________________________________");
			for (int i = 0; i < index.size(); i++) {
				list.get(index.get(i)).getScore();
			}
			System.out.println("___________________________________________________________");
			System.out.println("수정하고싶은 학생의 번호를 입력하세요");
			int choice = in.nextInt();

			for (int i = 0; i < index.size(); i++) {
				if (list.get(index.get(i)).studentNum == choice) {
					list.get(index.get(i)).setScore();
				}
			}

			break;

		}// switch

	}// changeStudentInfo()

}// class
