package chap_07;

public class _01_Class {

	public static void main(String[] args) {
		// 객체 지향 프로그래밍(OOP : Object-Oriented Programming)
		// 유지보수 용이
		// 높은 재사용성
		
		//예시
		String modelNm = "까망";
		String resulution = "FHD";
		int price = 200000;
		String color = "블랙";
		
		String modelNm2 = "하양";
		String resulution2 = "UHD";
		int price2 = 300000;
		String color2 = "화이트";
		
		//sub 클래스로부터 bbox라는 객체를 생성
		//종이접기 책은 class , 그 책을 보고만든 종이학은 객체 Object이다.
		_01_Class_sub bbox = new _01_Class_sub();
		
		
	}

}
