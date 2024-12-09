import com.sist.data.*; //사용자 정의
import java.util.Scanner;
public class 문자열배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]fda=ArrayData.korEng;
		Scanner scan=new Scanner(System.in);
		System.out.print("과일명 입력 : ");
		String f=scan.next();
		for(String ff:fda)
		{
			if(ff.contains(f))
			{
				String change=ff.substring(ff.indexOf(":")+1);
				System.out.println(f+"는 영어는 "+change);
				break;
			
			}
		}
		
		
		
		
		
		
		
		
		
		

	}

}
