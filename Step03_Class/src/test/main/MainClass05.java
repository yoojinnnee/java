package test.main;

import test.mypac.Car;

public class MainClass05 {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.name="소나타";
		car1.price=1000;
		car1.drive();

		car1.showInfo();
	}
}
