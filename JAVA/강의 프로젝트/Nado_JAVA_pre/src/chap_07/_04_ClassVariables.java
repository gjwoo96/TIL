package chap_07;

public class _04_ClassVariables {

	public static void main(String[] args) {
		_01_Class_sub b1 = new _01_Class_sub();
		b1.modelName = "balck";
		System.out.println(b1.modelName);
		
		_01_Class_sub b2 = new _01_Class_sub();
		b2.modelName = "white";
		System.out.println(b2.modelName);
		
		// 특정 범위를 초과하는 충돌 감지시 자동 신고 기능 개발여부
		System.out.println("- 개발전 -");
		System.out.println(b1.modelName + "자동 신고기능 : "+ b1.conAutoReport);
		System.out.println(b2.modelName + "자동 신고기능 : "+ b2.conAutoReport);
		System.out.println(_01_Class_sub.conAutoReport);
		
		_01_Class_sub.conAutoReport = true;
		
		// 특정 범위를 초과하는 충돌 감지시 자동 신고 기능 개발여부
		System.out.println("- 개발후 -");
		System.out.println(b1.modelName + "자동 신고기능 : "+ b1.conAutoReport);
		System.out.println(b2.modelName + "자동 신고기능 : "+ b2.conAutoReport);
		System.out.println(_01_Class_sub.conAutoReport); // 클래스 변수를 접근할때는 이렇게 하는걸 권장
	}

}
