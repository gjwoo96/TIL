package chap_05;

public class _04_MultiArrayLoop {

	public static void main(String[] args) {
		//다차원 배열 순회
		String[][] seats = new String[][]{
			{"A1","A2","A3","A4","A5"},
			{"B1","B2","B3","B4","B5"},
			{"C1","C2","C3","C4","C5"}
		};
		
		//바깥쪽 for 는 세로
		//안쪽은 가로
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(seats[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
		
		String[][] seats2 = {
				{"A1","A2","A3"},
				{"B1","B2","B3","B4"},
				{"C1","C2","C3","C4","C5"}
		};
		//다차원배열의 세로 인덱스를 length로 길이를 알수있다.
		//가로는 seats2[index].length 길이를 알수있다.
		for (int i = 0; i < seats2.length; i++) {
			for (int j = 0; j < seats2[i].length; j++) {
				System.out.print(seats2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------");
		// 세로 크기 10 x 15 배열 생성
		String[][] seats3 = new String[10][15];
		String[] eng = {"A","B","C","D","E","F","G","H","I","J"};
		for (int i = 0; i < seats3.length; i++) {
			for (int j = 0; j < seats3[i].length; j++) {
				seats3[i][j] = eng[i] + (j + 1);
			}
		}
		
		seats3[7][8]="___";
		seats3[7][9]="___";
		
		//영화관 좌석 확인
		for (int i = 0; i < seats3.length; i++) {
			for (int j = 0; j < seats3[i].length; j++) {
				System.out.print(seats3[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
