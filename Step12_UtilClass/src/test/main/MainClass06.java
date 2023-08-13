package test.main;

import java.util.HashMap;

import test.mypac.Car;
/*
	java 에서 어떤 데이터를  key : value 의 쌍으로 관리 하고 싶으면 
	
	HashMap 객체를 사용한다.
	
	key 의 generic 도 마음대로 지정할 수 있지만 보통 String type 으로 한다.
	
	value 의 generic 은 그때 그때 다르지만 value 가 여러가지 type 이면 Object 로 지정한다.
*/
public class MainClass06 {
	public static void main(String[] args) {
		HashMap<String, Object> map1=new HashMap<>();
		map1.put("num", 1);  // Integer type 담기
		map1.put("name", "최유진"); // String type 담기
		map1.put("isWoman", true); // Boolean type 담기
		map1.put("car", new Car("소나타")); // Car type 담기 
		
		/*
		 *  value 의 Generic 클래스가 Object 로 지정 되어 있기 때문에
		 *  리턴되는 Object type 을 원래 type 으로 casting 해야 한다. 
		 */
		int num = (int)map1.get("num");
		String name = (String)map1.get("name");
		boolean isMan = (boolean)map1.get("isWoman");
		Car car = (Car)map1.get("car");
		
		//동일한 key 값으로 다시 담으면 수정
		map1.put("name", "자두");
		//특정 key 값으로 담긴 내용 삭제, 성공하면 true, 실패하면 false 리턴
		map1.remove("isWoman");
		//모두 삭제 
		map1.clear();
	}
}












