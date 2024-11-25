/*
 *  10개의 알파벳을 추출 
 *  사용자가 입력 > 몇 번째 위치하고 있는지 확인
 *  A C D F Z H O P Q K
 *  
 *  사용자가 D 입력 > 3번째 위치하고있다 > index 구하는 방법
 *               > 크롤링 (웹에서 데이터 수집)
 *  A~Z 사이 입력 > 몇 번째 위치하고 있다             
 */
import java.util.Scanner;

public class 반복문_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 입력(대문자):");
		char c=scan.next().charAt(0);
		// Scanner는 char 를 가지고 오는 것은 없다
		//  >> 문자열  >> 첫 번째 문자 추출  >>charAt(0)
		System.out.println("c="+c);
		
		//확인
		//System.out.println("몇 번째:"+(c-64));
		int index=1;
		for(char ch='A';ch<='Z';ch++)
		{
			if(ch==c)
				break;   // 반복문을 중단
			index++;
		}
		System.out.println(c+"는"+index+"번째 위치하고있다");
		
		
		
		
		
	}

}
