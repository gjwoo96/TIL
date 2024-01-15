package chap_07;

public class _01_Class_sub {
	
	//인스턴스 변수
	String modelName;
	String resolution;
	int price;
	String color;
	int serialNumber;
	
	static int counter = 0; 
	
	//클래스 변수
	static boolean conAutoReport = false;
	
	//생성자
	//객체가 생성될때 자동으로 호출되는 메소드
	_01_Class_sub(){
		//System.out.println("객체생성완료");
		//this.serialNumber = ++counter;
		//System.out.println("새로운 시리얼 넘버를 발급 받았습니다 : "+ this.serialNumber);
	}
	
	_01_Class_sub(String modelName, String resolution, int price , String color){
		
		//기본생성자를 호출
		//this();// 즉 _01_Class_sub 메소드를 뜻함
		
		//System.out.println("사용자 정의 생성자 호출");
		//this.modelName = modelName;
		//this.resolution = resolution;
		//this.price = price;
		//this.color = color;
	}
	
	
	void autoReport() {
		if(conAutoReport) {
			System.out.println("충돌이 감지되어 자동으로 신고합니다.");
		}else {
			System.out.println("자동 신고 기능이 지원되지 않습니다.");
		}
	}
	
	void insertMemoryCard(int capacity) {
		System.out.println("메모리 카드가 삽입되었습니다.");
		System.out.println("용량은 "+ capacity + "GB 입니다.");
	}
	
	int getVideoFileCount(int type) {
		if (type == 1) {
			return 9;
		}
		else if (type == 2) {
			return 1;
		}
		
		return 10;
	}
	
	void record(boolean showDateTime,boolean showSpeed, int min) {
		System.out.println("녹화를 시작합니다.");
		if(showDateTime) {
			System.out.println("영상에 날짜정보가 표시됩니다.");
		}
		if(showSpeed) {
			System.out.println("영상에 속도정보가 표시됩니다.");
		}
		System.out.println("영상은" + min + "분 단위로 기록됩니다.");
	}
	
	void record() {
		record(true,true,5);
	}
	static void callServiceCenter() {
		System.out.println("서비스 센터(1588-0000) 로 연결합니다.");
	}

	void appendModelName(String modelName) {
		//this 사용시
		//클래스가 가지고있는 인스턴스변수에 접근
		this.modelName += modelName;
	}
	
	//Getter(값을 가지고오는 메소드) & Setter(값을 설정하는 메소드)
	//Getter
	String getModelName() {
		return modelName;
	}
	//Setter
	void setModelName(String modelName) {
		this.modelName = modelName;
	}
	String getResolution() {
		
		if(resolution == null || resolution.isEmpty()) {
			return "판매자에게 문의하세요";
		}
		
		return resolution;
	}
	void setResolution(String resolution) {
		this.resolution = resolution;
	}
	
	int getPrice() {
		return price;
	}
	
	void setPrice(int price) {
		if(price < 100000) {
			this.price = 100000;
		}else {
			this.price = price;
		}
	}
	
	String getColor() {
		return color;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	
	
}
