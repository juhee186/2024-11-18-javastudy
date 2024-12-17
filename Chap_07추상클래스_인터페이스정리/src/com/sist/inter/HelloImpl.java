package com.sist.inter;
// 서비스를 구현
/*
 * 	사용자 요청 => controller  ==> service => serviceImpl
 * 
 * 	Main ==> Hello ==> HelloImpl
 */
public class HelloImpl implements Hello{

	
	public void seyHello(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+"님 환영합니다");
	}
	

}
