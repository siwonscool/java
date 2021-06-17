package p01;

public class Ex0617_01 {

	public static void main(String[] args) {
		StringBuffer str3 = new StringBuffer("aaa");
		//str3 = str3+"ccc"; 는 안됨
		str3.append("ccc");
		System.out.println(str3);
		
		str3.insert(1, "b");
		System.out.println(str3);
		
		str3.delete(1, 2);
		System.out.println(str3);

		str3.insert(1, "b");
		System.out.println(str3);
		
		str3.deleteCharAt(1);
		System.out.println(str3);
	}

}
