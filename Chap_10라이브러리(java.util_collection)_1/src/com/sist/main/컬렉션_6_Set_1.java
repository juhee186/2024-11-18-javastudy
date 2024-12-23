package com.sist.main;

import lombok.Data;

/*
 * 	List
 * -----순서가 있다 / 중복 허용한다
 * 		=> 웹 => 중복허용(오라클)
 * 	Set => 345페이지
 * -----순서가 없다 / 중복 허용하지않는다
 * 		=> List에서 중복을 제거하는 역학
 * 		=> 장르, 회원명, 장바구니..
 * 		=> 오라클 : distinct
 * 				----------명령어
 * 	HashSet : 저장용
 * ---------------웹 채팅 =>
 * 	TreeSet : 검색용
 * ==================================
 * 
 * 	345페이지
 * --------
 * 	Set (인터페이스)
 * 	1) 저장되는 순서가 없다
 * 	  ----------------출력이 다르게 나놀 수 있다
 * 	2) 중복된 데이터는 허용하지 않는다
 * ------------------------------------------
 * 	3) HashSet / TreeSet
 * 				 -------검색속도 빠르다
 * 	4) 주요메소드
 * 		=> add() => 객체 추가(데이터 추가)
 * 		=> remove() => 삭제 => remove(object ob)
 * 		=> isEmpty() => 데이터 저장여부
 * 		=> size() => 데이터 저장 갯수
 * 		=> iterator() => 순차적으로 데이터를 읽을 경우
 * 		=> clear() => 모든 데이터를 지울 경우
 * 	5) List에서 중복데이터를 제거
 * 	6) 일반데이터 => 중복제거
 * 		객체 => 데이터값이 같은 경우에는 데이터를 제거하지 못한다
 * 		hashCode() / equals() 재정의
 * 
 */
@Data
// hashCode, equals => 오버라이딩
class sawon2
{
	private int sabun;
	private String name;
	private String dept;
	
	public sawon2(int sabun,String name,String dept)
	{
		this.sabun=sabun;
		this.name=name;
		this.dept=dept;
		//지연변수 / 매개변수 우선순위
		//this.은 생략가능 => 구분자(멤버변수==지역변수)
		
	}
}
public class 컬렉션_6_Set_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sawon2 s1=new sawon2(1, "홍길동", "개발부");
		sawon2 s2=new sawon2(1, "홍길동", "개발부");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		if(s1.equals(s2))
		{
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");
		}
		
	}

}
