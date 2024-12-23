package com.sist.main;
/*
 * 	멜론/지니뮤직
 * ----------따로 저장
 * 	=> join => 교집합
 *  => union => 합집합
 *  => minus => 차집합
 *  -------------------
 *  
 *  컬렉션 : 배열의 단점을 보완
 *  		고정적=>가변형 
 *  		=> 모든 개발자가 동일한 메소드를 이용 => 표준화
 *  		=> 가독성 / 처리기능 편리
 *  ---------
 *  List : ArratList / Vector / LinkedList
 *  	=>순서를 가지고 있다(인덱스)
 *  	=>데이터의 중복을 허용
 *  Set : HashSet / TreeSet
 *  	=>순서가 없다
 *  	=>데이터 중복을 허용하지 않는다
 *  	=>중복제거
 *  Map : HashMap / HashTabe
 *  	=>두개를 동시에 저장
 *  	 (키,값)
 *  	=>키는 중복할 수 없다 / 값은 중복가능
 *  	=>웹 => 클래스관리자
 *  	=>HttpServletRequest
 *  	=>HttpServletResponse
 *  	=>HttpSession
 *  	=>Cookie
 *  	------------Map
 *  	=>스프링 / MyBatis
 *  
 *  	ArrayList
 *  	=> 복사
 *  		addAll()
 *  	=> 순차적으로 출력
 *  		iterator()
 *  		listIterator()
 *  		=> 출력이 어려운 경우
 *  	=> Set <=> 복사 가능	
 *  
 *  	==> ArrayList
 *  		단순한 목록형 데이터를 관리하기 용이
 *  		---------------데이터베이스(오라클)
 *  
 */
import java.util.*;
public class ArrayList_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("홍길동");
		list.add("박문수");
		list.add("심청이");
		list.add("강감찬");
		list.add("심청이");
		list.add("홍길동");
		list.add("박문수");
		
		for(String name:list)
		{
			System.out.println(name);
		}
		System.out.println("========복사========");
		
//		ArrayList<String> list2=new ArrayList<String>();
//		list2.addAll(list);
//		
//		for(String name:list2)
//		{
//			System.out.println(name);
//		}
		// 코딩테스트
		Set set=new HashSet();
		set.addAll(list); 
		// 중복을 허용하지 않는다 => 순차적이지 않아 관리하기 어려움
		// set (중복제거) => arraylist 로 이동
		
		ArrayList<String>list2=new ArrayList<String>();
		list2.addAll(set);
		for(String name:list2)
		{
			System.out.println(name);
		}
		
	}

}
