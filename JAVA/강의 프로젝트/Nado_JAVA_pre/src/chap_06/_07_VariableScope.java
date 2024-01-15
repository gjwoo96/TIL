package chap_06;

public class _07_VariableScope {
	
	//변수의 영역
	//지역변수란?
	//변수가 선언된 영역 내에서만 사용가능 
	//ex) 아래의 result 변수는 methodB라는 메소드 내에서만 사용이 가능하다.
	
	public static void methodA() {
		//System.out.println(number);
	}
	public static void methodB() {
		int result = 1;
	}
	
	public static void main(String[] args) {
		int number = 3;
		//System.out.println(result);
		
		// 중괄호 안에 선언된 j는 중괄호 밖에서 사용불가능하다
		// 이런변수를 지역변수라고한다.
		{
			int j = 0;
			System.out.println(j);
		}
		
		
	}

}
