package chap_04;

public class _11_Contunue {

	public static void main(String[] args) {
		//Contunue
		
		int max = 20;
		int sold = 0;
		int noShow = 17;
		for(int i = 1; i<=50; i++) {
			System.out.println(i+"번");
			
			if(i == noShow) {
				System.out.println("노쇼 패스");
				continue;
			}
			
			sold++;
			if(sold == max ) {
				System.out.println("종료");
				break;
			}
		}
		System.out.println("실행 종료");
	
		
	}

}
