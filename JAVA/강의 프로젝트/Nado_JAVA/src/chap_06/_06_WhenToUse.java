package chap_06;

public class _06_WhenToUse {
	// 메소드 필요이유
	// 유지보수에 용이하며 재사용성을 올린다.
	
	public static int getPower(int number, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= number;
		}
		return result;
	}
	

	public static void main(String[] args) {
		
		
		//2의 2승을 구하기
		int result = 1;
		for (int i = 0; i < 2; i++) {
			result *= 2;
		}
		System.out.println(getPower(3, 3));
	}
}
