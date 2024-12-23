package com.sist.main;
/*
 * 	자바에서 지원하는 라이브러리
 * 				--------프로그램에 필요한 클래스를 모아서 개발시 사용가능하게 한다
 * 	=> 라이브러리 중심 => 조립
 *  => scanner / system / string...
 *  
 *  => 라이브러리
 *  	1) 자바에서 지원
 *  		java.lang
 *  			**Object
 *  			System
 *  			**String
 *  			StringBuffer
 *  			Math
 *  			**Wrapper : 데이터형을 클래스화
 *  			---------
 *  			**=> Integer
 *  			**=> Double
 *  			**=> boolean
 *  			=> byte
 *  			=> float
 *  			**=> Long
 *  			...
 *  		java.util
 *  			=> Scanner
 *  			=> Date
 *  			=> Calendar
 *  			=> Collection
 *  			   ---------->배열대체
 *  				List / Set / Map
 *  				----------------interface
 *  				List : **ArrayList, Vector, LinkList,Stack
 *  										 	--------Queue
 *  				Set : TreeSet / **HashSet : 중복없는 데이터
 *  				Map : **HashMap / Hashtable
 *  		java.io
 *  			=> FileReader / FileWriter
 *  			=> InputStream / OutputStream
 *  			=> BufferedReader / BufferedWriter
 *  			=> BufferedInputStream / BufferedOutputStream
 *  			=> 입출력 : 파일 / 메모리 / 네트워크
 *  			=> ~Stream , Reader/Writer
 *  			  --------	 --------------
 *  				1byte		2byte(한글포함)
 *  				| 네트워크 , 파일 업로드-다운로드
 *  			=>File
 *  		java.sql
 *  			=> Connection
 *  			=> Statement
 *  			=> ResultSet
 *  	-----------------------------
 *  		java.net
 *  			=> URL / ServerSocket / Socket
 *  		java.text
 *  			=> SimpleDateFormat / MessageFormat / DecimalFormat
 *  		java.lang.reflect
 *  			=> 리플렉션 => 메소드 / 클래스 / 변수 / 생성자
 *  		*** Annotation, 열거형
 *  			----------
 *  		J2SE
 *  		웹 라이브러리 : JSP / Servlet / Spring => 2차 자바
 *  		J2EE
 *  		J2ME (X) => kotlin =>dart (flutter)
 *  	-----------------------------
 *  		java.swing (X) ->한번 사용시 폐기
 *  	-----------------------------
 *  		=> java.http
 *  		=> java.servlet.http
 *  	-----------------------------
 *  		=> org.springFramework
 *  
 *  		java / Oracle / JSP / Spring / Spring-Boot
 *  	----------------------------------------------Back
 *  		HTML / CSS / JavaScript
 *  	----------------------------
 *  						|
 *  					JQuery / VueJS / ReactJS / NodeJS / NextJS
 *  				    -------------------------------------------front
 *  	1. 데이터 분석 : 파이썬(넘파이, 판다스, Matplotlib)
 *  					spring <==> 파이썬
 *  								 |
 *  							   Django
 *  	2. 검색엔진 : ElasticSearch / CRUD / 검색
 *  
 *  	2) 외부업체 지원 : Jsoup / lombok / spring
 *  		=> mvnrepository.com
 *  		=> simple-json / bson..
 *  	3) 사용자 정의 : 잘만들어진 클래스 / 자주 클래스
 *  		=> .jar
 *  		=> 1차 => JSP(MVC=>Spring 형식)
 *  ===========================================================================
 *  9장
 *  	java.lang패키지
 *  	1) import 생략 가능 => 자동추가
 *  		=> 가장 많이 사용되는 라이브러리 (System, String)
 *  	2) 대표 클래스
 *  		=> Object : 모든 클래스의 상위 클래스
 *  					--------Object 상속을 받는다
 *  			public class A extends Object
 *  						  ---------------생략가능
 *  		=> 모든 클래스에서 사용하는 기능(메소드)
 *  		=> toString() : 객체주소
 *  			=> 명시적 / 묵시적
 *  			A a=new A();
 *  			=> sysout(a.toString()) :명시적
 *  			=> sysout(a) : 묵시적
 *  		=> 자주 사용 된다 / 객체의 값이 정상적으로 처리 확인
 *  		=> 객체를 문자열화
 *  	=> clone() : 객체를 복제할 경우
 *  			=> 객체복사
 *  			=> 얕은복사 => 같은 주소를 이용
 *  			 --------call by reference
 *  			=> 깊은복사 => clone => 새로운 메모리에 저장
 *  			 ---------게임(아바타)	=> prototype
 *  	=> finalize() : 소멸자 => 메모리 해제시에 자동 호출
 *  	  ------------system.gc() : 바로 회수
 *  	  ------------프로그램 종료시 회수
 *  	=> equals() => 객체 비교 => 재정의(오버라이딩)
 *		=> HashCode() => 비교  
 *
 *
 */
class Stu
{
	private String name;
	private String phone;
	private String add;
	
	public Stu(String name, String phone, String add)
	{
		this.name=name;
		this.phone=phone;
		this.add=add;
	}
	public void print()
	{
		System.out.println(name);
		System.out.println(add);
		System.out.println(phone);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println(name);
		System.out.println(add);
		System.out.println(phone);
		return super.toString();
	}
	
	
}
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu s1=new Stu("홍길동", "010-1111-1111", "서울");
		Stu s2=new Stu("심청이", "010-2222-2222", "경기");
		// 객체 출력시 => toString 자동 호출
		//s1.print();
		System.out.println(s1); // 메모리 주소확인 => 묵시적
		//s2.print();
		System.out.println(s2.toString()); // 메모리 주소확인 => 명시적
		
	}

}
