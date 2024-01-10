package chap_06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _Quiz_06 {

	public static void main(String[] args) throws Exception {
		getHiddenData();
	}
	
	public static void getHiddenData() throws Exception{
		
		System.out.println("이름,주민번호,휴대폰번호 순으로 입력하세요");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String perInfo = br.readLine();
		String [] infoArray = perInfo.split(",");
		String name = "";
		String jumin = "";
		String phone = "";
		for (int i = 0; i < infoArray.length; i++) {
			if(i == 0) {
				name = infoArray[i];
			}else if(i == 1) {
				jumin = infoArray[i];
			}else if (i == 2) {
				phone = infoArray[i];
			}
		}
		
		System.out.println("암호화 시작");
		String crypto ="";
		int cryptoIndex = 0;
		//이름 암호화
		crypto = name.substring(1, name.length());
		name = name.substring(0,1);
		for (int i = 0; i < crypto.length(); i++) {
			name += "*";
		}
		//주민 암호화
		cryptoIndex = jumin.indexOf("-")+2;
		crypto = jumin.substring(cryptoIndex, jumin.length());
		jumin = jumin.substring(0, cryptoIndex);
		for (int i = 0; i < crypto.length(); i++) {
			jumin += "*";
		}
		//전화번호 암호화
		phone = phone.substring(0, phone.length()-4);
		for (int i = 0; i < 4; i++) {
			phone += "*";
		}
		System.out.println("증명서");
		System.out.println("이름:"+name);
		System.out.println("주민번호:"+jumin);
		System.out.println("전화번호:"+phone);
	}

}
