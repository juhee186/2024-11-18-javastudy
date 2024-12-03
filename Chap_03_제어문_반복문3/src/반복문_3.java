/*
 *   가위 바위 보 게임을 10번 수행 > 5승1무4패
 *   
 */
import java.util.Scanner;

public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int win=0, same=0,lose=0;
		
		int i=1;
		Scanner scan=new Scanner(System.in);
		// new 사용시마다 메모리저장(할당) >> 반복문에 사용하면 안된다
		// 클래스는 반복문 밖에서 주로 사용
		while(i<=10)
			{
			System.out.println("======="+i+"번째 게임=====");
			// 컴퓨터 난수 발생 (가위 바위 보)
			int com=(int)(Math.random()*3); // 0,1,2
			// 사용자 
			System.out.print("가위(0),바위(1),보(2):");
			int user=scan.nextInt();
			
			if(user<0 || user>2)
			{
				System.out.println("잘못된 입력");
				//처음부터 다시 시작
				continue; // 조건식으로 이동 
				//break 종료 > 단 for이면 증가식으로 이동
			}
			System.out.print("컴퓨터:");
			if(com==0)
				System.out.println("가위");
			else if(com==1)
				System.out.println("바위");
			else if(com==2)
				System.out.println("보");
			//사용자
			System.out.print("사용자:");
			switch(user)
			{
			case 0:
				System.out.println("가위");
				break;
			case 1:
				System.out.println("바위");
				break;
			case 2:
				System.out.println("보");
				break;
			}
			// for == while , 다중조건 == switch~case
			// 누가 이겼는지
			int res=com-user;
			//사용자 승  >>  -1 , 2
			if(res==-1 || res==2)
			{
				win++;
				System.out.println("사용자 승");
			}
			//컴퓨터 승  >>   1 ,-2
			else if(res==1 || res==-2) 
			{
				lose++;
				System.out.println("컴퓨터 승");
			}
			//비기는 경우 >>   0
			else if(res==0)
			{
				same++;
				System.out.println("비겼다");
			}
			System.out.print("게임종료?(y/n):");
			char c=scan.next().charAt(0);
			if(c=='y')
			{
				System.out.println("게임종료");
				break;
			}
					i++;
			}
		
			System.out.println("=========최종==========");
			System.out.printf("%d승 %d무 %d패\n",win,same,lose);
		
		
		
		

	}

}
