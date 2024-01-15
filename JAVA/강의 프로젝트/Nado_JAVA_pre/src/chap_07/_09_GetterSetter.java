package chap_07;

public class _09_GetterSetter {

	public static void main(String[] args) {
		_01_Class_sub b1 =new _01_Class_sub();
		b1.modelName = "까망이";
		//b1.resolution = "FHD";
		b1.price = 200000;
		b1.color = "블랙";
		
		//할인 행사
		b1.price = -5000;
		System.out.println("가격 : "+ b1.price);
		
		// 고객문의
		System.out.println("해상도 : "+ b1.resolution);
		
		System.out.println("-----------------");
		
		_01_Class_sub b2 =new _01_Class_sub();
		b2.setModelName("하양이");
		b2.setPrice(-5000);
		b2.setColor("화이트");
		System.out.println("가격: "+ b2.getPrice());
		System.out.println("해상도: "+ b2.getResolution());
		
	}

}
