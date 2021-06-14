package p04;

public class Ex0614_04 {

	public static void main(String[] args) {
		Unit[] unit = new Unit[4];
		unit[0]=new Marine();
		unit[1]=new DropShip();
		unit[2]=new Tank();
		unit[3]=new Marine();

		for(Unit i : unit) {
			i.move(100, 200);
		}
	}

}
