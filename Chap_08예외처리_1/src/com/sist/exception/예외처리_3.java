package com.sist.exception;

public class 예외처리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문장1");
		System.out.println("문장2");
		System.out.println("문장3");
		try
		{
			System.out.println("문장4");
			System.out.println(10/0); //catch로 이동
			System.out.println("문장6"); //수행하지않음
		}catch(Exception e)
		{
			System.out.println("문장7"); 
		}
		System.out.println("문장8");
		System.out.println("문장9");
	}

}
