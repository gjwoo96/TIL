package chap_04;

import java.util.Iterator;

public class _05_For {

	public static void main(String[] args) {
		//반목문 For
		for (int i = 0; i < 10; i ++) {
			//System.out.println("어서오세요" + i);
		}
		
		//짝수만 출력 (for i만 적고 엔터)
		for(int i = 0; i < 10; i +=2) {
			System.out.println(i);
		}
		
		System.out.println("===============");
		
		//홀수만 출력 
		for(int i = 1; i < 10; i +=2) {
			System.out.println(i);
		}
		
		System.out.println("===============");
		//거꾸로 숫자
		for(int i = 5; i > 0; i--) {
			System.out.println(i);
		}
		
		System.out.println("===============");
		int sum = 0;
		// 1부터 10까지 수들의 합
		for(int i=1; i<= 10; i++ ) {
			sum += i;
		}
		System.out.println(sum);
		
	}

}
