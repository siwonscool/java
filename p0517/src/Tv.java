
public class Tv {
	String color;
	boolean power; // on-off
	int channel; // 3-tvn 5-sbs 7-kbs 9-kbs1 11-mbc

	void power() {
		power = !power; // on - off
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}

}
