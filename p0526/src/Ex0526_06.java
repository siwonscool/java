
public class Ex0526_06 {

	public static void main(String[] args) {
		//Product
		//p1에 c1로 참조변수 복사
		//c1에 p1로 참조변수 복사
		//p1에 c2로 참조변수 복사
		//p1에 s1로 참조변수 복사
		//s1에 p1로 참조변수 복사
		//p1에 s2로 참조변수 복사
		//p1의 참조변수가 누구것인지 출력
		
		
		Product p1 = null;
		
		Computer c1 = new Computer();
		Computer c2 = null;
		
		SmartPhone s1 = new SmartPhone();
		SmartPhone s2 =null;
		
		p1=c1;
		//c1=(Computer)p1;
		c2=(Computer)p1;
		
		
		if(p1 instanceof Computer) {
			System.out.println("Computer 참조변수 입니다.");
		}else if (p1 instanceof SmartPhone) {
			System.out.println("SmartPhone 참조변수 입니다.");
		}
		
		
		p1=s1;
		s1=(SmartPhone)p1;
		s2=(SmartPhone)p1;
		
		if(p1 instanceof Computer) {
			System.out.println("Computer 참조변수 입니다.");
		}else if (p1 instanceof SmartPhone) {
			System.out.println("SmartPhone 참조변수 입니다.");
		}
//		Car c1 = null;
//		FireEngine f1 = new FireEngine();
//		FireEngine f2 = null;
//		Ambulance a1 = new Ambulance();
//		Ambulance a2 = null;
//
//		c1 = f1;
//
//		if (c1 instanceof Ambulance) {
//			c1 = a2;
//			System.out.println("Ambulance 참조변수입니다.");
//		} else if (c1 instanceof FireEngine) {
//			System.out.println("FireEngine 참조변수입니다.");
//		}

	}

}
