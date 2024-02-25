package kr.s04.array;

public class ArrayMain02 {
	public static void main(String[] args) {
		//정수형 배열 선언 및 생성   정수형의 기본값은 0   |0|0|0|0|0|

		int[] array = new int[5];

		for(int i = 0; i < array.length; i++) {
			System.out.println("array [" + i + "]:" + array[i]);
		}

		System.out.println("------------------");

		//배열의 요소 변경
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		//실행 시 오류남
		//array[5] = 60;

		//반복문을 이용한 출력
		for(int i = 0; i < array.length; i++) {
			System.out.println("array [" + i + "]:" + array[i]);
			;
		}
		
		
		
		
		
		
	}
}