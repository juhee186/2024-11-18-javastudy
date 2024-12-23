package com.sist.main;
import java.util.*;
public class 컬렉션_5_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> names= new  ArrayList<String>();
//		
//		names=new LinkedList<String>();
//		
//		names=new Vector<String>();
		
		// 인터페이스 => mybatis / jpa => 리턴형 => list
		// 데이터를 모아서 순차적으로 접근 => 크롤링
		List<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("Oracle");
		list.add("HTML");
		list.add("Javascript");
		list.add("Jsp");
		list.add("Spring");
		list.add("Python");
		list.add("Search");
		list.add("Aws");
		
		for(String sub:list)
		{
			System.out.println(sub);
		}
		
		for(String sub:list)
		{
			System.out.println(sub);
		}
		
		System.out.println("===============");
		
		// 데이터 순차 출력
//		Iterator<String>iter=list.iterator(); =>set/map
//		while(iter.hasNext())
//		{
//			System.out.println(iter.next());
//		}
		ListIterator<String> iter=list.listIterator();
		while(iter.hasNext()) //위=>아래
		{
			System.out.println(iter.next());
		}
		System.out.println("=======================");
		while(iter.hasPrevious()) //아래=>위
		{
			System.out.println(iter.previous());
		}
		// next() 종료 후 2번 읽지못한다
//		while(iter.hasNext())
//		{
//			System.out.println(iter.next());
//		}
		
	}

}
