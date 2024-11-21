/*
 *  단일조건문 
 *  1) 형식
 *      if(조건문)
 *      {
 *        실행문장   : 조건문이 참일때 실행
 *                          거짓일 때 실행 x                      
 *      }
 *   
 *      
 *      
 *      
 */
// 정수 입력 => 짝수/홀수
import java.util.Scanner;

public class 자바제어문_단일조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sacn=new Scanner(System.in);
		System.out.println("정수입력:");
		int num=sacn.nextInt();
		// 명령문
		// 주의점 if() ;         > ;찍으면 안됨
		/*
		 * if(num%2==0); >>> (;) 찍으면 if종료됨 나중 프로그래밍시 잘 못 찍으면 찾기 힘듦
		{
			System.out.println(num+"는(은) 짝수입니다.");
		}
		 */
		/*if(num%2==0) // 짝수라면
		{
			System.out.println(num+"는(은) 짝수입니다.");
		}
		if(num%2==1) // 홀수라면
		{
			System.out.println(num+"는(은) 홀수입니다.");
		}
		*/
		
		if(num%3==0) 
		{
			System.out.println(num+"는 3의 배수입니다.");
		}
		if(num%3!=0) 
		{
			System.out.println(num+"는 3의 배수가 아닙니다.");
		}	
		
		
			
		}
			
				



}
