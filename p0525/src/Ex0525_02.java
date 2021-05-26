import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex0525_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int stu_number = 0;
		String student_name = "";
		String stu_date = "";
		int count = 0;

		System.out.println("학생 이름을 입력하세요.>>");
		student_name = in.next();
		stu_number = ++count;

		// 날짜 생성
		Date today = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		stu_date = date.format(today);
		System.out.println("[ 학생정보 ]");
		System.out.println("이름 : " + student_name);
		System.out.println("학번 : " + stu_number);
		System.out.println("입력날짜 today : " + today);
		System.out.println("입력날짜 date : " + stu_date);
		
	}
}