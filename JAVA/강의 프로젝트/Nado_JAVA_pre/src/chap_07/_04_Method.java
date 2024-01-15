package chap_07;

public class _04_Method {

	public static void main(String[] args) {
		_01_Class_sub b1 = new _01_Class_sub();
		b1.autoReport();// 현재 지원 안됨
		_01_Class_sub.conAutoReport = true;
		b1.autoReport();// 현재 지원 됨
		b1.insertMemoryCard(256);
		
		//일반 영상 : 1
		//이벤트 영상 (충돌 감지) : 2
		int fileCount = b1.getVideoFileCount(1);
		System.out.println("일반 영상 파일수 : "+ fileCount);
		int fileCount2 = b1.getVideoFileCount(2);
		System.out.println("일반 영상 파일수 : "+ fileCount2);

	}

}
