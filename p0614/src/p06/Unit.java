package p06;

public class Unit {
	int hitPoint;
	final int MAX_HP;
	int damage;

	Unit(int hp) {
		MAX_HP = hp;
	}

	public void Attack(Unit u) {
		if (u.hitPoint > 0) {
			u.hitPoint -= damage;
		} else {
			System.out.println("사망");
		}
	}
}
