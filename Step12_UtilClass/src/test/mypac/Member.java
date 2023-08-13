package test.mypac;

public class Member {
	//필드
	public int num;
	public String name;
	public String addr;
	
	/*
	 * 기본 생성자도 필요하면 정의할 수 있다.
	 * 생성자는 다중 정의가 가능하다.
	 * 따라서 어떤 객체를 생성하는 방법이 여러 가지가 될 수도 있다.
	 */
	public Member() {}
	
	//필드에 저장할 값을 전달받는 생성자
	public Member(int num, String name, String addr) {
		this.num=num;
		this.name=name;
		this.addr=addr;
	}	
}






