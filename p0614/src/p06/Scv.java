package p06;

public class Scv extends GroundUnit implements Repairable {

	Scv() {
		super(50);
		hitPoint = MAX_HP;
		damage = 5;
	}

	public void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit) r;
			if (u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}else {
				System.out.println("수리가 완료되었습니다.");
			}
		}
	}

}
