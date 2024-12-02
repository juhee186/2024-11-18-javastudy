/*
 * 중복없는 난수 => 3개발생(1~9)
 * =======================
 * 사용자입력
 * 3자리 입력 > 맞추는 프로그램 : 숫자야구
 * 힌트
 * 컴퓨 369
 * 유저 123 =>0s-1B 
 * 	 2 346 =>1s-1B	
 * ============>3S시 종료
 * 
 */
import java.util.Arrays;
import java.util.Scanner;
public class 배열_생성_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)컴퓨터가 중복없는 난수 3자리 발생
		int[] com=new int[3]; // new (자동초기화) > 0 0 0
		//2)사용자 입력
		int[] user=new int[3]; // new > 0 0 0
		//초기화
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--; //중복시 난수 재발생해라
					break;
				}
			}
		}
			System.out.println(Arrays.toString(com));
		//3)난수와 사용자 입력 비교
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("세자리 정수 입력: ");
			int input=scan.nextInt();
			
			if(input<100 || input>999)
			{
				System.out.println("잘못입력");
				continue; //처음부터 다시 시작
			}
			//세자리 정수 입력
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("중복된 수 사용 불가");
				continue; //처음부터
			}
			//문제 발생 ==> 0 제외
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 사용불가");
				continue;
			} //오류처리 > 조건문 역할 : 오류를 방지 > if 사용
			//4)힌트
			int s=0,b=0;
			for(int i=0;i<3;i++) //com
			{
				for(int j=0;j<3;j++) //user
				{
					if(com[i]==user[j]) //같은 수가 있다면
					{
						if(i==j)//같은 자리수
							s++;
						else //다른자리
							b++;
		
					}
				}
			}
			System.out.printf("number: %d,result:%dS-%dB\n",input,s,b);
			//5)종료여부   >s=3
			if(s==3)
			{
				System.out.println("게임끝");
				break;
			}
			//메소드 > 새로운 게임을 다시 시작
		}
		
		
		
		

		
		

	}

}
