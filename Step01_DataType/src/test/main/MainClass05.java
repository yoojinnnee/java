package test.main;
/*
 *  [ Java 참조 데이터 type ]
 *  
 *  String type
 *  
 *  - 문자열을 다룰때 사용하는 데이터 type 이다.
 */
public class MainClass05 {
	public static void main(String[] args) {
		// "최유진" 라는 String type 객체를 heap 영역(사물함)에 만들고 그 참조값을 변수에 담기
		String name="최유진";
		// name 안에 있는 참조값을 tmp 변수에 복사하기
		String tmp=name;
		// "김시원" 라는 String type 객체를 heap 영역에 만들고 그 참조값을 name 변수에 덮어쓰기
		name="김시원";
		// name 변수를 비우기 ( null 은 참조 데이터 type 이 담길수 있는 빈 공간을 의미한다)
		name=null;
	}
}










