package p04;

public class Marine extends Unit{
	void move(int x,int y) {
		System.out.println("마린은 길이있어야 이동가능 좌표[" + x + " , " + y + "]");
	}
	
	void stimPack() {
		System.out.println("스팀팩 주사를 치료");
	}
}
