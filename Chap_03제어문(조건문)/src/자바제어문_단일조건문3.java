/*
 *    알파벳 입력받아서
 *       > 대문자 or 소문자  or 알파벳이 아니냐
 *       
 *       대문자라면   if(대문자조건)
 *       소문자라면   if(소문자조건)
 *       알파벳이 아니라면  if(대문자, 소문자 아니라면)
 *       
 *        
 */
import java.util.Scanner;

public class 자바제어문_단일조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("문자입력:");
		char ch=scan.next().charAt(0);  // 0은 1번째 글자 / 1은 2번째 글자
		//System.out.println("ch="+ch);
		/*
		 *  기본 : 비교연산자
		 *        논리연산자  >> 부정연산자
		 *        
		 *        && : 어디~ 어디까지  > 사이에 있다면
		 *        || : 범위에 없는 경우 
		 *        
		 *        예) 0~100
		 *        a>=0 && a<=100
		 *        a<0 || a>100   > 다시 입력을 요청시 사용
		 *        
		 *        
		 */
		if(ch>='A' && ch<='Z') 
			System.out.println(ch+"는 대문자");
		if(ch>='a' && ch<='z') 
			System.out.println(ch+"는 소문자");
		if(!((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')))
		{
			System.out.println(ch+"는 알파벳이 아님");
		}
		

		
		
		
	}

}
