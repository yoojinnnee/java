package test.main;

import test.mypac.Member;

public class MainClass09 {
	public static void main(String[] args) {
		Member mem1=new Member();
		mem1.num=1;
		mem1.name="최유진";
		mem1.addr="서울";
		
		Member mem2=new Member();
		mem2.num=2;
		mem2.name="꼼이";
		mem2.addr="서울";
		
		mem1.showInfo();
		mem2.showInfo();
	}
}
