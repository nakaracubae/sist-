package kr.s04.array;

public class ArrayMain07 {
	public static void main(String[] args) {
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		String[] course = {"국어","영어","수학"};
		int[] score = new int[course.length]; //0:국어, 1:영어,2:수학
		int sum = 0;
		float avg = 0.0f;
		
		//반복문을 이용해서 입력 처리
		for(int i = 0; i <score.length; i++) {
			//입력값을 0~100만 가능하게 조건 체크
			do {
				System.out.print(course[i] + "=");
				score[i] = input.nextInt();
			}while(score[i]<0 || score[i]>100);
			
			sum += score[i];
		}
		for(int i = 0; i < score.length; i++) {
			System.out.printf("%s = %d%n", course[i], score[i]);
		}
		avg = sum / (float)course.length;
		System.out.printf("총점 : %d%n평균 : %.2f%n",sum, avg);
		
		input.close();
	}
}
