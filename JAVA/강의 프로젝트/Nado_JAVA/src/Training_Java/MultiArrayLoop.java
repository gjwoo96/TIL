package Training_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MultiArrayLoop {
	static String seat [] = {"A","B","C","D","E","F","G"};
	static String AllSeat[][] = new String[7][10];
	
	public static void main(String[] args) throws Exception{
		MultiArrayLoop mal = new MultiArrayLoop();
		String pickseat = "";
		// 영화관을 만든다
		for (int i = 0; i < AllSeat.length; i++) {
			for (int j = 0; j < AllSeat[i].length; j++) {
				AllSeat[i][j] = seat[i]+(j + 1);
			}
		}
		
		while (true) {
		System.out.println("좌석 예약: 0");
		System.out.println("전체좌석 확인: 1");
		System.out.println("예약좌석 확인: 2");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String menuPick = br.readLine();
			if(menuPick.equals("0")) {
				pickseat = mal.seatPick();
			}else if(menuPick.equals("1")) {
				mal.seatView();
			}else if(menuPick.equals("2")) {
				System.out.println(pickseat+"좌석을 예약하셧습니다.");
			}
		}
		
		
	}
	
	
	public void seatView () {
		//좌석 보여주기
		System.out.println("---------- SCREEN -----------");
		for (int i = 0; i < AllSeat.length; i++) {
			for (int j = 0; j < AllSeat[i].length; j++) {
				System.out.print(AllSeat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public String seatPick() throws Exception{
		
		System.out.println("예약하려는 좌석을 입력해주세요.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String seat = br.readLine();
		
		for (int i = 0; i < AllSeat.length; i++) {
			for (int j = 0; j < AllSeat[i].length; j++) {
				if(AllSeat[i][j].equals(seat)) {
					AllSeat[i][j] = "___";
				}
			}
		}
		System.out.println(seat+"좌석이 예약 완료되었습니다.");
		
		return seat;
	}
	

}
