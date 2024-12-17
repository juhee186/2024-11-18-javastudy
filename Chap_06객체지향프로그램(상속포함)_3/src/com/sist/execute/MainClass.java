package com.sist.execute;
import java.util.Scanner;
public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("A(1),B(2),C(3),D(4) : ");
		int sel=scan.nextInt();
		// Object[] obj={"",'',10.0}
		I[] i= {null,new A(),new B(),new C(),new D()};
		// i = new a() , i= new B()...
		i[sel].execute();
		// 데이터혼합 =>  Object : 모든 데이터형을 받을 수 있다
//		if(sel==1)
//		{
//			 A a=new A();
//			 a.execute();
//		}
//		else if(sel==2)
//		{
//			 B b=new B();
//			 b.execute();
//		}
//		else if(sel==3)
//		{
//			 C c=new C();
//			 c.execute();
//		}
//		else if(sel==4)
//		{
//			 D d=new D();
//			 d.execute();
//		}
		
		
		
	}
	
}