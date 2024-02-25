package kr.s04.array;

public class ArrayMin01 {
	public static void main(String[] args) {
		//배열 선언
		char[] ch;
		//배열 생성
		ch = new char[4];
		//배열 초기화       인덱스는 0부터 시작 
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';

		//배열의 요소 출력
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		System.out.println(ch);

		//반복문을 이용한 배열의 요소 출력
		//ch 배열의 길이
		for(int i =0; i < ch.length;i++) 
			System.out.println("ch{"+i+"]:" + ch[i]);
		//배열의 선언 및 생성
		int[] it = new int[6];

		//배열의 선언 및 생성 (명시적 배열 생성), 초기화
		char[] ch2 = new char[] {'J','a','v','a'};
		//배열의 선언 및 생성 (암시적 배열 생성), 초기화
		char[] ch3 = {'자','바'};
		
		
		
		
		
		
	}
}