package test.mypac;

public class AndroidPhone extends HandPhone{
	//생성자
	public AndroidPhone() {
		System.out.println("AndroidPhone 생성자 호출됨");
	}
	//메소드
	public void doInternet() {
		System.out.println("do 인터넷");
	}
	//메소드
	public void showPlatform() {
		System.out.println("안드로이드");
	}
	// 아래의 @Override 는 해당 메소드가 재정의 되었다고 단순히 표시하는 용도이며 특별한 기능을 가지진 않는다.
	@Override
	public void takePicture() {
		System.out.println("찰칵!");
	}
}







