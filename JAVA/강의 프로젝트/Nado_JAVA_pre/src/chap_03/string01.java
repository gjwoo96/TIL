package chap_03;

public class string01 {
	
	public static void main(String[]args) {
		String s = "I like Java and Python and C.";
		System.out.println(s);
		
		// 문자열의 길이
		System.out.println(s.length()); //29
		
		
		// 대소문자 변환
		System.out.println(s.toUpperCase()); //대문자로
		// 소문자로 변환
		System.out.println(s.toLowerCase()); //소문자로
		
		//포함 관계
		System.out.println(s.contains("Java")); //포함시 true 
		System.out.println(s.contains("C#"));//미포함시 false
		System.out.println(s.indexOf("Java")); //위치정보 7 (문자열의 위치는 0부터시작)
		System.out.println(s.indexOf("C#"));// 미포함시 -1
		System.out.println(s.indexOf("and"));//일치하는 문자열의 첫 인덱스
		System.out.println(s.lastIndexOf("and"));//일치하는 문자열의 마지막인덱스
		System.out.println(s.startsWith("I like"));//이 문자열로 시작하면 true 아니면 false
		System.out.println(s.endsWith("."));//이 문자열로 끝나면 ture or false
	
		
	}
}
