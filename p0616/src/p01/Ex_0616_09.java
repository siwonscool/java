package p01;

public class Ex_0616_09 {

	public static void main(String[] args) {
		String[] fileName = { "file.txt", "file2.hwp", "file3.psd", "file4.jsp", "file5.ppt", "file6.doc",
				"file7.java" };
		String[] fileName2 = { "ff.hwp", "ff2.java", "ff3.doc" };

		for (int i = 0; i < fileName.length; i++) {
			System.out.println(find(fileName[i]));
		}
		
		for (int i = 0; i < fileName2.length; i++) {
			System.out.println(find(fileName2[i]));
		}
		
	}

	public static String find(String file) {
		if (file.endsWith("txt")) {
			return "텍스트 파일";
		} else if (file.endsWith("hwp")) {
			return "한글 파일";
		} else if (file.endsWith("psd")) {
			return "psd 파일";
		} else if (file.endsWith("jsp")) {
			return "jsp 파일";
		} else if (file.endsWith("ppt")) {
			return "ppt 파일";
		} else if (file.endsWith("doc")) {
			return "doc 파일";
		} else if (file.endsWith("java")) {
			return "java 파일";
		} else {
			return "파일의 형태를 알 수 없습니다.";
		}
	}

}
