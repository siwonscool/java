package p02;

import java.util.*;

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

	public void setStudent(ArrayList list) {
		while (true) {
			System.out.println("학생의 이름을 입력하세요 [0].뒤로가기");
			String input = in.next();
			if (input.equals("0")) {
				break;
			}
			list.add(new Student());
			System.out.println("count : "+count);
			Student s = (Student) list.get(count-2);
			s.name = input;
			System.out.println("국어 점수를 입력하세요");
			s.kor = in.nextInt();
			System.out.println("영어 점수를 입력하세요");
			s.eng = in.nextInt();
			System.out.println("수학 점수를 입력하세요");
			s.math = in.nextInt();
			s.total = kor + eng + math;
			s.avg = total / 3.0;
		}

	}// setStudent()

	public void getScore() {
		System.out.printf("%s\t %s\t %d\t %d\t %d\t %d\t %.2f\t %d\n", "S" + String.format("%03d", studentNum), name,
				kor, eng, math, total, avg, rank);
	}// getScore()

	public void displayScore(ArrayList list) {
		System.out.println("번호\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 등수\t");
		System.out.println("__________________________________________________________");
		for (int i = 0; i < list.size(); i++) {
			Student s = (Student)list.get(i);
			s.getScore();
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

	public void doRank(ArrayList list) {
		for (int i = 0; i < list.size(); i++) {
			Student s = (Student) list.get(i);
			s.rank = 1;
			for (int j = 0; j < list.size(); j++) {
				Student s2 = (Student) list.get(j);
				if (s.total < s2.total) {
					s.rank++;
				} // if
			} // for : j
		} // for : i

	}// doRank()

	public void findStudent(ArrayList list, ArrayList<Integer> index) {
		System.out.println("찾으려하는 학생의 이름을 입력하세요 : ");
		String input = in.next();

		for (int i = 0; i < list.size(); i++) {
			Student s = (Student)list.get(i);
			if (s.name.contains(input)) {
				index.add(i);
			}
		}

	}// findStudent

	public void selectStudentInfo(ArrayList list, ArrayList<Integer> index) {
		switch (index.size()) {
		case 0:
			System.out.println("일치하는 학생이 없습니다.");
			break;
		default:
			System.out.println("번호\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 등수\t");
			System.out.println("__________________________________________________________");
			for (int i = 0; i < index.size(); i++) {
				Student s = (Student)list.get(i);
				s.getScore();
			}
			System.out.println("___________________________________________________________");
			break;
		}
	}// selectStudentInfo

	public void changeStudentInfo(ArrayList list, ArrayList<Integer> index) {
		
		switch (index.size()) {
		case 0:
			System.out.println("일치하는 학생이 없습니다.");
			break;
		case 1:

			System.out.println("번호\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 등수\t");
			System.out.println("__________________________________________________________");
			Student s = (Student)list.get(index.get(0));
			s.getScore();
			System.out.println("___________________________________________________________");
			s.setScore();

			break;
		default:

			System.out.println("번호\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 등수\t");
			System.out.println("__________________________________________________________");
			for (int i = 0; i < index.size(); i++) {
				Student s2 = (Student)list.get(index.get(i));
				s2.getScore();
			}
			System.out.println("___________________________________________________________");

			System.out.println("수정하고싶은 학생의 번호를 입력하세요");
			int choice = in.nextInt();

			for (int i = 0; i < index.size(); i++) {
				Student s3 = (Student)list.get(index.get(i));
				if (s3.studentNum == choice) {
					s3.setScore();
				}
			}

			break;
		}// switch

	}// changeStudentInfo()

}// class
