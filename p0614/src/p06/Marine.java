package p06;

public class Marine extends GroundUnit implements Cureable {

	Marine() {
		super(60);
		hitPoint = MAX_HP;
		damage = 5;
	}

}
