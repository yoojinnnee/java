package test.main;

import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Memory;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 *  MacBook 객체를 생성해서 참조값을 mac1 이라는 지역 변수에 담기
		 */
		MacBook book=new MacBook(new Cpu(), new Memory(), new HardDisk());
		
		MacBook book2=new MacBook(null, null, null);
		
		book.doGame();
		book2.doGame();
		
		Cpu c=new Cpu();
		Memory m=new Memory();
		HardDisk h=new HardDisk();
		//생성자의 인자로 전달할 값이 지역변수에 있는경우 지역변수를 참조해서 전달할 수도 있다.
		MacBook book3=new MacBook(c, m, h);
		
		book3.doGame();
	}
}















