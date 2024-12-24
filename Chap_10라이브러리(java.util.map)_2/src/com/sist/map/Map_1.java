package com.sist.map;
/*
 *  => 중복데이터 => 목록 =>arrayList
 *  	웹에서 검색데이터 / 전체목록
 *  	--------------------> 데이터를 모아서 브라우저
 *  => 중복데이터를 만든다 => HashSet
 *     ------------------------->웹채팅
 *  => 두개를 동시 저장 (Key,Value) => HashMap
 *     ----------------------------------> 방문한 맛집/ 장바구니/ 아이디저장
 *  
 *  
 * 	Map (인터페이스 => 349페이지)
 * ----
 * 					Map
 * 				   ----
 * 					 |
 * 			-----------------
 * 			|				|
 * 		HashMap			HsahTable
 * 		 비동기: 동시저장	   동기: 한 개 저장후 다른데이터 저장
 * 		  빠르다				느리다/안정성확보
 * 		웹:AJAX/VUE/React
 * 
 * 		특징)
 * 		두개 동시 저장
 * 		Key / Value
 * 		=> Key  중복 불가
 * 		=> Value 중복 가능
 * 		=> 예) ("id","admin")
 */	
import java.util.*;
public class Map_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data= {"사과","배","수박","귤",
				"참외","메론","바나나"};
		Map<String,Integer> cart=
				new HashMap<String, Integer>();
		
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("=====과일목록======");
			System.out.println("1.사과");
			System.out.println("2.배");
			System.out.println("3.수박");
			System.out.println("4.귤");
			System.out.println("5.참외");
			System.out.println("6.메론");
			System.out.println("7.바나나");
			System.out.println("9.종료");
			System.out.println("=================");
			System.out.print("과일 선택: ");
			int f=scan.nextInt();
			if(f==9)
			{
				break;
			}
			cart.put("f_"+f,f); //데이터 추가
			//		------중복 안되게
		}
		if(cart.isEmpty()) //데이터 존재여부
		{
			System.out.println("장바구니에 과일이 없습니다");
		}
		else
		{
			System.out.println("과일 구매 총 "+cart.size()+"건");
			for(String key:cart.keySet()) //데이터 읽어오기
			{
				int value=cart.get(key);
				System.out.println(data[value-1]);
			}
		}

	}

}
