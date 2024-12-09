/*
 *   변수 => 데이터 모아 관리 => 배열 / 클래스
 *   연산자/제어문
 *   => 연산자 응용 => 제어문
 *   => 제어문 응용 => 배열
 *   => 배열 응용 => 메소드
 *   => 메소드 => 클래스
 *   => 클래스 => 라이브러리
 *   ----------------------------------------
 *   => 처리하는 기능이 많은 경우 => 소스코딩이 많다
 *    						 -------------조립
 *    
 *   1) 문자열 => 웹, 윈도우 프로그램은 대부분 문자열로 만들어진다
 *   				가장 많이 사용되는 데이터형
 *   				문자 여러개를 모아 저장
 *   				--------char[] => String
 *   2) String : 일반 데이터형 / 클래스형
 *   	사용하는 방법
 *   	= 일반 데이터형(가장 많이 사용)
 *   	String 변수명="";
 *   	= 클래스형
 *   	String 변수명=new String("저장데이터","UTF-8")
 *   	----------------------- 한글변환(브라우저=>char=>1byte)
 *   3) String의 디폴트는 null (주소가 없는 상태)
 *   	=> 모든 클래스의 디폴트 => nullpointerExeption
 *   4) String 기능 (메소드)
 *   	** String,Math,Scanner,System > final class
 *   									-----------
 *   									  변경 불가능 > 있는 그대로 사용 / 표준화
 *   	** java.lang.* => import 생략가능
 *   
 *   	= 변환
 *   	toUpperCase() : 대문자 변환 
 *   		=> 메소드
 *   		 	결과값 : String
 *   			매개변수 : x
 *   			메소드명 : toUpperCase
 *   			기능
 *   				=> String toUpperCase() => 원형
 *   				=> String name=toUpperCase()
 *   	toLowerCase() : 소문자 변환
 *   				   String toLowerCase()
 *   **	valueOf() : 모든 데이터형을 문자형으로 변환
 *   				   String valueOf(int)
 *   				   String valueOf(char)
 *   				   String valueOf(double)
 *   						  ----------------오버로딩 : 같은 이름의 메소드로 다른 기능을 하는 예)println
 *   **	replace() : 문자, 문자열 변환
 *   				   String replace(char c1,char c2)
 *   							c1 => c2로 변경
 *   				   String replace(String old,String new)
 *   				   ------리턴형
 *   	replaceAll() : 패턴을 이용한 문자열 변환
 *   				   --------------regex(정규식)
 *   				   String replaceAll(String regex,String change)
 *   									 -------------
 *    	= 문자열 분해
 *   **	substring() : 문자를 자르는 경우
 *   				   String substring(int bagin)
 *   				   String substring(int bagin,int end)	
 *   											  ========
 *   												end-1
 *   **	split() : 단어별로 나눠서 배열 저장
 *   				   String[]split(String regex)
 *    
 *    	= 비교
 *   **	equals() : 같은 경우에 true (==)
 *   				   boolean equals(String s)
 *    	startsWith() : 시작하는 문자열이 같은 경우
 *    				   boolean startsWith(String s)
 *    	endsWith() : 끝나는 문자열이 같은 경우
 *    				   boolean endsWith(String s)
 *   **	contains() : 포함된 문자열
 *   			       boolean contains(String s)
 *   	=> 주로 if문에서 사용
 *    
 *    	= 위치 찾기
 *   **	indexOf() : 처음부터 찾는 경우 : 문자/문자열
 *   				   int indexOf(char c)
 *   				   int indexOf(String s)
 *    	lastindexOf() : 끝에서부터 찾는 경우
 *    				   int lastindexOf(char c)
 *   				   int lastindexOf(String s)
 *    
 *    	= 문자열 결합
 *    	concat() : 문자열 결합
 *    				   String concat(String s)
 *    	 +		 : 문자열 결합
 *    
 *    	= 기타
 *   **	trim() : 좌우 공백 제거
 *   				   String trim()
 *    	charAt() : 문자의 위치 => 문자 읽기
 *    				   char charAt(int index)
 *    								어떤 값  ===> 결과값
 *    							    매개변수		리턴형
 *    							사용자 요청값 => 매개변수
 *    							처리 => 결과값
 *    ---------------------------------------------------------
 *  		boolean login(String id, String pwd)
 *  		String[] find(sting fd)
 *    ---------------------------------------------------------
 *    	toCharArray() : String을 char[]로 변경
 *    				   char[] toCharArray()
 *    
 *    => 문자열 배열
 *    형식)
 *    String []arr={"","","","",""}; => 명시적 초기화
 *    String []arr=split()
 */


import java.util.Scanner;
public class 문자열배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열선언 >   선언과 동시 초기화
		String []names= {"홍길동","심청이","박문수","이순신","강감찬"};
		Scanner scan=new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name=scan.next();
		
		
		
		
		//출력
		for(String n:names)
		{
			//if(n.equals(name)) //같은 값만 / 대소문자 구분
			if(n.contains(name)) // 포함된 글자
			{	//equalsIgnoreCase 대소문자 구분 안함
				System.out.print(n+" ");
			}
			
		}
		
		
		
		
		
		

	}

}
