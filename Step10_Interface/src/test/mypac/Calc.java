package test.mypac;

// 계산기 인터페이스
@FunctionalInterface //추상 메소드를 1개만 만들도록 강제하는 역활 ( ()->{} 형태로 사용할 수 있도록 보장 )
public interface Calc {
	//메소드로 두개의 실수를 전달 받아서 어떤 연산을 하고 결과 값을 리턴해주는 메소드
	public double execute(double num1, double num2);
}
