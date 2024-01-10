package chap_06;

public class _01_Method {
	
	public static void sayHello() {
		System.out.println("안녕하세요 메소드입니다.");
	}
	
	public static void main(String[] args) {
		// 메소드
		// 값을 받고 어떠한 연산 및 처리를 하거나 리턴값을 반환하는것.
		
		//메소드 호출
		System.out.println("메소드 호출 전");
		sayHello();
		sayHello();
		sayHello();
		System.out.println("메소드 호출 후");
	}

}
