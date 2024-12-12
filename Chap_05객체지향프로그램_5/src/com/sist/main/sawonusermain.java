package com.sist.main;
import com.sist.vo.*; // 라이브러리, 사용자정의 => 패키지가 다른 경우 import 파일 불러오기
public class sawonusermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sawon hong=new sawon(1,"홍길동","개발부","대리","2021-10-10",3600);
		//초기화 => 생성자 => 변경이 불가능
		//나머지 변경 =>setter
		System.out.println("=====홍길동 사원 정보======");
		System.out.println("사번: "+hong.getSabun());
		System.out.println("이름: "+hong.getName());
		System.out.println("부서: "+hong.getDept());
		System.out.println("직위: "+hong.getJob());
		System.out.println("입사일: "+hong.getRegdate());
		System.out.println("연봉: "+hong.getPay());
		
		//변경
		hong.setDept("영업부");
		hong.setJob("과장");
		hong.setPay(4200);
		
		System.out.println("=====홍길동 사원 정보======");
		System.out.println("사번: "+hong.getSabun());
		System.out.println("이름: "+hong.getName());
		System.out.println("부서: "+hong.getDept());
		System.out.println("직위: "+hong.getJob());
		System.out.println("입사일: "+hong.getRegdate());
		System.out.println("연봉: "+hong.getPay());
	}

}
