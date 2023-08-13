package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizMain2 {
	public static void main(String[] args) {
		//sample 데이터
		Map<String, String> dic=new HashMap<>();
		dic.put("apple", "사과");
		dic.put("banana", "바나나");
		dic.put("melon", "메론");
		dic.put("orange", "오렌지");
		
		/*
		 *  검색할 단어를 입력하세요:apple
		 *  apple 의 뜻은 사과입니다.
		 *  
		 *  검색할 단어를 입력하세요:banana
		 *  home 는 목록에 없습니다.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.print("검색할 단어를 입력하세요:");
		String word=scan.nextLine();

		//입력 받은 단어를 Map 의 key 값으로 활용해서 value 값을 읽어온다.
		//해당 key 값으로 저장된 value 가 없을수 있다
		String mean=dic.get(word); //없으면 null 이 리턴됨
		if(mean == null) {
			System.out.println(word+" 는 목록에 없습니다.");
		}else {
			System.out.println(word+" 의 뜻은 "+mean+"입니다.");
		}
	}
}











