package p06;

public class Ex0614_06 {

	public static void main(String[] args) {
		Scv scv = new Scv();
		Tank tank = new Tank();
		Marine marine = new Marine();
		Medic medic = new Medic();
		
		//scv.repair(marine); marine은 Repairable 인터페이스에 포함이 안되어있으므로 error발생
		System.out.println(tank.hitPoint);
		scv.Attack(tank);
		System.out.println(scv.hitPoint);
		scv.repair(tank);
		System.out.println(tank.hitPoint);
		
		tank.Attack(marine);
		System.out.println(marine.hitPoint);
		medic.cure(marine);
		System.out.println(marine.hitPoint);
		tank.Attack(marine);
		tank.Attack(marine);
		
	}

}
