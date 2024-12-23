package com.sist.main;
import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor


class Member
{
	private int mno;
	private String name;
	private String sex;
	private String add;
	private String phone;
}
public class 제네릭_Collection_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> list=
//				new ArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//		}

//		ArrayList<String> list=
//				new ArrayList<String>();
//		list.add("홍길동");
//		list.add("박문수");
//		list.add("심청이");
//		
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//		}
		
		ArrayList<Member> list=new ArrayList<Member>();
		list.add(new Member(1,"홍길동","남자","서울","010-1111-1111"));
		list.add(new Member(2,"심청이","여자","경기","010-1111-1112"));
		list.add(new Member(3,"박문수","남자","경기","010-1111-1113"));
		list.add(new Member(4,"이순신","남자","인천","010-1111-1114"));
		list.add(new Member(5,"강감찬","남자","서울","010-1111-1115"));
		
		System.out.println("회원인원: "+list.size());
		for(Member m:list)
		{
			System.out.println(m.getMno()+"."+m.getName());
		}
		
		System.out.println("서울에 사는 회원 목록");
		for(Member m:list)
		{
			if(m.getAdd().equals("서울"))
			{
				System.out.println(m.getName()+" "
						+m.getAdd());
			}
		}
		
		
	}

}
