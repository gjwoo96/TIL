package chap_03;

public class _03_StringCompare {

	public static void main(String[] args) {
		//문자열 비교
		String s1 = "Java";
		String s2 = "Python";
		
		System.out.println(s1.equals(s2)); //문자열 내용이 같으면 true, 다르면 false
		System.out.println(s1.equals("Java"));
		System.out.println(s2.equals("python"));
		//대소문자 구분없이 내용만 같으면 true
		System.out.println(s2.equalsIgnoreCase("python")); 
		
		//문자열 비교 심화
		s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
		s2 = "1234";
		System.out.println(s1.equals(s2)); //true (내용)
		System.out.println(s1 == s2); // true (참조)
		
		s1 = new String("1234");
		s2 = new String("1234");
		//new String으로 값을 할당하게되면 값은 같지만 서로 다른곳을 참조하게되어 부등호 비교시 false가 나온다
		System.out.println(s1.equals(s2));//
		System.out.println(s1 == s2);
		
		//정리
		//그냥 변수 즉 literal로 생성할경우 값이 같으면 동일한 객체를 바라본다
		//하지만 new String() 생성한 변수는 다른 메모리 주소의 객체를 바라본다 
		//equlas는 값이 동일한지 비교, ==는 메모리상 동일한 객체인지 비교한다.
	}

}
