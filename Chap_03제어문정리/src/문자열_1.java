/*/
 *  문자열 => 기능(메소드) => 반드시 결과값 (리턴형/반환형)
 *  = > scan.Nextlnt() => int
 *  
 *  => String : 문자열을 저장하는 데이터형
 *  			------------------- 제한이 없다
 *   			일반 데이터형으로도 사용 / 클래스형으로 사용가능
 *     문자변수선언
 *     = String name="홍길동"; *** 우선시
 *     = String name=new String("홍길동") => 새로운 메모리 공간에 저장
 *  => 기능(메소드)
 *     => 문자열은 비교연산자를 사용하지 않는다 
 *       문자열 기능
 *       --------
 *       1) 비교기능
 *       	**equals() => ==
 *          => 로그인 처리 => id /pwd
 *          equalsIgnoreCase() : 대소문자 구분없이 처리
 *          ------------------------------------
 *          **contains() => 포함문제 => 검색
 *          ------------------
 *          **startsWith()
 *          **endsWith()  
 *          -------------------------------------대소문자 구분
 *          ------------------자동완성기/서제스트 
 *       2) 변경
 *       3) 문자열 분해
 *       4) 제어
 *         
 */
//사용자 입력값 받아서 => 아이디 비밀번호 => 로그인 처리

import java.util.Scanner;


public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String ID="admin"; //고정>상수
		final String PWD="1234";
		
		Scanner scan=new Scanner(System.in);
		//equals => 같으면 참/ 다르면 거짓
		while(true) //무한루프
		{
			System.out.print("ID 입력:");
			String id=scan.next();
			System.out.print("PWD 입력:");
			String pwd=scan.next();
			//Scanner => 정수 : nextint() / 문자열 : next() 실수 : nextdouble() 논리:nextboolean
			//String => 변경불가능 => 확장할수없다 => 제공한 내용만 사용
			// => 표준화
			//변수 => 대소문자 구분
			// equalsIgnoreCase => 대소문자구분없이 >> 검색어처리시사용
			// equals => 대소문자 구분 >> 아이디비밀번호시사용
			/*
			 * ---------------------------------------
			 * 문자열 비교 (==)
			 * 
			 * 반대효과 => !=
			 * 
			 */
			if(ID.equalsIgnoreCase(id) && pwd.equals(pwd))
			{
				System.out.println("로그인됨");
				System.out.println("메인페이지로 이동");
				break; // while 종료
			}
			else
			{
				System.out.println("아이디나 비밀번호가 다름");
				System.out.println("다시 입력");
			}
		}
		
		
		
		
		
		

	}

}
