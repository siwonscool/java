
public class Ex0517_05 {

	public static void main(String[] args) {
		Tv t1 = new Tv(); // 객체 생성
		Tv t2 = new Tv(); // t1객체와 t2객체는 다르다

		System.out.println(t1.power);
		System.out.println(t1.channel);
		t2.channel=7;
		t1=t2;
		t2=t1;
		System.out.println(t1.channel);
		System.out.println(t2.channel);
//		t1.channelUp();
//		t1.power();
//		System.out.println("power() 후 power : " + t1.power);
//		System.out.println("channelUp() 후 channel : " + t1.channel);

	}

}