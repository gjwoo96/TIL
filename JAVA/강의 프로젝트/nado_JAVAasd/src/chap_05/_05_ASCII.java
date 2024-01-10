package chap_05;

public class _05_ASCII {

	public static void main(String[] args) {
		// 아스키 코드 (ANSI) : 미국 표준 코드
		char c = 'A';
		System.out.println(c);
		//아스키 코드에서 A 는 65를 나타낸다.
		System.out.println((int)c);
		
		c = 'B';
		System.out.println(c);
		System.out.println((int)c);
		
		c++;
		System.out.println(c);
		System.out.println((int)c);
		
		
		//알파벳 대문자는 65부터 , 소문자는 97부터 시작, 숫자는(0)는 48부터 시작
		
		char ch = 'A';
		
		String[][] seats3 = new String[10][15];
		for (int i = 0; i < seats3.length; i++) {
			for (int j = 0; j < seats3[i].length; j++) {
				seats3[i][j] = String.valueOf(ch) + (j + 1);
			}
			ch++;
		}
		
		//영화관 좌석 확인
		for (int i = 0; i < seats3.length; i++) {
			for (int j = 0; j < seats3[i].length; j++) {
				System.out.print(seats3[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
