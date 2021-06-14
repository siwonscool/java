package p01;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	Scanner in = new Scanner(System.in);

	static int count = 0;
	int studentNum = ++count;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;

	Student() {
	}

	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = total / 3.0;
	}

	public void setStudent(ArrayList<Student> list) {
		while (true) {
			System.out.println("학생의 이름을 입력하세요 [0].뒤로가기");
			String choice = in.next();

			if (choice == "0") {
				break;
			} else {
				this.name = choice;
				System.out.println("국어점수를 입력하세요");
				this.kor = in.nextInt();
				System.out.println("영어점수를 입력하세요");
				this.eng = in.nextInt();
				System.out.println("수학점수를 입력하세요");
				this.math = in.nextInt();
				list.add(new Student(this.name, this.kor, this.eng, this.math));

			}
		}
	}// setStudent

	public void getStudent(ArrayList<Student> list) {
		System.out.println("__________________________________________________________________________");
		System.out.println("번호\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 등수\t");
		System.out.println("__________________________________________________________________________");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %f\t %d\t", list.get(i).studentNum, list.get(i).name,
					list.get(i).kor, list.get(i).eng, list.get(i).math, list.get(i).total, list.get(i).avg,
					list.get(i).rank);
		}
		System.out.println("__________________________________________________________________________");
	}

	public void findStudent(ArrayList<Student> list, ArrayList<Integer> index) {
		System.out.println("찾을 문자를 입력하세요");
		String find = in.next();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).name.contains(find)) {
				index.add(i);
			}
		}
	}

	public void changeScore() {
		System.out.println("1. 국어 2. 영어 3. 수학");
		String input = in.next();
		switch (input) {
		case "1":
			System.out.println("현재 국어 성적 : " + this.kor);
			System.out.println("수정할 점수를 입력하세요 : ");
			this.total -= this.kor;
			this.kor = in.nextInt();
			this.total += this.kor;
			this.avg = this.total / 3.0;
			break;
		case "2":
			System.out.println("현재 영어 성적 : " + this.eng);
			System.out.println("수정할 점수를 입력하세요 : ");
			this.total -= this.eng;
			this.eng = in.nextInt();
			this.total += this.eng;
			this.avg = this.total / 3.0;
			break;
		case "3":
			System.out.println("현재 수학 성적 : " + this.math);
			System.out.println("수정할 점수를 입력하세요 : ");
			this.total -= this.math;
			this.math = in.nextInt();
			this.total += this.math;
			this.avg = this.total / 3.0;
			break;
		default:
			break;
		}
	}

	public void changeStudentInfo(ArrayList<Student> list, ArrayList<Integer> index) {
		switch (index.size()) {
		case 0:
			System.out.println("일치하는 학생이 없습니다.");
			break;
		case 1:
			list.get(index.get(0)).changeScore();
			break;
		default:
			for (int i = 0; i < index.size(); i++) {
				System.out.println(list.get(index.get(i)).studentNum + ". " + list.get(index.get(i)).name);
			}
			System.out.println("수정하고싶은 학생의 번호를 입력하세요");
			int input = in.nextInt();
			
			for(int i=0;i<index.size();i++) {
				if(index.get(i)==input) {
					list.get(index.get(i)).changeScore();
				}
			}
			break;
		}
	}
	

}
