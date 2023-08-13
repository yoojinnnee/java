package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		
		useDrill(new Drill() {
			@Override
			public void hole() {
				System.out.println("바닥 드리리리리릴");
			}
		});
		
		
		useDrill(()->{
			System.out.println("천장 위이이잉");
		});
		
	}
	
	public static void useDrill(Drill d) {
		d.hole();
		d.hole();
	}
}












