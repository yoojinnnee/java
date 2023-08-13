package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Member;

public class MainClass05 {
	public static void main(String[] args) {
		//1. Member 객체를 담을수 있는 ArrayList 객체를 생성해서 참조값을 members 라는 지역 변수에 담기
		List<Member> members=new ArrayList<>();
		//2. 3명의 회원정보를 Member 객체에 각각 담기 (Member 객체가 3개 생성되어야 함)
		Member mem1=new Member(1, "최유진", "미국");
		Member mem2=new Member(2, "박효빈", "중국");
		//디폴트 생성자를 호출해서 Member 객체를 생성하면 
		Member mem3=new Member();
		//필드를 직접 참조해서 값을 넣어줘야 한다.
		mem3.num=3;
		mem3.name="김시원";
		mem3.addr="일본";
		//3. 위에서 생성된 Member 객체의 참조값을 members 객체에 모두 담기
		members.add(mem1);
		members.add(mem2);
		members.add(mem3);

		/*
		 *  4. members List 객체에 담긴 내용을 이용해서 회원 목록을 아래와 같은 형식으로
		 *  반복문 돌면서 출력하기
		 *  
		 *  번호: 1, 이름: 최유진, 주소: 미국
		 *  번호: 2, 이름: 박효빈, 주소: 중국
		 *  .
		 *  .
		 */
		for(int i=0; i<members.size(); i++) {
			Member tmp=members.get(i);
			System.out.println("번호: "+tmp.num+", 이름: "+tmp.name+", 주소:"+tmp.addr);
		}
	}
}








