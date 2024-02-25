package kr.s04.array;

public class ArraySecondMain03 {
	public static void main(String[] args) {
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		//과목명
		String[] course = {"국어", "영어", "수학"};
		//인원수
		System.out.print("인원수 : ");
		int num = input.nextInt();
		
		int[][] score = new int[num][course.length];
		//총점저장
		int[] sum = new int[num];
		
		//평균을 저장하는 배열
		float [] avg = new float[num];
		
		//성적을 입력받고 총점과 평균을 구하기
		for(int i = 0; i < score.length; i++) {
			for(int j =0 ; j < score[i].length; j++) {
				//성적입력
				do {
					System.out.print(course[j] + " = ");
					score[i][j] = input.nextInt();
					sum[i] += score[i][j]; 
				}while(score[i][j] < 0 || score[i][j] > 100);
				
			}//end of inner for
			//평균 구하기
			avg[i] = (float)sum[i] / score[i].length;
			// 가독성을 위해 수정
			System.out.printf("총점 = %d%n평균 = %.2f%n",sum[i] , avg[i]);
			System.out.println();
		}//end of for
		System.out.println();
		input.close();
	}
}
