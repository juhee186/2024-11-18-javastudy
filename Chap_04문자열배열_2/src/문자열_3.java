/*
 *  문자열
 *   => 비교 (로그인, 아이디 중복체크) => equals
 *   => 검색 => contains
 *   => 검색어 출력 => startsWith
 *   => 검색어를 자르는 경우 => substring()
 *   => 검색시 => 사용자 실수 => space => trim()
 */
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id="admin";
		// 문자열 자체가 String => 메모리주소
		if(id.equals(" admin".trim()))
		{
			System.out.println("아이디 존재");
		}
		else
		{
			System.out.println("아이디 미존재");
		}
		
		
		
		
	}

}
