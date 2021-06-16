package p01;

public class Ex0616_04 {

	public static void main(String[] args) {

		String str = "aaa";
		String str2 = "aaa";
		String str3 = new String("aaa");
		String str4 = new String("aaa");
		
		if(str==str2) {
			System.out.println("같은데이터");
		}else {
			System.out.println("다른데이터");
		}
		
		if(str3==str4) {
			System.out.println("같은데이터");
		}else {
			System.out.println("다른데이터");
		}

		Person p1 = new Person();
		p1.setId(8801011110555L);
		Person p2 = new Person();
		p2.setId(8801011110555L);

		if (p1 == p2) {
			System.out.println("같은데이터 입니다.");
		} else {
			System.out.println("다른데이터 입니다.");
		}

		if (p1.equals(p2)) {
			System.out.println("같은데이터 입니다.");
		} else {
			System.out.println("다른데이터 입니다.");
		}

	}

}
