package chap_07;

public class _08_Constructor {

	public static void main(String[] args) {
		_01_Class_sub b1 =new _01_Class_sub();
		b1.modelName = "까망이";
		b1.resolution = "FHD";
		b1.price = 200000;
		b1.color = "블랙";
		System.out.println(b1.modelName);
		System.out.println(b1.serialNumber);
		
		System.out.println("--------------------------");
		
		_01_Class_sub b2 = new _01_Class_sub("하양이","UHD",300000,"화이트");
		System.out.println(b2.modelName);
		System.out.println(b2.serialNumber);
	}

}
