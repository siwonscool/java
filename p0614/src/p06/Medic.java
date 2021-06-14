package p06;

public class Medic extends GroundUnit implements Cureable {

	Medic() {
		super(30);
		hitPoint = MAX_HP;
	}

	public void cure(Cureable c) {
		if (c instanceof Unit) {
			Unit u = (Unit) c;
			if (u.hitPoint != MAX_HP) {
				u.hitPoint++;
			}else {
				System.out.println("치료가 완료되었습니다.");
			}
		}

	}
}
