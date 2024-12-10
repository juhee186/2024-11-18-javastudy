// 멤버변수, 공유변수의 초기화 => 값 주입
/*
 * 	구성요소 => 설계 => 메모리 저장 후 사용
 * 					--------------객체
 *  클래스
 *   ** = 멤버변수만 가지고 있는 경우 => 데이터형 클래스
 *   		사용자 정의 데이터형 : ~VO, ~DTO
 *   ** = 메소드만 가지고 있는 경우 => 액션클래스(기능)
 *   		연결용 : 오라클 연결 / 브라우저 연결
 *   			   --------  ----------
 *   				~DAO  	  ~model(~controller,~action)
 *   		브라우저 =================오라클(x)
 *   		------HTML/CSS => 화면UI
 *   		브라우저 ========= 자바 ========== 오라클
 *   						---
 *    	= 혼합형 : 변수+메소드 (크롤링, openapi)
 *    			~manager,~service
 *  class className
 *  {
 *  	--------------------------------
 *  	변수설정 => 클래스 안에서 필요한 데이터 설정
 *  	// 기본형 / 클래스 / 배열 / 열거형
 *  	--------------------------------
 *  	변수 => 사용하기 위해서 초기값(초기화)
 *  	1) 명시적 초기화 --- 우선	
 *  		int a;
 *  		a=100;
 *  	2) 생성자
 *  		1. 클래스를 메모리에 저장할 때 호출하는 메소드
 *  			new 생성자()
 *  			--- ------초기값 주입
 *  			저장할 메모리 공간 생성
 *  			=> 멤버변수의 초기화 담당
 *  		2. 특징
 *  			= 클래스명과 동일
 *  			class A => A()
 *  			class B => B()
 *  			= 리턴형이 없다
 *  			class A
 *  			=>void A()  - 일반메소드 취급
 *  			=>int A()   - 일반메소드 취급
 *  			= 여러개 만들 수 있다
 *  			  ---------------오버로딩
 *  			  오버로딩의 조건
 *  			  ----------
 *  				1) 메소드명 동일
 *  				2) 리턴형은 관계가 없다
 *  				3) 매개변수 => 갯수나 데이터형이 다르면 다른 메소드로 인식
 *  				4) 접근지정어는 관계가 없다
 *  				5) 한 개 클래스 안에서 존재
 *  			= 상속에서 예외
 *  			= 생성자가 필요한 위치
 *  			A()=> 매개변수가 없는 생성자 => 디폴트 생성자
 *  			*** 생성자가 없는 경우 컴파일러에 의해 생성
 *  				-------------디폴트 생성자
 *  			= 생성자의 용도
 *  				=변수초기화 (명시적인 초기화가 안되는 경우)
 *  							=> 구현후 데이터 처리
 *  				= 시작과 동시에 처리하는 기능이 있는 경우
 *  				  윈도우 초기화 (화면 UI) , 파일읽기..
 *  			= 생성자 호출
 *  				new 생성자() = 메모리 생성
 *  	3) 초기화블럭
 *  		= 인스턴스 블럭
 *  		= static 블럭
 *  	--------------------------------
 *  	메소드 : 기능처리
 *  	--------------------------------
 *  }
 */
class student
{//1. 명시적 초기화
	int hakbun=1;
	String name="홍길동";
	String sex="남자";
	
	//초기화
	//2.생성자
	student(){
		System.out.println("student()디폴트생성자 call..");
		hakbun=2;
		name="심청이";
		sex="여자";
	}
	//생성자 여러개 사용 가능
	student(int h,String n,String s)
	{
		hakbun=h;
		name=n;
		sex=s;
	}
	student(int h,String n)
	{
		//생성자 => 자신의 생성자 호출
		this(); //super() => 상속 내린 클래스의 생성자
		hakbun=h;
		name=n;
		
	}
	student(String n,String s)
	{
		this(5,"이산"); // 주의점 : 반드시 첫줄에 사용!
		name=n;
		sex=s;
	}
	//student(10.5,'A',100)
	student(int a,int b, int c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	student(char a,double b, int c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	student(double a,double b, double c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
}
public class 클래스_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		student hong=new student();
//		System.out.println(hong.name);
//		System.out.println(hong.sex);
//		System.out.println(hong.hakbun);
//		
//		student shim=new student();
//		System.out.println(shim.name);
//		System.out.println(shim.sex);
//		System.out.println(shim.hakbun);
		
		student hong=new student(1,"홍길동","남자");
		System.out.println(hong.name);
		System.out.println(hong.sex);
		System.out.println(hong.hakbun);
		
		student shim=new student(2,"심청이","여자");
		System.out.println(shim.name);
		System.out.println(shim.sex);
		System.out.println(shim.hakbun);
		
		student park=new student(3,"박문수","남자");
		System.out.println(park.name);
		System.out.println(park.sex);
		System.out.println(park.hakbun);
		
		student lee=new student(4, "이순신");
		System.out.println(lee.name);
		System.out.println(lee.sex);
		System.out.println(lee.hakbun);
		
		student kim=new student("김두한","남자");
		System.out.println(kim.name);
		System.out.println(kim.sex);
		System.out.println(kim.hakbun);
		
		student d=new student(10.5,'A',100);
		
		
	}

}
