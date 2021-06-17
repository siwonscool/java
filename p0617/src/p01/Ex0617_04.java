package p01;

import java.util.HashSet;
import java.util.Iterator;

public class Ex0617_04 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		hs.add(new Student(2,"홍길동"));
		hs.add(new Tv(1,"OLEDTV"));
		hs.add(new Tv(2,"OLEDTV2"));
		
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			if(obj instanceof Student) {
				System.out.println(((Student)obj).name);
			}else if(obj instanceof Tv) {
				System.out.println(((Tv)obj).name);
			}else {
				System.out.println(obj);				
			}
		}
//		hs.remove(3);
//		Iterator itr2 = hs.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr2.next());
//		}
	}

}
