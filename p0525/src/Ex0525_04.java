
public class Ex0525_04 {

	public static void main(String[] args) {
		Singleton.getInstance().setName("홍길동");
		System.out.println(Singleton.getInstance().getName());
	}

}
