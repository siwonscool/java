package p01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MapPro {
	Scanner in = new Scanner(System.in);
	HashMap map = new HashMap();
	StringBuffer sbf = new StringBuffer("");
	int result; // 0: 데이터 없음, 1:데이터 있음
	String name, resultTitle,find;
	
	public HashMap selectStudent(ArrayList<Student> list) {
		System.out.println("이름을 입력하세요 : ");
		find = in.next();
		ArrayList<Student> new_list = new ArrayList<Student>();
		for(Student s : list) {
			if(s.getName().contains(find)) {
				sbf.append(s.getName() + " ");
				map.put("strName", sbf.toString());
				map.put("result", "이름이 검색되었습니다.");
				map.put("resultTitle", "sucess");
				map.put("name", s.getName());
				new_list.add(s);
				map.put("student", new_list);
			}
		}
		return map;
		
	}
}
