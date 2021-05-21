
public class Student2 {
	static int count;
	String stu_number = "S" + String.format("%03d", ++count);
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

	Student2() {
	}

	Student2(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = total / 3.0;
	}
}
