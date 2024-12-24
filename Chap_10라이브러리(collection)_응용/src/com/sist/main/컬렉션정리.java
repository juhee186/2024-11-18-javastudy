package com.sist.main;
/*
 *  	DAO => 오라클, manager => 파일
 *  	---------------------------
 *  	=> 예외처리
 *  	=> 사용자정의 데이터형 => VO => 캡슐화
 *  	=> 멤버변수 / 상수 / static
 *  	=> 메소드
 *  	  ------리턴형 / 매개변수	
 *  		  	----   ------사용자가 보내준 값
 *  			결과값 =>
 *  				1. 목록 ====> List
 *  				2. 상세보기 ====> VO
 *  				3. 총페이지 ====> int
 *  				--------------------
 *  	Collection
 *  	-----------IO => 2차(문법,형식) => DAO (웹)
 *  									--------
 *  	배열(고정적) => 데이터추가 => 새로운 배열
 *  	=> 동적배열 => 저장갯수 확인
 *  	  ---------------------가변
 *  
 *  	=> 많은 데이터를 저장할 수 있다
 *  	=> 표준화 : 개발자 모두가 같은 코딩
 *  	=> 단점 : 모든 데이터를 저장할 수 있다
 *  			--------데이터형이 틀린 경우도 있다
 *  				=> 형변환 / 제어문 작성 어려움
 *  				=> 같은 데이터만 첨부 => 배열
 *  				----------------
 *  				명시적 => 어떤 데이터형이 들어가는지 알려준다
 *  				=> 제네릭
 *  				List<String> : 가독성이 좋다
 *  				=> 저장되는 모든 데이터가 통일
 *  	
 */
import java.util.*;
public class 컬렉션정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("aaa");
		list.add(10);
		list.add('A');
		list.add(10.5);
		list.add("aaa");
		list.add(10);
		list.add('A');
		list.add(10.5);
	}

}
