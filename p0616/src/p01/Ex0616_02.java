package p01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex0616_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int count = 0, stuNo = 0, kor = 0, eng = 0, math = 0, total = 0;
		double avg = 0.0f;
		String name = "";
		File file = new File("c:/temp02/");
		if (!file.exists()) {
			file.mkdirs();
		}
		File file1 = new File("c:/temp02/studnet.txt");

		if (!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		while (count <= 1) {
			String content = "";
			System.out.println("학번을 입력하세요. >>");
			stuNo = scan.nextInt();
			content += stuNo + " , ";
			System.out.println("이름을 입력하세요. >>");
			name = scan.next();
			content += name + " , ";
			System.out.println("국어점수를 입력하세요 >>");
			kor = scan.nextInt();
			content += kor + " , ";
			System.out.println("영어점수를 입력하세요 >>");
			eng = scan.nextInt();
			content += eng + " , ";
			System.out.println("수학점수를 입력하세요 >>");
			math = scan.nextInt();
			content += math + " , ";
			total = kor + eng + math;
			content += total + " , ";
			avg = total / 3.0;
			content += avg;

			try {
				FileWriter fw = new FileWriter(file1, true);
				fw.write(content + "\n");
				fw.flush();
				fw.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
		} // while

		try {
			Scanner scan2 = new Scanner(file1);
			String str = "";
			while (scan2.hasNextLine()) {
				str += scan2.nextLine() + " , ";
			}

			String[] strArr = str.split(" , ");
			for (int i = 0; i < strArr.length; i++) {
				System.out.println(strArr[i]+" ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}// main

}// class
