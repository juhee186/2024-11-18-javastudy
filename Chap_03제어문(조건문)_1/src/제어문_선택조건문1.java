/*
 *  선택조건문
 *    = 조건  true 처리
 *    = 조건  false 처리
 *    -----------------  나눠서 작업
 *    예) 로그인이 된 경우 / 안 된 경우
 *    
 *    형식 (56페이지)
 *    if(조건문)
 *     >>> 무조건 수행( 둘 중에 한 개의 문장 수행)
 *    {
 *       조건이 참일때 처리   >>> 종료
 *    }
 *    else
 *    {
 *       조건이 거짓일때 처리  >>> 종료
 *    }
 *    
 *    점수입력  >>   
 *    60이상이면 합격  / 불합격
 *    if(sco>=60)
 *    if(sco<60) --> else
 */

import java.util.Scanner;
public class 제어문_선택조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		System.out.println("점수입력:");
		int sco=scan.nextInt();
		if(sco>=60)
			System.out.println(sco+" 점은 합격입니다.");
		else
			System.out.println(sco+" 점은 불합격입니다.");
			*/
		
		char c='A';
		int type=(int)(Math.random()*2);  //0,1
		if(type==0)
		{
			c=(char)((Math.random()*26)+65);  //대문자
		}
		if(type==1)
		{
			c=(char)((Math.random()*26)+97);  //소문자
		}
		System.out.println("c="+c);
		
		System.out.println("== 결과 ==");
		if(c>='A' && c<='Z') // true 일 때 수행
			System.out.println(c+"은 대문자");
		//if(c>='a' && c<='z')
		else // false 일 때 수행
			System.out.println(c+"은 소문자");
		
		
		
	}

}
