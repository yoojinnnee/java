package test.mypac;

public class Zoo {
	//클래스 안에 클래스(내부 클래스)
	public class Monkey{
		public void say() {
			System.out.println("원숭이");
		}
	}
	
	//내부 클래스 
	public class Tiger{
		public void say() {
			System.out.println("호랑이");
		}
	}	
	
	//메소드
	public Monkey getMonkey() {
		//내부 클래스로 객체를 생성해서 리턴하기
		return new Monkey();
	}
	public Tiger getTiger() {
		return new Tiger();
	}
}














