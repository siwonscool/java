package p03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex0615_03 {
	public static void main(String[] args) {
		String filePath = "c:/work1/file";
		File dir1 = new File(filePath);
		dir1.mkdirs();
		for (int i = 0; i < 3; i++) {
			File f1 = new File("c:/work1/file/f" + (i + 1) + ".txt");
			try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		File fileName = new File("c:/work1/file/f1.txt");
		// 디렉토리에 포함된 파일과 서브디렉토리를 확인해서 String배열로 리턴
//		File[] f_contents = fileName.listFiles();
//
//		for (int i = 0; i < f_contents.length; i++) {
//			System.out.println(f_contents[i].getName());
//		}
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
			writer.write("ㅎㅇㅎㅇㅎㅇㅎㅋㅋㅋㅋㅋㅎㅇㅎㅇㅋㅎㅋㅎㅋㅋㅋ\n나는시원");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
