package com.sist.main;
import java.util.*;
public class 컬렉션_4_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		for(int i:list)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n");
		Vector<Integer> vec=new Vector<Integer>();
		vec.add(1);
		vec.add(2);
		vec.add(3);
		vec.add(4);
		vec.add(5);

		for(int i:vec) 
		{
			System.out.print(i+" ");
		}
		System.out.println("\n");
		
		LinkedList<Integer> lin=new LinkedList<Integer>();
		lin.add(1);
		lin.add(2);
		lin.add(3);
		lin.add(4);
		lin.add(5);

		for(int i:lin) 
		{
			System.out.print(i+" ");
		}
		
	}

}
