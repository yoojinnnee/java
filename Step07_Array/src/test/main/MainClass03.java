package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		//1. String type 을 담을 수 있는 방 3개짜리 빈 배열 객체를 만들어서 참조값을 지역변수 names 에 담기
		//String[] names = {"최유진", "김시원", "박효빈"};
		//String[] names = {null, null, null}; 
		String[] names = new String[3]; 
		//2. 3개의 방에 순서대로 이름 담기
		names[0]="최유진";
		names[1]="김시원";
		names[2]="박효빈";
		//3. 배열에 들어 있는 친구의 이름을 하나씩 순서대로 콘솔창에 출력하기
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
