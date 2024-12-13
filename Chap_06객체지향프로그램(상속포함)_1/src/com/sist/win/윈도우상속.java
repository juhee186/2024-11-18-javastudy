package com.sist.win;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*; // 윈도우관련
/*
 * 	상속 => 기존의 클래스를 재사용 => 추가, 변경해서 사용
 * 		  ----------
 * 		 사용자 정의
 * 		 라이브러리 => 변경해서 사용하는 상속이 많다
 * 		 => 코드의 재사용이 높다 => 최적화 문제 발생
 * 			---------개발속도가 빠르다
 * 		 => 코드관리가 용이하다
 * 		 => 코드가 간결해진다 => 코드를 볼 수 없다(가독성이 떨어짐)
 * 		 => 기존의 클래스는 이미 검증된 상태 : 신뢰성이 높다
 * 	상속 : is-a => 변경후 사용
 *  포함 : has-a => 있는 그대로 사용(***)
 *  
 *  객체지향 => 권장(캡슐화, 재사용(상속), 변경-추가 쉽게)
 *  							  ----------
 *  							오버라이딩 오버로딩
 *  *** 상속의 문제점
 *  	= 결합성이 높다 : 다른 클래스에 영향을 많이 미친다
 *  	예) 상속받는 클래스 => 상속을 내리는 클래스(변경)
 *  	= 제약조건이 많다
 *  	= 메모리가 커진다 => 속도가 늦다
 *  	= 윈도우 사용하지 않는 이유 => 속도가 느리다
 *   특징)
 *   	1. 단일 상속만 가능
 *   	2. 상속기호 : extends : 클래스를 확장해서 사용
 *   			   -------
 *   	예) class A extends B
 *   		A클래스는 B클래스를 확장해서 새로운 클래스 제작한다
 *   		 => A클래스는 B클래스로부터 상속을 받는다
 *   	3. 상속 => 특별한 경우가 아니면 모든 변수,메소드 상속
 *   								------------
 *   			=> 특별한 경우(예외)
 *   				- static => 공유(여러개의 객체가 공동 사용)
 *   						 => 사용이 가능하게 만든다
 *   				- 생성자
 *   				- 초기화블럭
 *   				- private : 상속은 내려가지만 접근은 불가능
 *   				 --------> 사용하려면 getter/setter
 *   		상속 내리는 클래스 (super class , 상위 클래스, 부모클래스)
 *   		 => 상속 받는 클래스의 변수, 메소드에 접근이 불가능
 *   			------------
 *   			자신의 객체 => this
 *   			상위클래스의 객체 => super
 *   		class A
 *   		{
 *   			int a,b;
 *   		}
 *   		class B extends A
 *   		{
 *   			//a,b
 *   
 *   			public B()
 *   			{
 *   				this.a=10;
 *   				this.b=20; // 자신 클래스
 *   				super.a100; // 상속 내린 클래스
 *   				suprt.b=200;
 *   			}
 *   		}
 *   
 *   		두 개 받을 때
 *   		class A
 *   		class B extends A
 *   		class C	extends B
 *   
 *   		class A
 *   		class B extends A
 *   
 *   		메모리 할당
 *   		A a= new A()
 *   			=> A클래스가 가지고 있는 변수,메소드 사용
 *   		B b= new B()
 *   			=> B클래스가 가지고 있는 변수,메소드 사용
 *   		A c= new B()
 *   			=> 변수=>A클래스 / 메소드는=>B클래스가 가지고 있는 것 제어
 *   			-> 변수는 클래스타입
 *   			-> 메소드는 생성자타입
 */
//class A
//{
//	int a=10;
//	void display()
//	{
//		System.out.println("A클래스가 가지고 있는dis");
//	}
//}
//class B extends A
//{
//	int a=100;
//	void display()
//	{
//		System.out.println("B클래스가 가지고 있는dis");
//	}
//}
// 가장 큰 클래스는 상속 => 포함
public class 윈도우상속 extends JFrame{
	//윈도우 설정
	JButton b1=new JButton("north"); //포함클래스
	JButton b2=new JButton("east");
	JButton b3=new JButton("west");
	JButton b4=new JButton("center");
	JButton b5=new JButton("south");
	public 윈도우상속()
	{	//setLayout(new FlowLayout());
		setLayout(new GridLayout(1,5));
		add(b1);add(b2);add(b3);add(b4);add(b5);
	
//		add("north",b1); // 레이아웃
//		add("south",b5);
//		add("center",b4);
//		add("east",b2);
//		add("west",b3);
		setSize(640,400); // 크기결정
		setVisible(true); // 윈도우 보여줘
	}

	public static void main(String[] args) {
		new 윈도우상속();
		// TODO Auto-generated method stub
//		A aa= new A();
//		System.out.println(aa.a);
//		aa.display();
//		
//		B bb= new B();
//		System.out.println(bb.a);
//		bb.display();
//		
//		//클래스가 많은 경우 => 모아서 한 개의 이름으로 제어
//		// 상위클래스를 이용해서 접근 가능
//		A cc= new B();
//		System.out.println(cc.a); //변수는 A클래스
//		cc.display(); //메소드는 B클래스
//		//오버라이딩 => 가상함수

	}

}
