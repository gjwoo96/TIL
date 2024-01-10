package chap_06;

public class _08_MainMethod {

	//이클립스에서 main메소드에 파라미터 전달하는방법
	// 파일 우클릭 - Run As - Run Configurations - Arguments - Program arguments에 입력하면된다.
	
	public static void main(String[] args) {
		for(String str : args) {
			System.out.println(str);
		}
	}

}
