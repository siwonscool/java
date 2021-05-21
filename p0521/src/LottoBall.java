
public class LottoBall {
	static int[] ball = new int[45];
	int temp;
	int random = 0;
	
	LottoBall(){
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}

		for (int i = 0; i < 10000; i++) {
			random = (int) (Math.random() * 100) % 45;
			temp = ball[0];
			ball[0] = ball[random];
			ball[random] = temp;
		}
	}

}
