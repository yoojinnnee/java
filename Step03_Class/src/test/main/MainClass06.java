package test.main;

import test.mypac.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {
		// MyUtil 클래스의 send() 메소드 호출하기
		MyUtil.send();
		// MyUtil 클래스의 version 필드 참조하기
		String v=MyUtil.version;
		
		System.out.println("오잉?");
		// 1970 년 1월1일 자정으로부터 현재까지 경과 시간을 mili second 단위로 얻어내기
		long time=System.currentTimeMillis();
		System.out.println(time);
	}
}















