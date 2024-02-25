package kr.s04.array;

public class ArrayMain10 {
	public static void main(String[] args) {
		/*
		 * 1) 10,20,30,40,50 을 초기값으로 갖는 1차원 배열 test
		 * 이름으로 선언 , 생성 , 초기화 하시오.
		 * 2) 반복문을 이용해서 출력하시오.
		 * 3) 확장 for문을 이용해서 출력하시오
		 * 4) 인덱스 3에 데이터를 100으로 변경하시오
		 * 5) 마지막 요소의 값을 200으로 변경하시오
		 * 6) 반복문을 사용하여 모든요소의 값을 0으로 초기화 하시오 .
		 * 7) 홀수인덱스에 10 , 짝수 인데스에 20을 저장 
		 * 8) 모든 요소의 총합과 평균(총합을 요소의 수로 나눔)을 구하고 출력하시오.
		 */

		// 1)
		// 명시적 배열 생성 
		// int[] test = new int[] {10,20,30,40,50];
		// 암시적 배열 생성
		int test[] = {10,20,30,40,50};
		// 2)
		for(int i = 0; i < test.length; i++) {
			System.out.print(test[i] + "\t");
		}
		System.out.println();
		// 3)
		for(int num : test) {
			System.out.print(num + "\t");
		}
		System.out.println();
		// 4)
		test[3] = 100;
		// 5)
		test[test.length - 1] = 200;
		for(int i = 0; i < 5; i++) {
			System.out.print(test[i] + "\t");
		}
		System.out.println();
		// 6)
		for(int i = 0; i < 5; i++) {
			test[i] = 0;
			System.out.print(test[i] + "\t");
		}
		System.out.println();
		// 7)
		for(int i = 0; i < test.length; i++) {
			if(i%2==0) {
				test[i] = 20;}
			else {test[i] = 10;}
			System.out.print(test[i] + "\t");
		}
		System.out.println();
		// 8)
		int sum = 0;
		float avg = 0.0f;
		for(int i = 0 ; i < test.length ; i++) {
			sum += test[i];
		}
		avg = sum / (float)test.length;
		System.out.printf("총합 : %d%n평균 : %.2f", sum, avg);
	}
}
