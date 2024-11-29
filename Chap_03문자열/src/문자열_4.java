/*
 *   변수
 *   연산
 *   제어문
 *   문자열
 *   ------------기초
 *   --------------------
 *   데이터 수집-저장 : 배열
 *   명령문 수집-처리 : 메소드 -> 재사용
 *   -------------------- 모아 처리 : 클래스
 *   					 -------- 여러개 모아 처리 : 패키지
 *   => 프로그램 비정상종료 없이 : 예외처리 : 8장
 *   --------------------------------------------------
 *   9장~ 라이브러리 + 사용자 정의 = 조립
 */
import java.util.Scanner;
//toString() : 객체의 주소 > 오버라이딩
/*
 * length
 * substring
 * equals
 * contains
 * indexOf/lastindexOf
 * valueOf
 * trim
 * ----------------------
 * replace
 * ----------------------
 * split
 */
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1=(int)(Math.random()*100)+1;
		int a2=(int)(Math.random()*100)+1;
		int a3=(int)(Math.random()*100)+1;
		int a4=(int)(Math.random()*100)+1;
		int a5=(int)(Math.random()*100)+1;
		int a6=(int)(Math.random()*100)+1;
		int a7=(int)(Math.random()*100)+1;
		int a8=(int)(Math.random()*100)+1;
		int a9=(int)(Math.random()*100)+1;
		int a10=(int)(Math.random()*100)+1;
		
		int[] arr=new int[10]; // 위의 10문장과 동일
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("문자열 입력: ");
		String aa=scan.next();
		System.out.println(new StringBuilder(aa).reverse());
		for(int i=aa.length()-1;i>=0;i--)
		{
			System.out.print(aa.charAt(i));
		}
		
/*		System.out.println("변경전: "+aa);
		String ch="";
		for(int i=0;i<aa.length();i++)
		{
			char c=aa.charAt(i);
			if(c>='A' && c<='Z')
			{
				//ch+=(char)(c+32);
				ch+=Character.ToLowerCase(c);
			}
			else if(c>='a' && c<='z')
			{
				//ch+=(char)(c-32);
				ch+=Character.ToUpperCase(c);
			}
		}
		System.out.println("변경후 : "+ch); */
		
		
		
		
		
	}

}
