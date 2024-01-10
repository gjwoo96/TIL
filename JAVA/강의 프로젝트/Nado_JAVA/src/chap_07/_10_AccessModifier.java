package chap_07;

public class _10_AccessModifier {

	public static void main(String[] args) {
		//접근 제어자
		//private : 해당 클래스 내에서만 접근 가능
		//public : 모든 클래스에서 접근 가능
		//default : (접근제어자를 명시하지 않았을경우) 같은 패키지 내에서만 접근가능
		//protected : (같은 패키지 내에서) 상속 또는 다른패키지에서 객체를 생성하여 접근은 가능. 그러나 다른패키지에서는 접근 불가능.
		
		BlackBoxRefurbish b1 =new BlackBoxRefurbish();
		b1.modelName = "까망이";
		//b1.resolution = "FHD";
		b1.setPrice(200000);
		b1.color = "블랙";
		
		//할인 행사
		b1.setPrice(-5000);
		System.out.println("가격 : "+ b1.getPrice());
		
		// 고객문의
		System.out.println("해상도 : "+ b1.resolution);
		
		System.out.println("-----------------");
		
		BlackBoxRefurbish b2 =new BlackBoxRefurbish();
		b2.setModelName("하양이");
		b2.setPrice(-5000);
		b2.setColor("화이트");
		
		System.out.println("가격: "+ b2.getPrice());
		System.out.println("해상도: "+ b2.getResolution());
	}

}
