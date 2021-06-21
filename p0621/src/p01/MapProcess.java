package p01;

import java.util.*;

public class MapProcess {
	HashMap map = new HashMap();
	StringBuffer sbf = new StringBuffer("");
	int result; // 0: 데이터 없음, 1:데이터 있음
	String name, resultTitle;

	public HashMap selectStudent(ArrayList<Student> list) {

		for (Student s : list) {
			sbf.append(s.getName() + " ");
			if (s.getName().equals("홍길동")) {
				result = 1;
				resultTitle = "데이터가 있습니다.";
				name = "홍길동";
			}
		}

		map.put("strName", sbf.toString());
		map.put("result", result);
		map.put("resultTitle", resultTitle);
		map.put("name", name);

		return map;
	}
}
