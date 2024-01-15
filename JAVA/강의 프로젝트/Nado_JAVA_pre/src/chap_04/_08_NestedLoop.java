package chap_04;

public class _08_NestedLoop {

	public static void main(String[] args) {
		//이중 반복문
		
		//예제 별 (*) 사각형 만들기
		/*
		 
		 ****
		 ****
		 ****

		 */
		
		for(int i = 0; i< 5; i++) {
			for (int j=0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		
		for(int i = 0; i < 5; i++) {
		
			for(int j = 0; j < 5-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
