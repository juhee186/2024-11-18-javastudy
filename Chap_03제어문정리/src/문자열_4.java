/*
 * 문자열 분리 / 자르기 / 변경 / 찾기
 * = charAt(int index)
 * hello java
 * 0123456789 : 문자열 번호
 * charAt(6) : 6번(J) 자르기
 * 
 * 
 */
// 사용자의 문자열 입력값을 받아 a A 몇개포함
import java.util.Scanner;
// 사용자의 문자열 입력값을 받아 좌우대칭인지 여부확인  = ABBA
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String data="hello java";
		System.out.println("첫번째 문자 :"+data.charAt(0));
		System.out.println("마지막 문자 :"+data.charAt(data.length()-1)); */
		
		Scanner scan= new Scanner(System.in);
		String da="";
		while(true)
		{
		System.out.print("문자 입력:");
		da=scan.nextLine();
		if(da.length()%2==0)
			break;
		else
			System.out.println("문자수가 짝수가 아닙니다.");
		}
		
	/*	int cou=0;
		for(int i=0;i<da.length();i++)
		{
			char ch=da.charAt(i);
			//System.out.println(ch);
			if(ch=='a' || ch=='A')
			cou++;
		}
		//지역변수는 > {} 변수 > {}이 종료되면 사라지는 변수
		System.out.println("a나 A의 갯수: "+cou); */
		
		
		boolean bCheck=true;
		int j=da.length()-1;
		for(int i=0;i<da.length()/2;i++)
		{
			char s=da.charAt(i);
			char e=da.charAt(j);
			//System.out.println("시작="+s+",끝="+e);
			if(s!=e)
			{
				bCheck=false;
				break;
			}
			j--;
			
		}
		System.out.println("===================");
		if(bCheck==true)
			System.out.println(da+" 좌우대칭");
		else
			System.out.println(da+" 좌우대칭 아니다");
		
		
		
		
		
		
		
		
		
	}

}
