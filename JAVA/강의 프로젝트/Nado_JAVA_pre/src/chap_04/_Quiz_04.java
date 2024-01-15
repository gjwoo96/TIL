package chap_04;

import java.util.Random;

public class _Quiz_04 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int hour = rd.nextInt(25);
		int car_idx = rd.nextInt(3);
		String car_cate [] = {"경차","장애인","일반"};
		int perPrice = 4000;
		double totalPrice = 0;
 		
		if(hour == 0 ) {
			hour++;
		}
		totalPrice = hour * perPrice;
		if(totalPrice > 30000) {
			totalPrice = 30000;
		}
	
		if(car_cate[car_idx].equals("경차") || car_cate[car_idx].equals("장애인")) {
			totalPrice = totalPrice * 0.5;
		}
		
		System.out.println("자동차 종류는 : "+car_cate[car_idx]+"이며,");
		System.out.println("총 주차시간 : "+hour+"이고,");
		System.out.println("총 금액은 : "+(int)totalPrice+"원 입니다.");
		
	}

}
