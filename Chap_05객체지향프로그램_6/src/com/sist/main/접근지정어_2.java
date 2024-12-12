package com.sist.main;
// 메소드 => public : 다른 클래서에서 기능 사용을 위해
// 특별한 경우가 아니면 인스턴스로 만들어진다
// --------반복이 많은 경우 : static
// 웹 => 모든 메소드 적용 => 한글변환
// footer에 데이터 전송
/*
 * 	다른 클래스에서 메소드 호출시
 * 	1. 객체 생성
 * 	   ------
 * 		클래스명 객체명=new 생성자();
 * 		-----		   --------
 * 	2. 메소드 호출
 * 		객체명.메소드()
 * 			 ------public
 * 	3. 멤버변수 => 정보 은닉 => private
 * 				-------사용이 가능하게 메소드기능(읽기-쓰기)
 * 				읽기 : getter => getname()
 * 				쓰기 : setter => setname(string n)
 * 				데이터는 은닉화 => 메소드를 이용해서 접근하는 방식
 * 				--------------------------------------캡슐화
 * 					상속, 캡슐화, 다형성
 * 								|오버라이딩
 * 					--------------
 * 						  |가장많이 사용
 *	4. 생성자 / 클래스 => public
 */

class member
{
	String name;
	String id;
	String pwd;
	int age;
	
	member(String n, String i)
	{
		name=n;
		id=i;
	}
}
public class 접근지정어_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
