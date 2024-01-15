package chap_04;

public class _01_If {

	public static void main(String[] args) {
		// 조건문 If
		int hour = 15;//오전10시
		if (hour < 14) {
			System.out.println("아이스 아메리카노 +1");
		}
		System.out.println("커피 주문 완료");
		
		//오후 2시 이전, 모닝커피를 마시지 않은 경우?
		hour = 15;
		boolean moringCoffee = false;// 모닝 커피
		// and 조건문
		if (hour < 14 && !moringCoffee) {
			System.out.println("아이스 아메리카노 +1 ");
		}
		System.out.println("커피 주문 완료");
		
		// 오후 2시 이후이거나 모닝커피를 마신경우 ?
		hour = 15;
		moringCoffee = true;
		// or 조건문
		if(hour >= 14  || moringCoffee) {
			System.out.println("아이스아메리카노 디카페인 +1");
		}
		
		
	}

}
