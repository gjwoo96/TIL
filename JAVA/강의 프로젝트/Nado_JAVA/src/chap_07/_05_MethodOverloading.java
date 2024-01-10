package chap_07;

public class _05_MethodOverloading {

	public static void main(String[] args) {
		_01_Class_sub b1 = new _01_Class_sub();
		b1.modelName = "까망이";
		
		b1.record(false, false, 10);
		System.out.println("-----------------");
		b1.record(true, false, 3);
		System.out.println("-----------------");
		b1.record(true, true, 5);
		System.out.println("-----------------");
		b1.record();

	}

}
