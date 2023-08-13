package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 *  세명의 회원 정보(번호, 이름, 주소) 를 HashMap 객체에 각각 담아서
		 *
		 *  ArrayList 객체에 누적 시키기
		 *  
		 *  반복문 돌면서 ArrayList 객체에 누적된 회원 정보를 콘솔창에 순서대로 출력하기
		 *  
		 *  (HashMap 객체3개, ArrayList 객체1개 생성)
		 *  
		 *  ArrayList 객체 안에 HashMap 을 담을 예정이기 때문에
		 *  
		 *  List<HashMap<String, Object>>  type 이 필요
		 */
		
		List<Map<String, Object>> list=new ArrayList<>();
		
		Map<String, Object> map1=new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "최유진");
		map1.put("addr", "영국");
		
		Map<String, Object> map2=new HashMap<>();
		map2.put("num", 2);
		map2.put("name", "박효빈");
		map2.put("addr", "미국");
		
		Map<String, Object> map3=new HashMap<>();
		map3.put("num", 3);
		map3.put("name", "김시원");
		map3.put("addr", "캐나다");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);

		//확장 for 문 
		for(Map<String, Object> tmp:list) {
			//번호
			int num=(int)tmp.get("num");
			//이름
			String name=(String)tmp.get("name");
			//주소
			String addr=(String)tmp.get("addr");

			System.out.println("num:"+num+", name:"+name+", addr:"+addr);
		}
	}
}











