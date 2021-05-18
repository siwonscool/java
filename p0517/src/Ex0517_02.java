import java.util.Scanner;

public class Ex0517_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] boardTitle = { "새글이 등록되었습니다.", "홈페이지 오픈", "내일 수업하나요?", "한국직업전문학교 소개", "우리반은 몇명있나요?"
				, "언제까지 수업을 하나요", "한국직업전문학교 위치가 어떻게 되나요?", "사이트 만드는 방법", "한국직업전문학교 사이트가 있나요?"};
		//검색하여서 검색글이 포함된 것만 출력을 해보세요.
		//사이트, 한국직업전문학교, 수업
		System.out.println("검색할 단어를 입력하세요 ");
		String search=in.next();
		for(int i=0;i<boardTitle.length;i++) {
			if(boardTitle[i].contains(search)) {
				System.out.println(boardTitle[i]);
			}
		}
	}

}
