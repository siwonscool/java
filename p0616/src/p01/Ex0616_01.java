package p01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex0616_01 {

	public static void main(String[] args) {
		File dir1 = new File("c:/temp01/directory");
		if (!dir1.exists()) {
			dir1.mkdirs();
		}

		// 파일생성
		File file1 = new File("c:/temp01/file1.txt");
		if (!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// 글자저장
		try {
			FileWriter writer = new FileWriter(file1);
			String str = "다음수업은 jsp웹프로그래밍입니다.\n다음주부터 시작합니다.";
			writer.write(str + "\r\n");// \r은 마지막줄로 이동 \n은 줄바꿈
			writer.flush();
			writer.close();
			System.out.println("글자가 저장되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 글자읽기
		try {
			Scanner scan = new Scanner(file1);
			String str = "";
			while (scan.hasNextLine()) {
				str = str + scan.nextLine() + "\n";
			}
			
			File file2 = new File("c:/temp01/file2.txt");
			if(!file2.exists()) {
				file2.createNewFile();
			}
			
			FileWriter writer2 = new FileWriter(file2);
			writer2.write(str);
			writer2.flush();
			writer2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}//main

}//class
