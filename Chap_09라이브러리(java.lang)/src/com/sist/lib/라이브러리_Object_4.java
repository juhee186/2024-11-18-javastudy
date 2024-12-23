package com.sist.lib;
/*
 *  equals() => Object에서 객체 비교
 *  			String => equals() 문자열 비교 => 오버라이딩
 */
class human
{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public human(String n)
	{
		name=n;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof human)
		{
			human s=(human)obj;
			return name==s.name;
		}
		else
			return false;
	}
	
	
}
public class 라이브러리_Object_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		human h1=new human("홍길동");
		human h2=new human("홍길동");
		//human h2=h1;
		if(h1.equals(h2))
		{
			System.out.println("같다");
		}
		else
		{
			System.out.println("같지않다");
		}

	}

}
