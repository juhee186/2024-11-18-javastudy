package com.sist.main;
/*
 *  변경 (수정)
 *  --------오버라이딩
 *  => 변수 오버라이딩
 *  => 메소드 오버라이딩
 */
/*
 * 	Sub sub=new Sub();
 * 
 * --sub----
 * 
 * ---------	----------------
 * 				----super-------
 * 					name, age
 * 				----------------
 * 				----this-------
 * 					name, age
 * 				----------------
 * 				-----------------
 * 	메소드 오버라이딩 => 기능을 변경해서
 */
class Super //상속을 내리는 클래스
{
	String name;
	int age;
	
	public Super()
	{
		name="홍길동";
		age=25;		
	}
}
//202페이지
class Sub extends Super// 상속 받는 클래스
{
	/*
	 * String name;
	 * int age;
	 */
	String name; //변수 오버라이딩
	int age;
	
	public Sub()
	{
		name="심청이";
		age=27;
	}
	public void display()
	{
		System.out.println("Super:name= "+super.name); //상속내린 클래스의 변수,메소드 갖고오기
		System.out.println("Super:age= "+super.age);
		
		System.out.println("Sub:name= "+this.name);
		System.out.println("Sub:age= "+this.age);
	}
}

public class 상속_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub=new Sub();
		sub.display();

	}

}
