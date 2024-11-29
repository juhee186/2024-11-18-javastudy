/*
 *  String 클래스  >> char[]을 제어
 *  => 문자 여러개 저장하는 공간
 *     --------: 문자열 : "" char => ''
 *  => 문자열을 저장하는 일반데이터 / 기능(메소드)을 가지고 있는 클래스형
 *  => 웹 / 윈도우 => 자바로 만들 수 있는 모든 프로그램의 핵심
 *     => 오라클 : varchar2 / clob , mysql : varchar / text
 *     => c/c++ : 문자열이 없다 => char[] , char*
 *  => 문자열을 저장하는 방법
 *     String name = "홍길동"
 *     ------ ----
 *     데이터형  변수명      
 *  => 클래스형으로 저장하는 방법
 *     String name =new String("홍길동");
 *  => String에서 지원하는 기능(메소드)
 *     # 메소드
 *       리턴형(처리결과값) 메소드명(매개변수)
 *       ------------  ----- ------
 *        = 데이터형     =기능    =어떤값을 첨부
 *       {
 *        	요청처리
 *          결과값 전송
 *       }
 *       리턴형 : 결과값 1개
 *       매개변수 : 없는 경우 / 1개인 경우 / 여러개인 경우
 *       		random() substring(1) substring(1,4)
 *       		length()
 *       메소드 : 라이브러리 => 이미 만들어져 있는 상태
 *       	    *** 사용자 정의 => 직접 만들어 처리
 *       			-------- 조립
 *       *** 객체지향 프로그램 : 변수 / 메소드
 *       -----------------------------
 *   String에서 사용하는 메소드
 *   1) ** length() : 문자의 갯수(한글/알파벳) => 동일
 *   				* 알파벳 => 저장시 1byte : asc/unicode
 *   				   한글 => 저장시 2byte : unicode
 *   					=> "utf-8"
 *      -----------------------------------------------
 *      원형
 *       int length() 
 *                   => int len=length()
 *                   => long / float / double
 *                   => 받는 경우 데이터형이 같거나 커야한다
 *                   => 작은 데이터형으로 받아야 할 경우
 *                      ------------------ >> 형변환 후 사용
 *                      string word="홍길동";
 *    	  				byte len=(byte)word.length();   
 *    				 	** 가급적이면 같은 데이터형을 사용하는 것이 좋다
 *      -----------------------------------------------
 *     예) string word="홍길동";
 *    	  int len=word.length();  word안에 있는 글자의 갯수
 *    	  len=3
 *    		 = > 비밀번호 글자수, 입력여부 확인
 *    			if(word.length()<1) => 입력이 안된 상태
 *    		 = > 유효성 검사
 *   2) charAt => 원하는 위치의 문자 1개 추출
 *   	-------------------------------------------------
 *    	원형
 *    	char charAt(int index)
 *       |    			|
 *      결과값	      매개변수 => index 번호에 해당되는 문자 추출요청
 *      --------------------------------------------------
 *      문자열 저장
 *      String msg="Hello java";
 *      
 *      ----------------------------------------
 *      'H' 'e' 'l' 'l' 'o' ' ' 'j' 'a' 'v' 'a'
 *      ----------------------------------------
 *       0   1   2	 3	 4	 5	 6	 7	 8	 9
 *       charAt(3) ==>'l'  => 인덱스번호는 '0'부터 시작
 *       					  ------------------ 배열 (문자열)
 *       										  char[]
 *       예) 
 *        String msg="Hello java";
 *        char c=msg.charAt(6) ==> 'j'
 *        String => 저장할 수 있는 문자의 갯수는 제한이 없다
 *             		=> 줄거리 / 회사소개 
 *   3)** indexOf => 지정된 문자나 문자열의 인덱스 번호를 찾아주는 역할
 *   		=> 웹 (MVC)
 *   		=> 브라우저에서 실행되는 언어
 *   		   ------------------- 자바가 아니다 HTML      
 *    	---------------------------------------
 *    	원형
 *    	 => 오버로딩 기법(중복메소드 선언)
 *     			=> 새로운 기능 추가
 *     		int indexOf (char c)
 *     		int indexOf (String s)
 *      ----------------------------------------
 *     *** 오버로딩 VS 오버라이딩
 *           |		   |
 *          new      modify
 *    	String msg="Hello java";
 *    	int index=msg.indexOf('j');
 *   	index=6
 *   	int index=msg.indexOf('k');
 *   	index=-1
 *     문자열을 찾는 경우에는 첫번째 문자의 인덱스번호 추출
 *     => 대소문자 구분
 *     => 첫번째 문자부터 찾기
 *    4) lastindexOf => 뒤에서부터 요청된 문자의 인덱스 번호 추출
 *       -----------------------------------------
 *     	 원형
 *     		int lastindexOf (char c)
 *     		int lastindexOf (String s)
 *     		=> URL / 파일경로 / 확장자
 *     
 *     		String msg="Hello java";
 *         	int len=msg.indexOf('a');    => 7
 *          int len=msg.lastindexOf('a');   => 9
 *       -----------------------------------------
 *    5) 검색 관련
 *    	 ** contains() : 포함 문자 => %검색어%
 *    	 => 일반검색기
 *       -----------------------------------------
 *       원형
 *       	boolean contains(String s)
 *       				    ----------
 *       				      포함된 문자
 *       					  > 포함된 경우: 참
 *       					  > 포함되지 않은 경우 : 거짓
 *       	=> 사용되는 제어문 if	
 *          => 정규식	
 *          => 제목 / 내용 /가수					  
 *     	 ------------------------------------------
 *     6) 서제스트 : 자동완성기
 *          => 네이버 / 구글  => 완성기 => 쿠키
 *          						 ----타켓형 광고
 *     	  -------------------------------
 *     	 * startsWith : 시작문자열이 같을 때 => 자음(오라클 => procedure)
 *     	 * endsWith : 끝문자열이 같을 때
 *        ------------------------------------------------------
 *        원형
 *        boolean startsWith(string a)
 *        					 -------- 시작문자열
 *        		=> 웹에서 방문한 맛집(쿠키)
 *        		=> 검색기
 *        *** 공백
 *        boolean endsWith(string a)
 *        				   --------- 끝문자열
 *        -------------------------------------------------------
 *      7) 변환
 *       *  replace() => 문자/문자열 변환
 *        -----------------------------------------------
 *        원형
 *        String replace(char old,char new) > 문자만
 *        				 -------- ---------	
 *        String replace(String old,String new)	> 문자열			
 *        ----------------------------------------------- 
 *        String msg="Hello java";  > 기존값은 변경되지 않는다 (원본유지)
 *        String s=msg.replace('a','b');
 *        s="Hello jbvb"  > 바뀐내용만 저장
 *        String s=msg.replace("java","oracle");
 *        s="Hello oracle"
 *         replaceAll() => 전체 변경
 *        ------------------------------------------
 *        원형
 *        String replaceAll(String regex,String s)
 *        					------------- -------
 *                 			패턴을 적용해서 변경
 *                 			-------
 *                 			 정규식
 *         => [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.
 *         	  ---- ----
 *              |    |
 *             범위   갯수
 *           0~9까지  1~3개   
 *          맛있는 맛있고 맛있니...
 *          맛있*  
 *        --------------------------------------------         
 *      8)*** Trim() : 좌우의 공백만 제거
 *         ---------------------------------
 *         > 입력여부 => 데이터를 자르는 경우 공백 제거
 *         원형
 *         String trim()
 *         String msg=" Hello java "; 
 *         String s=msg.trim()
 *          => s="Hello java"
 *         ---------------------------------
 *      9)  toUpperCase() : 대문자 변환
 *       	toLowerCase() : 소문자 변환
 *         ---------------------------------
 *         원형
 *         String toUpperCase()
 *         String toLowerCase()
 *         예) 
 *          String msg="java";
 *          String s=msg.toUpperCase()
 *           s=JAVA
 *          String s=msg.toLowerCase() 
 *           s=java
 *         ----------------------------------
 *     10)**  valueOf()  => 모든 데이터형 함수를 문자열로 변환
 *          -----------------------------------
 *          원형
 *          중복 메소드 정의  > 메소드명 동일
 *          String valueOf(int i) 
 *          String valueOf(char i) 
 *          String valueOf(boolean i) 
 *          String valueOf(double i) 
 *          String valueOf(float i) 
 *          String valueOf(byte i) 
 *          String valueOf(char[] i) 
 *          => static 으로 제작 => 공통적인
 *             ------ 변수선언 없이 클래스명으로 접근 가능
 *             String.valueOf()
 *             => Math
 *          ------------------------------------
 *      11)** substring() => 문자열 자르기
 *          ------------------------------------
 *          원형
 *          String substring(int begin)
 *          	begin부터 시작해서 마지막까지
 *          	예)
 *            String s= "aaa.java";
 *            String ext=s.substring(4);   => java
 *            		=> indexOf,lastindexOf
 *          String substring(int begin,int end)
 *            String s= "Hello java";
 *            =>중간에 자르는 경우 매개변수 2개(어디서,어디까지)
 *             String ext=s.String substring(2,5)
 *             								   - 미포함
 *             								   => end-1
 *             전화번호 : 010-1111-1111
 *             우편번호 : 000-000
 *          ------------------------------------
 *          
 *      12)** split() => 단어별 구분
 *      	------------------------------------
 *      	원형
 *      	String[] split(String regex)
 *      		==1|제목|출연|상영일...
 *      	------------------------------------
 *      13) format() => 변환
 *      	------------------------------------
 *      	원형
 *      	String format(String s,Object obj...)
 *      									-----
 *      		>> 가변 매개변수 => 원하는 갯수만큼 사용가능
 *      		   format("%d %d",10,20)
 *      		>> %.2f
 *      	------------------------------------
 *      14)*** equals() => == ( 저장된 문자열 비교)
 *      	------------------------------------
 *      	원형
 *    	    boolean equals(String s)
 *    	    => 로그인 처리, 아이디 찾기...
 *    		------------------------------------
 *            
 */
import java.util.Scanner;
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String msg=" Hello java";
		/*int len=msg.indexOf("ava");
		System.out.println(len);
		// 대소문자 구분
		*/
	/*	if(msg.contains("w"))
		{
			System.out.println("포함");
		}
		else
		{
			System.out.println("미포함");
		} */
		
	/*	  if(msg.trim().startsWith("lo")) //trim() : 공백제거
				{
					System.out.println("0");
				}
		  else
				{
					System.out.println("N");
				}
		*/


/*String[] data= {
			"자바와 JSP",
			"혼자 배우는 자바",
			"스프링과 자바",
			"자바의 정석",
			"자바 기초",
			"스프링 부트와 자바"
		};
		
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력:");
		String fd=scan.next();
		for(String d:data)
		{
			if(d.startsWith(fd))
			{
				System.out.println(d);
			}
		}*/
		
		int a=10;
		int b=20;
		System.out.println(a+b);
		System.out.println(String.valueOf(a)+String.valueOf(b)); //문자열 결합 문자"10"+"20" =1020
		
		
		
		
		
	}

}
