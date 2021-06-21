package p01;

import java.util.*;

public class Ex0621_03 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		Student s = new Student("이순신",100,100,100);
		
		set.add(s);
		set.add(new Student("홍길동",90,91,100));
		set.add(new Student("유관순",80,89,99));
		set.add(s);
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(((Student)itr.next()).getName());
		}
		
	}

}
