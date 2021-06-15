package p03;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex0615_04 {

	public static void main(String[] args) {
		File f = new File("c:/Windows");
		File[] f_list=f.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		for(int i=0;i<f_list.length;i++) {
			System.out.println("이름 : "+f_list[i].getName());
			System.out.println("수정한 날짜 : "+sdf.format(f_list[i].lastModified()));
			System.out.println("파일 크기 : "+f_list[i].length()+"KB");
			if(f_list[i].isDirectory()) {
				System.out.println("<폴더>");
			}else {
				System.out.println("<파일>");				
			}
			System.out.println();
		}
	}

}
