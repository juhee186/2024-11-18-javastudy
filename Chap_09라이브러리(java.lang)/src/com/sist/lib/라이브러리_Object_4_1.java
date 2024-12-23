package com.sist.lib;
class sawon2
{
	private int sabun;
	private String name;
	
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//초기화
	public sawon2(int sabun,String n)
	{
		this.sabun=sabun;
		name=n;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		sawon2 s=(sawon2)obj; //클래스 형변환
		return name.equals(s.name) && sabun==s.sabun;
		//		s1			 s2			s1		s2
	}
	// equals => 객체주소 / 멤버변수
	
}
public class 라이브러리_Object_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sawon2 s1=new sawon2(1, "홍길동");
		sawon2 s2=new sawon2(1, "홍길동");
		// equals : 재정의하지않으면 주소비교 / 재정의하면 멤버변수 비교
		if(s1.equals(s2))
		{
			System.out.println("같은 사원");
		}
		else	
		{
			System.out.println("다른 사원");
		}

	}

}
