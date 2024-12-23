package com.sist.lib;
/*
 *		객체복제
 *		= 같은 메모리 주소 사용 (같이 사용) => 얕은 복사
 *			A a=new A()
 *			A b=a ==> 주소 참조(call by Reference)
 *		= 다른 메모리 주소 사용 (따로 사용) => 깊은 복사
 *			A a=new A()
 *			A b=a.clone() ==> 새로운 메모리 생성
 */
class member implements Cloneable
{
	private int mno;
	private String name;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public member(int mno, String name) {
		super();
		this.mno = mno;
		this.name = name;
	}
	
	//메모리를 통째로 복사해서 새로운 메모리에 저장
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	//오버라이딩 => clone() =>재정의
	public void print()
	{
		System.out.println(mno);
		System.out.println(name);
	}
}
public class 라이브러리_Object_3 {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//얕은복사 => 두개의 객체를 한개 주소에서 처리
		member m1=new member(1,"홍길동");
//		m1.print();
//		member m2=m1;
//		m2.print();
//		m2.setMno(3);
//		m2.setName("박문수");
//		m2.print();
//		m1.print();
//		//객체가 가지고 있는 주소가 같으며 => 같은 메모리를 제어
//		System.out.println(m1);
//		System.out.println(m2);
		
		member m2=(member)m1.clone(); // 복제 => 게임(아바타)
		m2.print(); 
		System.out.println(m1);
		System.out.println(m2);
		m2.setMno(3);
		m2.setName("심청이");
		m2.print();
		m1.print();
		
	}


}
