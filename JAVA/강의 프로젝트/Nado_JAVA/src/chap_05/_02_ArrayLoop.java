package chap_05;

public class _02_ArrayLoop {

	public static void main(String[] args) {
		String [] coffees = {"아메리카노","카페모카","카페라떼"}; 
		
		for (int i = 0; i < coffees.length; i++) {
			System.out.println(coffees[i]);
		}
		System.out.println("주세요");
		
		System.out.println("======================");
		
		//enhanced for (for-each)반복문
		for(String coffee : coffees) {
			System.out.println(coffee + "하나 주세요");
		}
		
		
		
	}

}
