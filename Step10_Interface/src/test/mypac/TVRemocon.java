package test.mypac;

public class TVRemocon implements Remocon{

	@Override
	public void up() {
		System.out.println("TV 채널 UP");
	}

	@Override
	public void down() {
		System.out.println("TV 채널 DOWN");
	}
	
	//그런데... 나는 내가 사용할 메소드를 하나 더 만들고 싶다...
	public void reserve() {
		System.out.println("전원 OFF 예약");
	}
}
