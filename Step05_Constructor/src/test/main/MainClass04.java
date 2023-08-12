package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  java.util 패키지에 있는 Random 클래스
		 */
		Random ran=new Random();
		// 0~9 사이의 랜덤한 정수를 얻어내서 ranNum 이라는 지역 변수에 담기
		int ranNum=ran.nextInt(10);
		// ranNum 지역 변수에 담긴 정수를 콘솔창에 출력하기
		System.out.println(ranNum);
	}
}













