package test.mypac;

public class MyWeapon extends Weapon{
	
	//부모 클래스의 추상메소드를 반드시(강제로) 오버라이드 해야 한다.
	@Override
	public void attack() {
		System.out.println("냥냥펀치!");
	}

}
