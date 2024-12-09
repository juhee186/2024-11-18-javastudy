/*
 *  3개의 정수를 받아서 평균, 총점을 전송하는 메소드
 *  1. 입력
 *  2. 처리 => 평균, 총점
 *  	=> 세분화
 *  3. 출력값
 *  
 *  => 객체지향 1) 메소드 2) 변수
 *  
 */
import java.util.Scanner;
public class 메소드_5 {
	//입력부분
	static int user(int a)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(a+"번째 정수 입력: ");
		int c=scan.nextInt();
		return c;
	}
	//요청처리1
	static int tot(int a, int b, int c)
	{
		return a+b+c;
	}
	//요청처리2
	static double div(int tot)
	{
		return tot/3.0;
	}
	//출력
	static void print(int tot,double avg)
	{
		System.out.println("평균: "+avg);
		System.out.println("총점: "+tot);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3개 정수 받기
//		Scanner scan=new Scanner(System.in);
//		System.out.print("첫 번째 정수 입력: ");
//		int a=scan.nextInt();
//		
//		System.out.print("두 번째 정수 입력: ");
//		int b=scan.nextInt();
//		
//		System.out.print("세 번째 정수 입력: ");
//		int c=scan.nextInt();
//		
//		//평균
//		double avg=(a+b+c)/3.0;
//		//총점
//		int sum=a+b+c;
//		//출력
//		System.out.println("평균: "+avg);
//		
//		System.out.println("총점: "+sum);
		int a=user(1);
		int b=user(2);
		int c=user(3);
		
		int tot=tot(a,b,c);
		double avg=div(tot);
		
		print(tot,avg);
		
	}

}
