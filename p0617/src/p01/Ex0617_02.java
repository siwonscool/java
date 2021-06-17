package p01;

import java.util.Scanner;

public class Ex0617_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] input = new int[3];
		
		for(int i =0;i<input.length;i++) {
			System.out.println(i+1+"번째 수를 입력하세요");
			input[i]=in.nextInt();
		}
				
		int max=0;
		int mid=0;
		int min=0;
		
		max=Math.max(input[0], Math.max(input[1], input[2]));
		mid=Math.max(input[0], Math.min(input[1], input[2]));
		min=Math.min(input[0], Math.min(input[1], input[2]));
	
	}

}
