package chap_05;

public class _01_Array {

	public static void main(String[] args) {
		//배열
		//String[] coffes = new String [4];
		
		//배열선언 다른방법
		//String coffees2 [] = new String [4];
		
		//배열 값넣기 
		
		//1번째
		//coffes[0] = "아메리카노";
		//coffes[1] = "카페";
		//coffes[2] = "카푸치노";
		
		//2번째
		//String[] coffes = new String [] {"아메리카노","카페모카","카페라떼"}; 
		
		//3번째
		String [] coffes = {"아메리카노","카페모카","카페라떼"}; 
		
		//배열의 값 변경
		coffes[1] = "에스프레소";
		
		//커피 주문
		System.out.println(coffes[0] + " 하나");
		System.out.println(coffes[1] + " 하나");
		System.out.println(coffes[2] + " 하나");
		System.out.println("주세요");
		
		
		
	}

}
