package test.main;

import java.util.ArrayList;

import test.mypac.Car;

/*
 *  java 에서 배열은 크기를 조절할 수 없는 고정 배열
 *  따라서 동적으로 item 을 추가하고 삭제하고 하는 작업을 하려면 일반 배열은 사용할 수 없다.
 *  그래서 해당 작업을 하려면 ArrayList 객체를 사용한다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		// String type 을 저장할 수 있는 ArrayList 객체를 생성해서 참조값을 names 에 담기
		ArrayList<String> names=new ArrayList<>();

		// "최유진" , "박효빈", "김시원"  3개의 String type 을 저장하기
		names.add("최유진");
		names.add("박효빈");
		names.add("김시원");

		//0 번방의 아이템을 불러와서 item 이라는 변수에 담기
		String item=names.get(0);

		//1 번방의 아이템 삭제하기
		names.remove(1);

		//0 번방에  "복숭아" 을 넣고 싶으면?
		names.add(0, "복숭아");

		//저장된 아이템의 갯수(size) 를 size 라는 지역 변수에 담기
		int size=names.size();

		//저장된 모든 아이템 전체 삭제
		names.clear();
	}
}










