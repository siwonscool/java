package p06;

public class Tank extends GroundUnit implements Repairable {

	Tank() {
		super(400);
		hitPoint = MAX_HP;
		damage = 40;
	}

}
