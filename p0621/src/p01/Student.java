package p01;

import java.util.*;

public class Student {

	Student() {
	}

	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total / 3.0;
	}

	private static int count = 0;
	private int StuNo = ++count;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	StringBuffer sbf = new StringBuffer();
	Scanner in = new Scanner(System.in);

	public void setStudent(ArrayList<Student> list) {
		while (true) {
			System.out.println("이름을 입력하세요 [0].입력 종료 : ");
			String name = in.next();
			if (name == "0") {
				break;
			}
			System.out.println("국어점수를 입력하세요 : ");
			int kor = in.nextInt();
			System.out.println("수학점수를 입력하세요 : ");
			int eng = in.nextInt();
			System.out.println("영어점수를 입력하세요 : ");
			int math = in.nextInt();

			list.add(new Student(name, kor, eng, math));
			if (count == 2) {
				sbf.append(list.get(count - 2).getName());
			} else {
				sbf.append("," + list.get(count - 2).getName());
			}
		}
	}

	public void getStudent(ArrayList<Student> list) {
		System.out.println("__________________________________________________________________________");
		System.out.println("번호\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균\t");
		System.out.println("__________________________________________________________________________");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %f\t %d\t", list.get(i).StuNo, list.get(i).name,
					list.get(i).kor, list.get(i).eng, list.get(i).math, list.get(i).total, list.get(i).avg);
		}
		System.out.println("__________________________________________________________________________");
	}

	public int getStuNo() {
		return StuNo;
	}

	public void setStuNo(int stuNo) {
		StuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	@Override //<-설명문뿐 요즘엔 기능까지 내포하고 있다.
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
