package Training_Java;

public class Overriding_parent {
	
	//오버로딩이란?
	//한 클래스 내에, 여러개의 같은 메소드를 정의하되 리턴값은 같고, 파라미터을 다르게하여
	//가독성을 증가시키는 코딩이 가능하다.
	
	//오버라이딩이란?
	//상속받은 메소드의 내부를 커스텀하여 사용하는것이며 객체지향 언어의 특징인 다형성을 나타낸다.
	
	
	public String name;
	public int age;
	
	public void print () {
		System.out.println("이름은 : "+ name + "이고, 나이는: "+age+"입니다.");
	}
	public void print(String str) {
		
	}

}
