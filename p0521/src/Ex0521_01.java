
public class Ex0521_01 {

	public static void main(String[] args) {

		Car c1 = new Car();

		Car c2 = new Car();
		c2.color = "pink";
		c2.gearType = "auto";
		c2.door = 5;

		Car c3 = new Car("silver", "auto", 4);

		Car[] car = new Car[10];
		car[1] = new Car("pink", "auto", 5);
		car[3] = new Car("silver", "auto", 5);
	}

}