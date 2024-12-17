package com.sist.exception;
import java.util.Scanner;
/*
 * 	UnCheck
 *  --------
 *  Throwable
 *  	|
 * 	Exception : 예외처리의 모든 것을 잡을 수 있다
 * 		|
 * RunTimeException => 밑의 에러들을 잡을 수 있다
 * 		|
 * -----------------------
 * |
 * ArrayIndexOutOfBoundsException => 배열범위 초과
 * ArithmeticException => 0으로 나누는 경우
 * NumberFormatException => 정수변환
 * ClassCastException => 형변환
 * ...
 * ...
 * int a,b=0; // {} 밖에서 날려야 계속 사용가능
 * try
 * {
 * 	int a=10;
 * }
 * catch(exception e)
 * {
 * 	int b=20;
 * }
 * 
 * a,b => 사라진다 ( {} 안에서만 사용가능)
 */
public class 예외처리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int []arr=new int[2]; //배열범위 초과 ,0
		try
		{
			System.out.print("첫 번째 정수 입력 : ");
			String s1=scan.next();
			
			System.out.print("두 번째 정수 입력 : ");
			String s2=scan.next();
			
			arr[0]=Integer.parseInt(s1);
			arr[1]=Integer.parseInt(s2);
			
			int result=arr[0]/arr[1];
			System.out.println(result);
		}
//		catch(RuntimeException e)
//		{
//			System.out.println("에러발생");
//		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			//System.out.println(ex.getMessage()); 상황에 맞게 에러메시지 날림
			ex.printStackTrace(); // 에러발생시 위치를 찾아줌 ===>권장
		}catch(ArithmeticException ex)
		{
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
		}catch(NumberFormatException ex)
		{
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.println("정상수행");
		// 정상수행 => catch는 수행하지 않는다
		// try 안에서 오류발생시 catch 수행
		
		
	}

}
