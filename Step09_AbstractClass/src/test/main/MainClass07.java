package test.main;

import test.mypac.Car;

public class MainClass07 {
	public static void main(String[] args) {

		useCar(new Car());

		useCar(new Car() {
			@Override
			public void drive() {
				System.out.println("드라이브 떠나자!");
			}
		});
	}
	
	//누군가 미리 만들어 놓은 메소드
	public static void useCar(Car c) {
		c.drive();
		c.drive();
	}
}



