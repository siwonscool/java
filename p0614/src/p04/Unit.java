package p04;

public abstract class Unit {
	int x,y;
	
	abstract void move(int x,int y);
	
	void stop() {
		System.out.println("그자리 멈춤");
	}
}
