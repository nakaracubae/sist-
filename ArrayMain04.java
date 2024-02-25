package kr.s04.array;

public class ArrayMain04 {
	public static void main(String[] args) {
		int sum = 0;
		float avg = 0.0f;
		
		//배열 선언 생성 초기화
		int score[] = {100,88,88,100,90};
		for(int i = 0 ; i < score.length ; i++) {
			sum += score[i];
		}
		avg = sum / (float)score.length;
		
		System.out.printf("국어 : %d%n영어 : %d%n수학 : %d%n과학 : %d%n사회 : %d%n총점 : %d%n평균 : %.2f%n",
				score[0], score[1], score[2], score[3], score[4], sum, avg);
	}
}
