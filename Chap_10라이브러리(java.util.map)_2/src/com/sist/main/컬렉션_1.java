package com.sist.main;
/*
 * 	collection framework
 * 	1) 다수의 데이터를 쉽고 효율적으로 처리가 가능하게 만든
 * 	  -----------
 * 		표준화된 틀래스 집합 (자바에서 지원 라이브러리)
 * 	2) 자료구조 => CRUD (읽기 / 추가 / 삭제 / 수정)
 * 	3) 배열의 단점 보완 => 고정 => 가변
 * 		=> 동적으로 변환 (메모리 추가-삭제시 자동 조절)
 * 	4) 단점 => 모든 데이터를 저장할 수 있다
 * 			 --------- 제어하기 어렵다(object)
 * 			  | 한 가지 데이터형만 저장해서 사용하는 것을 권장
 * 			  -----------------
 * 			   | 제네릭을 이용
 * 		=> 제네릭
 * 			1) 데이터형 통일화 (object => 원하는 데이터형으로 변경)
 * 			2) 소스 간결
 * 			3) 어떤 데이터를 저장하는지 확인 가능(명시적)
 * 			4) 형변환이 필요없다
 * 			5) 컬렉션에서 주로 사용
 * 			6) 제네릭 지정시에는 반드시 클래스형으로만 사용가능
 * 				=> 기본형 사용 불가
 * 				  -------------자바지원 => Wrapper
 * 				Wrapper : 기본형을 클래스화
 * 			형식) List<int> (X)
 * 				List<Integer>
 * 				List<double> =>List<Double>
 * 			=> T / E / K / V
 * 			   -   -   -   -
 * 						   Value=> Object
 * 					   Key=> 문자열
 * 	  			   element=> 클래스
 * 			   type=> 클래스
 * 
 * 		class Box<T>
 * 		{
 * 			T t;
 * 			public void set T(T t)
 * 			{
 * 				this.t=t;
 * 			}
 * 			public T get T()
 * 			{
 * 				return;
 * 			}
 * 		}
 * 			Box box=new Box(); => T (object)
 * 			Box<String> box= new Box<String>() => T => String T
 * 			=> T가 한번에 저장된 데이터형으로 변경
 * 			=> 사용자 정의 클래스로 변경
 * 			Box<Sawon> => T => Sawon
 * 
 * 			Collection => interface
 * 				|
 * 	-------------------------
 *  |			|			|
 * List    	   Set	   	   Map->인터페이스
 * 순서 있음    순서 없음		   Key,value 동시저장
 * (인덱스)	데이터 중복허용x		키는 중복x
 * 데이터 중복허용				벨류는 중복o
 *  |
 * 구현 클래스
 * -ArrayList
 * 데이터베이스:목록
 * 	=>브라우저로 전송
 * 	=>웹
 * -LinkedList
 * 수정.삭제.추가시 속도빠름
 * 	=>일반윈도우(게시판)
 * -Vector
 * 동기화 => 네트워크
 *  =>Vector를 보완한 클래스
 *   ->ArrayList
 *   
 *=> 같은 기능을 가지고 있다
 *  ------------------
 *  add() : 추가
 *  set() : 수정
 *  get() : 읽기
 *  remove() : 삭제
 *  --------------CRUD : 게시판
 *  		create . read . update . delete
 *  		--추가-- --읽기--  --수정--  --삭제--
 *    오라클: insert  select  update	 delete
 *  size() : 저장갯수
 *  isEmpty() : 저장된 데이터가 있는지 확인
 *  clear() : 전체삭제
 *  ---------------------
 *  addAll() =>다른 List,Set에 있는 데이터 복사
 *  subList / retain / contains..
 *  ----------------------------------
 *  
 *  	Set
 *    **=> HashSet
 *  	=> TreeSet
 *  	1) List 데이터 중 중복제거
 *  	  -------------------ditinct
 *  	2) 순서가 없다 (인덱스없음)
 *  	3) 데이터 중복허용 X
 *  		=> id / 장바구니
 *  		  ------------map
 *  		=> 장르 / 부서 / 직위
 *  	4) HashSet : 접근속도가 빠르다
 *  	   TreeSet : 정렬 / 검색
 *  	5) 주요메소드
 *  	add() : 추가
 *  	remove() : 삭제
 *  	clear() : 전체삭제
 *  	iterator() : 데이터를 모아서 출력
 *    -------------
 *    HeadSet() / TailSet() 
 *    --------최신방문
 * 				
 */
// => 객체 저장 => 재정의
import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
class Sawon
{
	private int sabun;
	private String name;
	
//	public int getSabun() {
//		return sabun;
//	}
//	public void setSabun(int sabun) {
//		this.sabun = sabun;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public Sawon(int sabun, String name) {
//		super();
//		this.sabun = sabun;
//		this.name = name;
//	}
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return (sabun+name).hashCode();
//	}
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		if(obj instanceof Sawon)
//		{
//			Sawon s=(Sawon)obj;
//				return name.equals(s.name) && s.sabun==s.sabun;
//		}
//		return false;
//	}
	
	
}
public class 컬렉션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1=new Sawon(1,"홍길동");
		Sawon s2=new Sawon(1,"홍길동");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Set<Sawon> set=new HashSet<Sawon>();
		set.add(s1);
		set.add(s2);
		System.out.println(set.size());
		
		
	}

}
