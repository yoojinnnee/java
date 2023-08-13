package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass10 {
	public static void main(String[] args) {
		Set<String> names=new HashSet<>();
		names.add("복숭아");
		names.add("자두");
		names.add("딸기");
		names.add("체리");
		names.add("석류");
		
		//반복자(Iterator) 객체 얻어내기 (저장된 item 을 일렬로 세웠다고 생각)
		Iterator<String> it=names.iterator();
		while(it.hasNext()) {
			//cursor 를 다음칸으로 이동해서 커서가 위치한 곳의 item 을 읽어오기 
			String item=it.next();
			System.out.println(item);
		}
		
		System.out.println("-----");
		
		names.forEach((item)->{
			System.out.println(item);
		});
		
		//특정 item(데이터, 참조값) 존재 여부 알아내기
		boolean isContain=names.contains("자두");
		//저장된 item 의 개수
		int size=names.size();
		//특정 item 삭제 
		names.remove("딸기");
		//모든 아이템 삭제
		names.clear();
		
	}
}











