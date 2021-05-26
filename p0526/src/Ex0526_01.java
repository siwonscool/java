
public class Ex0526_01 {

	public static void main(String[] args) {
		Tv t = new Tv();
		CaptionTv c = new CaptionTv();

		// t = c; //다형성 -조상의 참조변수로 자식의 객체를 불러올수있다.
		// Tv t = new CaptionTv();
		t=c;
		

		// c=t; //자식의 참조변수로 조상의 객체를 다루는것은 안된다.

		Tv tt = null;
		CaptionTv cc = null;

		tt = cc; // 쌉가능
		cc = (CaptionTv) tt; // 쌉가능임
		
		
	}

}
