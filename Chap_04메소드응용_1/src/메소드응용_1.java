/*
 * 	숫자야구게임 => 절차적언어(main)
 * 			 => 메소드형식 변환
 * 			 => 객체지향 프로그램으로 변환
 *       |
 *  1.3개 정수 추출 = > 1~9 => 중복없는 정수
 *  2.사용자 입력
 *  3.난수 입력값 비교
 *  4.힌트 => 문자열 1S-2B ...
 *  	S: o 
 *  	B: oo
 *  5.종료 여부 확인
 *   
 */
import java.util.Arrays;
import java.util.Scanner;
public class 메소드응용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.중복없는 난수 발생 => 3개 정수 (1~9)
		int [] com=new int[3]; // 3개의 정수 저장 공간
		// 배열
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
		for(int j=0;j<i;j++)
		{	// 중복되었는지 검사
			if(com[i]==com[j])
			{
				i--; // 같은 정수가 있는 경우 다시 난수 발생
				break;
			}
			
		}
		}
	//	System.out.println(Arrays.toString(com));
		// 2. 사용자입력
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("세자리 정수 입력 >> ");
			int input=scan.nextInt();
			//오류처리
			if(input<100 || input>999) 
			{
				System.out.println("세 자리 정수만 입력하세요");
				// 처음으로 이동
				continue;
				/*
				 *  continue 사용시
				 *  for = > 증가식으로 이동
				 *  while => 조건식으로 이동
				 *  => 특정 부분을 제외 / 웹에서는 사용빈도 적음
				 */
			}
			//3자리 정수 잘라 배열에 저장
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			// 오류처리 => 중복되수가 없어야 한다, 0을 입력하면 안된다
			if(user[0]==user[1] || user[1]==user[2] || user[2]==user[0])
			{
				System.out.println("중복된 숫자는 사용할 수 없습니다.");
				//처음부터 다시
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 사용할 수 없습니다.");
				continue;
			}
			// 비교
			int s=0,b=0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
					{
						if(com[i]==user[j])// 같은 숫자가 있다면
						{
							if(i==j) // 같은 자리라면
								s++;
							else	// 다른 자리라면
								b++;
							
						}
					}
			}
			//힌트 제공
			System.out.println("input number :"+input);
			System.out.println("=======전광판=========");
			System.out.print("S:");
			for(int i=0;i<s;i++)
			{
				System.out.print("●");
			}
			System.out.println();
			System.out.print("B:");
			for(int i=0;i<b;i++)
			{
				System.out.print("○");
			}
			System.out.println();
			System.out.println("====================");
			//System.out.println("input number :"+input+",result:"+s+"S-"+b+"B");
			//System.out.printf("input number:%d, res:%dS-%dB");
			
			// 종료여부확인
			if(s==3)
			{
				System.out.println("게임끝!!");
				break; // 반복문 중단
			}
		}
		
		
		
		
		
		
		

	}

}
