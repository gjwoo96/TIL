package chap_03;

public class String02 {
	public static void main(String[] args) {
		String s = "I like Java and Python and C.";
		
		//문자열 변환
		System.out.println(s.replace(" and", ",")); //and를 , 로 변환
		System.out.println(s.substring(s.indexOf("Java")));
		//시작위치는 시작 인덱스를 포함하지만 끝위치는 끝인덱스 앞까지만 잘라냄
		System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));
		
		//공백 제거
		s = "         I love Java.";
		System.out.println(s.trim()); // 앞뒤 공백 제거
		
		//문자열 결합
		String s1 = "Java";
		String s2 = "Python";
		System.out.println(s1 + s2);
		System.out.println(s1 + "," + s2);
		System.out.println(s1.concat(",").concat(s2));
	
	}
}
