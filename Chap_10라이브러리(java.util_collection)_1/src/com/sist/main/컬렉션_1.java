package com.sist.main;
/*
 * 	335페이지
 * 		자바 컬렉션
 * 		--------
 * 		1. 프로그램 => 데이터관리(효율적)
 * 					-------------
 * 					1) 스프링/JSP(MVC)=> 데이터관리
 * 						=> 데이터베이스 (오라클)
 * 					2) 
 */
import java.util.*;
public class 컬렉션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("홍길동");
		list.add("심청이");
		list.add("강감찬");
		list.add("박문수");
		list.add("춘향이");
		System.out.println("현재 등록된 인원: "+list.size());
		
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(i+"."+name);
		}
		
		System.out.println("========원하는 위치에 데이터 추가");
		list.add(2,"이순신");
		
		System.out.println("현재 등록된 인원: "+list.size());
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(i+"."+name);
		}
		System.out.println("===========삭제");
		list.remove(3);
		
		System.out.println("현재 등록된 인원: "+list.size());
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(i+"."+name);
		}
		
		System.out.println("==============수정");
		list.set(2, "심청이 수정");
		
		System.out.println("현재 등록된 인원: "+list.size());
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(i+"."+name);
		}

		System.out.println("===============전체삭제");
		list.clear();
		System.out.println("현재 등록된 인원: "+list.size());
		
		System.out.println("==========데이터 존재여부");
		if(list.isEmpty())
		{
			System.out.println("저장공간이 비어있다");
		}
		else
		{
			System.out.println("저장공간에 데이터 존재");
		}
		
	}

}
