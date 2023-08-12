package test.main;

import test.mypac.AndroidPhone;
import test.mypac.HandPhone;

public class MainClass06 {
	public static void main(String[] args) {
		//인터넷 안되는 일반 핸드폰
		HandPhone p1=new HandPhone();

		AndroidPhone p2=(AndroidPhone)p1; // ClassCastException 발생!

		p2.doInternet(); //NullPointerException

	}
}











