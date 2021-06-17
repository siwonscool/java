package p01;

import java.util.ArrayList;

public class Ex0617_03 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1); // 1 -> int 1-> Integer : 오토박싱 (Wrapper 클래스)
		list.add(2); 
		list.add("aaa");
		list.add(12.5);
		list.add(new Student(1,"이순신"));
		list.add(new Student(2,"홍길동"));
		
		System.out.println(((Student)list.get(4)).name);
	}

}
