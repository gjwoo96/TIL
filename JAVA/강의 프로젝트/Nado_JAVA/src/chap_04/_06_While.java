package chap_04;

public class _06_While {

	public static void main(String[] args) {
		
		//반복문 While
		int distance = 25;
		int move = 0;
		while(move < distance) {
			System.out.println(move);
			move += 3;
		}
		System.out.println("도착");
		
		//무한 루프
		move = 0;
		while(move < distance) {
			System.out.println("루프 실행");
		}
	}

}
