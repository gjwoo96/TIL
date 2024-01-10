package chap_03;

import java.util.Scanner;

public class _Quiz_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jumin = sc.nextLine();
		String jumin1 = jumin.substring(0, jumin.indexOf("-"));
		String jumin2 = jumin.substring(jumin.indexOf("-"), jumin.indexOf("-")+2);
		System.out.println(jumin1+jumin2);
	}

}
