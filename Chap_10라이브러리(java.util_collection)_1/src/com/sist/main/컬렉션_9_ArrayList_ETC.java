package com.sist.main;
import java.util.*;

import javax.print.attribute.HashAttributeSet;
public class 컬렉션_9_ArrayList_ETC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"홍길동","박문수","이순신","강감찬","김두한","홍길동","박문수","이순신"};
		
		List<String> list=Arrays.asList(names);
		//배열 => list 변경
		for(String name:list)
		{
			System.out.println(name);
		}
		Set<String>set=new HashSet<String>();
		set.addAll(list);
		System.out.println("================");
		
		for(String name:set)
		{
			System.out.println(name);
		}
	}

}
