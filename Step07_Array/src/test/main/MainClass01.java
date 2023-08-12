package test.main;
/*
 *  java 에서 배열도 객체이다 
 *  즉 배열은 참조 데이터 type 이다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		// int type 5 개를 저장하고 있는 배열 객체 생성해서 참조값을 nums 라는 지역 변수에 담기
		int[] nums = {10, 20, 30, 40, 50};
		// double type 5 개를 저장하고 있는 배열
		double[] nums2={10.1, 10.2, 10.3, 10.4, 10.5};
		// boolean type 5 개를 저장하고 있는 배열
		boolean[] truth={true, false, false, true, true};
		// String type (참조데이터 type) 5 개를 저장하고 있는 배열
		String[] names={"사과","딸기","복숭아","복숭아","자두"};
		
		//배열객체는 clone() 이라는 메소드와 length 라는 필드가 있다.
		
		//배열 객체의 복제본 얻어내기
		int[] result=nums.clone();
		int[] result2=nums;//참조값 복사
		//배열의 크기 얻어내기 
		int size=nums.length;
		//배열은 순서가 있는 데이터 이다. 특정 index 의 item 참조하는 방법
		int first=nums[0];
		int second=nums[1];
		int third=nums[2];
	}
}











