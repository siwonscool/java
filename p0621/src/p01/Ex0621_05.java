package p01;

import java.util.*;

public class Ex0621_05 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		MapPro mp = new MapPro();
		list.add(new Student("홍길동",100,100,100));
		list.add(new Student("유관순",90,99,80));
		list.add(new Student("유영혁",70,80,97));
		
//		HashMap map = mp.selectStudent(list);
//		System.out.println("list 이름 "+map.get("strName"));
//		System.out.println("result 번호 "+map.get("result"));
//		System.out.println("result 결과 "+map.get("resultTitle"));
//		System.out.println("검색결과 이름 "+map.get("name"));
		
		String[] str = {"하이 ","나는 ","김시원"};
		HashMap<String,String[]> map2 = new HashMap<String, String[]>();
		
		map2.put("Name", str);
		
		System.out.println(map2.get("Name")[0]);
	}

}
