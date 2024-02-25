package kr.s04.array;

public class ArraySecondMain02 {
	public static void main(String[] args) {
		int[][] score = {
				{99,98,97},
				{89,72,88},
				{99,97,92},
				{81,92,99},
				{99,90,79}}
		;

		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("--------------------");
		for(int i =0 ; i < score.length; i++) {
			int sum = 0;
			System.out.print(" " + (i+1) +" ");
			for(int j =0 ; j < score[i].length; j++) {
				sum += score[i][j];
			System.out.print(score[i][j] + " ");
			}
			System.out.println(sum + " "+ sum/score[i].length);
		}//end of for
	}
}
