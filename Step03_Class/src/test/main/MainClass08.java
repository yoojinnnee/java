package test.main;

import test.mypac.Member;

public class MainClass08 {
	public static void main(String[] args) {
		//설계한 Member 클래스로 객체를 생성해서 참조값을 mem1 이라는 지역변수에 담기
		Member mem1=new Member();
		//mem1 에 저장되어 있는 참조값을 이용해서 회원의 번호 1 을 객체에 저장하기
		mem1.num=1;
		//mem1 에 저장되어 있는 참조값을 이용해서 회원의 이름 "최유진" 을 객체에 저장하기
		mem1.name="최유진";
		//mem1 에 저장되어 있는 참조값을 이용해서 회원의 주소 "서울" 을 객체에 저장하기
		mem1.addr="서울";
		//mem1 에 저장되어 있는 참조값을 이용해서 showInfo() 메소드 호출하기
		mem1.showInfo();
	}
}
