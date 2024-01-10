package Training_Java.Constructor_Tr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class Util {
	
	//값 입력
	static Object InputReturn ()throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Object InputValue = br.readLine();
		return InputValue;
	}
	//입력값 타입확인 및 형번환 에러 체크
	static boolean TypeErrorConfirm(Object InputValue,String type) throws Exception {
		boolean returnType = true;
		try {
			if(type.equals("String")) {
				String.valueOf(InputValue);
			}else if(type.equals("int")) {
				int val = (int)InputValue;
			}
		} catch (ClassCastException cce) {
			returnType = false;
			throw new Exception("형번환 에러발생");
		}
		return returnType;
	}
	
	//메뉴 이동
	public void menuSelect() throws Exception{
		System.out.println("---메뉴---");
		System.out.println("1.로그인화면");
		System.out.println("2.회원가입화면");
		System.out.println("3.관리자화면");
		System.out.println("이동하시려는 메뉴의 번호를 입력해주세요");
		int MenuValue = -0;
		Object InputValue = Util.InputReturn();
		if (!Util.TypeErrorConfirm(InputValue,"int")) {
			System.out.println("올바른 값을 입력해주세요");
		}else {
			MenuValue = (int)Util.InputReturn();
		}
	}
	
	
	
	
	

}
