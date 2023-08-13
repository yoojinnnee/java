package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.TVRemocon;

public class MainClass02 {
	public static void main(String[] args) {
		//다형성 확인
		MyRemocon r1=new MyRemocon();
		Remocon r2=r1;
		Object r3=r1;
		
		//클래스를 test.mypac 패키지에 파일로 만들어서 useRemocon() 메소드 호출하기
		TVRemocon r4=new TVRemocon();
		useRemocon(r4);
		//나만의 기능도 호출 해보기
		r4.reserve();
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
	
}
