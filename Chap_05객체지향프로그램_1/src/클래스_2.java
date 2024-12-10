// 클래스 제작 => 인스턴스와 정적변수 구분
/*
 * 	클래스
 * 	 = 사용자 정의 데이터형 : 데이터를 모아서 전송할 목적, 데이터 관리
 * 	   배열의 단점을 보완 => 구조체 => 클래스로 대체
 * 	   => 변수 여러개를 모아서 관리(관련된 변수를 모아서 저장)
 * 	   => 베열 => 고정적, 같은 데이터형만 모을 수 있다는 단점
 * 	   => 클래스 => 가변형, 다른 데이터형도 모을 수 있다는 장점
 * 	   => ~vo : value Object => 값만 저장 => spring
 * 	   => ~dto : data transfor object => 데이터를 모아서 전송				
 * 										=> 브라우저, 윈도우, 서버 전송
 * 	 = 액션 클래스 : 변소+기능(메소드) => 기능
 * 	   => 메소드를 중심
 * 	   => ~dao : 데이터베이스 연결과 처리 => 오라클 , mysql
 * 	   => ~manager, ~service, ~model
 * 		   |크롤링     	|BI		|브라우저 연동
 * 		   |map=>openAPI|dao+model
 * 
 * 		
 * 		변수 => 데이터값을 따로 저장 => 인스턴스 변수
 * 			 > 한 개 메모리 공유 => 정적변수(공유변수)
 * 			  ------------------------------
 * 				static(0) 공유  static(x) 따로
 * 
 * 		=> 카드게임 => 52장
 * 			= 클래스는 한 개 설계 => 저장을 여러개 사용
 * 		class card
 * 		{
 * 			char num;    >> 'A', 'J', 'K', 'Q'
 * 			String type;
 * 			static int width;
 * 			static int height;
 * 		}
 * 
 * 		객체 : 사용자 정의 클래스의 변수 => 여러개를 제어할 수 있다
 * 	     	  여러 개 변수를 저장할 수 있는 메모리 공간이름
 * 			  메모리 주소를 이요하는 프로그램 => 참조변수
 * 			
 * 			정적인상태(데이터) => 명사형 => 변수
 * 			동적인상태(기능_ => 동사형 => 메소드
 * 			객체 : 변수+메소드
 * 				  현실세계에 있는 모든 사물
 * 			1. 설계 > 관련된 데이터 모아서 관리
 * 				class student
 * 				{
 * 					int hakbun;
 * 					string name;
 * 					string subject;
 * 					int year;
 * 				}
 * 			2. 메모리 저장 > 설계된 데이터 저장
 * 				student s1=new student()
 * 			3. 활용 > 초기화, 변경, 읽어오기
 * 				s1.hakbun=10;
 * 			4. 객체소멸
 * 				s1=null  ==> 가비지컬렉션 대상
 * 				=> system.gc()
 * 				   ----------- 멀티미디어, 화상채팅
 * 
 * 				int[] kor=new int[3]
 * 				int[] eng=new int[3]
 * 				int[] math=new int[3]
 * 				int[] total=new int[3]
 * 				double[] avg=new double[3]
 * 				int[] rank=new int[3]
 * 				char[] score=new char[3]
 * 				---------------------------
 * 				class student
 * 				{
 * 					int kor,eng,math,total,rank;
 * 					double avg;
 * 					char score;
 * 						======> 클래스 전체에 사용가능
 * 						======> 전역변수
 * 						======> 다른 클래스에서도 사용가능
 * 				}
 * 					new student() => 3번
 * 			
 */
class card
	{
		char num;
		String type; //new 이용후 저장공간을 생성한 후 사용=> 여러개 사용가능
		static int wid;
		static int hei;
		//컴파일시 자동생성=> 저장공간 한개만 사용=> 공유
	}
public class 클래스_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		card c1=new card(); //c1은 num,type 
		c1.num='A';
		c1.type="♡";
		c1.wid=150;
		c1.hei=180;
		System.out.println("c1안에 저장된 데이터: num :"+c1.num);
		System.out.println("c1안에 저장된 데이터: type :"+c1.type);
		System.out.println("c1안에 저장된 데이터: wid :"+c1.wid);
		System.out.println("c1안에 저장된 데이터: hei :"+c1.hei);
		
		card c2=new card();
		c2.num='2';
		c2.type="♧";
		// 메모리가 따로 생성 >인스턴스(객체변수)
		c2.wid=200;
		c2.hei=250;
		// 한 개 메모리 사용
		System.out.println("c2안에 저장된 데이터: num :"+c2.num);
		System.out.println("c2안에 저장된 데이터: type :"+c2.type);
		System.out.println("c2안에 저장된 데이터: wid :"+c2.wid);
		System.out.println("c2안에 저장된 데이터: hei :"+c2.hei);
		
		System.out.println("c1안에 저장된 데이터: wid :"+c1.wid); //추후 수정된 데이터값 적용
		System.out.println("c1안에 저장된 데이터: hei :"+c1.hei);
		//static => 클래스명.변수
		card.wid=300;
		card.hei=350; //클래스 변수
		
		
	}

}
