package p03;

public class DvdPlayer extends Player {

	@Override
	void play(int point) {
		//1.영상코덱 읽어서, 영상이 나오도록 구현
		//2.음성코덱 읽어서, 음성이 나오도록 구현
		System.out.println("영상코덱 읽어오기->코덱해독->영상파일 모니터 출력");
		System.out.println("음성코덱 읽어오기->코덱해독->음성파일 TV스피커로 출력");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub

	}
}
