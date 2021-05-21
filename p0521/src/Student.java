import java.util.Scanner;

public class Student {
	static Scanner in = new Scanner(System.in);
	String name;
	static int count;
	static int check;
	int stu_number = ++count;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank = 1;

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

	public void setStudent() {
		System.out.println("이름을 입력하세요");
		this.name = in.next();

		System.out.println("국어 점수를 입력하세요");
		this.kor = in.nextInt();

		System.out.println("영어 점수를 입력하세요");
		this.eng = in.nextInt();

		System.out.println("수학 점수를 입력하세요");
		this.math = in.nextInt();

		this.total = this.kor + this.eng + this.math;
		this.avg = this.total / 3.0;

	}

	public void getStudent() {
		System.out.print(this.stu_number + "\t");
		System.out.print(this.name + "\t");
		System.out.print(this.kor + "\t");
		System.out.print(this.eng + "\t");
		System.out.print(this.math + "\t");
		System.out.print(this.total + "\t");
		System.out.printf("%.2f\t", this.avg);
		System.out.println(this.rank);
	}

	public void doRank(Student[] s) {
		for (int j = 0; j < Student.count; j++) {
			if (this.total < s[j].total) {
				this.rank++;
			}
		}
	}

	public void changeScore() {
		System.out.println("1.국어 2.영어 3.수학");
		System.out.println("번호를 입력하세요.");
		int input = in.nextInt();

		if (input < 1 || input > 3) {
			System.out.println("번호를 잘못 입력하였습니다.");
		} else {
			switch (input) {
			case 1:
				System.out.println("현재 국어 점수는 : " + this.kor + "점 입니다.");
				this.kor = input;
				break;
				
			case 2:
				System.out.println("현재 영어 점수는 : " + this.eng + "점 입니다.");
				this.eng = input;
				break;
				
			case 3:
				System.out.println("현재 수학 점수는 : " + this.math + "점 입니다.");
				this.math = input;
				break;

			default:
				break;
			}
		}
	}

	public boolean findName(String find) {

		if (name.contains(find)) {
			check++;
			this.getStudent();
		}

		return (name.contains(find));
	}

}
