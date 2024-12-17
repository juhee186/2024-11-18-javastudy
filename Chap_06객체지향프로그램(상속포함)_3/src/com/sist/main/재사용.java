package com.sist.main;
/*	
 * 		논리적 관계
 *  	1. 상속 : is-a
 *  		동물 ani= new 개() => 개는 동물이다
 *  
 *  		동물
 *  		 |
 *  	-----------
 *  	|    |    |
 *  	개	 소	  말 : 하위클래스/ 위로 올라갈수록 is-a관계 성립
 *  
 *  	2. 포함 : has-a : 클래스 안에 클래스를 포함하고있다
 *  	---------------------------------------------클래스 크기
 *  	객체 전체가 4바이트를 가지고 있다
 *  	=> 형변환
 *  	  ------
 *  		자동 형변환 (묵시적 형변환) 
 *  		상위클래스 객체= new 하위클래스()
 *  		double d=10   => 10.0으로 변경
 *  		강제 형변환
 *  		int a=(int)10.5
 *  		하위클래스 객체= (하위클래스)new 상위클래스()  ===>오류
 *  					 -------추가
 *  		=> 라이브러리는 클래스를 리턴할 경우
 *  		  ------------------------
 *  				| Object / 매개변수가  Object
 *  				| collection
 */
import java.util.*;
class Sawon
{
	String name;
	String dept;
	String loc;
	
	public void display()
	{
		System.out.println(name);
		System.out.println(dept);
		System.out.println(loc);
	}
}
public class 재사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Sawon> list=new ArrayList<Sawon>();
		Sawon s1=new Sawon();
		s1.name="홍길동";
		s1.dept="개발부";
		s1.loc="서울";
		list.add(s1);
		Sawon s=(Sawon)list.get(0);
		s.display();
		
		
	}

}
