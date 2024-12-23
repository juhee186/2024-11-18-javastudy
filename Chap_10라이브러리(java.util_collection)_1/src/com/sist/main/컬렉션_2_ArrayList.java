package com.sist.main;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
@EqualsAndHashCode
@Data
//@Getter
//@Setter
class sawon
{
	private int sabun;
	private String name;
	private String dept;
	
	public sawon(int sabun, String name, String dept) {
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
	}
	
	
}
public class 컬렉션_2_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sawon s1=new sawon(1, "홍길동", "개발부");
		sawon s2=new sawon(1, "홍길동", "개발부");
		
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
