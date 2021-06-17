package p01;

import java.util.*;

public class Ex0617_05 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("aaa", 1234);
		map.put("bbb", 2345);
		map.put("ccc", 3456);
		map.put("ddd", 4567);
		
		System.out.println(map.get("aaa"));
		System.out.println(map.get("bbb"));
		System.out.println(map.get("ccc"));
		System.out.println(map.get("ddd"));
		
		Set eSet = map.entrySet();
		Iterator itr = eSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		Iterator itr2 = map.keySet().iterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
	
}
