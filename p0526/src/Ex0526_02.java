
public class Ex0526_02 {

	public static void main(String[] args) {
		Car c1 = null;
		Car c11 = null;
		Car c2 = new Car();
		FireEngine f1 = null;
		FireEngine f2 = new FireEngine();
		Ambulance a1 = null;
		Ambulance a2 = new Ambulance();

		f2.color = "c";
		c1 = f1; // 주소값만 저장
		c11 = f2; // 부모 -> 자식 다형성
		f1 = (FireEngine)c11;
		f1.water();

		Car c12 = new FireEngine();
		((FireEngine) c12).water();
		// ((FireEngine) c2).water();

		f1 = (FireEngine) c1; // 자식 -> 부모 다형성
		// f1 = (FireEngine) c2; // 객체선언이 되어있는 부모참조변수 형변환 불가능
		// f1.water();
		System.out.println("f1 : " + f1);
		System.out.println("c1 : " + c1);
		System.out.println("c11 : " + c11);

	}

}
