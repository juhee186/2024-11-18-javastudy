package com.sist.main;
// 제네릭 => collection 전체 사용 가능
// List / Set / Map
/*
 * 	List<String> => ArrayList (Vector , LinkedList)
 * 	Set<String> => HashSet(중복제거) / TreeSet(검색)
 * 		=>add()
 * 		=>addAll() :다른 collection 데이터 첨부
 * 		=>clear()
 * 		=>isEmpty()
 * 		=>size()
 * 		=>iterator()
 * 	Map<String,String> => HashMap / HashTable
 * 						 -------	---------
 * 							비동기		동기	
 * 							  |			 |
 * 							 속도			안전성=>데들락
 */
import java.util.*;

public class 컬렉션_8_Set_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set=new TreeSet<Integer>();
		Random r=new Random();
		for(int i=0;i<10;i++)
		{
			set.add(r.nextInt(101)); //0~100
		}
		//출력
		for(int score:set)
		{
			System.out.print(score+" ");
		}
		System.out.println();
		System.out.println("=======60점이하=======");
		System.out.println(set.headSet(60));
		System.out.println("=======60점이상=======");
		System.out.println(set.tailSet(60));
		
	}

}
