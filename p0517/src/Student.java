import java.util.Scanner;

public class Student {
	Scanner in = new Scanner(System.in);
	
	public void rank(int[] rank1, int[][] score, int count) {
		// 등수 초기화
		for (int i = 0; i < count; i++) {
			rank1[i] = 1;
		}

		// 학생 추가할때 마다 등수 매기기
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				if (score[i][3] < score[j][3]) {
					rank1[i]++;
				}
			}
		}
	}

	public void change(String[] subject, int[][] score, int subNum, int check) {
		System.out.println("현재 " + subject[subNum - 1] + "의 성적은 ");
		System.out.println(score[check][subNum - 1] + " 입니다.");
		System.out.println("수정할 점수를 입력하세요 >> ");
		score[check][3] -= score[check][subNum - 1];
		score[check][subNum - 1] = in.nextInt();
		score[check][3] += score[check][subNum - 1];
	}

	public int same(int count, int check, String[] name, String input) {

		for (int i = 0; i < count; i++) {
			if (name[i].equals(input)) {
				check = i;
			}
		}
		return check;

	}

}
