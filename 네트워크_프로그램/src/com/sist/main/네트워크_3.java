package com.sist.main;
/*
 * 	네트워크 서버
 * -----------
 * 	1. 접속을 받는 클래스 : 접속처리(대기소켓)
 * 	2. 통신을 담당하는 클래스 : 각 클라이언트 따로 통신
 * 	   -----------------------------------
 * 		| 쓰레드 이용
 * 		  -------- 접속을 받는 클래스의 모든 데이터 공유
 * 	class server
 * {
 * 		// 사용자 정보 => ip/port
 * 		class client extends thread
 * 		{
 * 			ip/port를 이용해서 통신
 * 		}
 * 	}
 * 
 */
public class 네트워크_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
