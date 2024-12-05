//메소드형 숫자야구게임
import java.util.Arrays;
import java.util.Scanner;
public class 메소드응용_1변경 {
	//중복없는 난수발생 (3개정수)
	static int[] rand()
	{
		int[] com=new int[3];
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++)
			{	
				if(com[i]==com[j])
				{
				i--; 
				break;
				}
			}
		}
		
		
		
		return com;
	}
	// 사용자입력 => 유효성 검사
	static int[] userinput()
	{
		int [] user=new int[3];
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("세자리 정수 입력 >> ");
			int input=scan.nextInt();
			if(input<100 || input>999) 
			{
				System.out.println("세 자리 정수만 입력하세요");
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			if(user[0]==user[1] || user[1]==user[2] || user[2]==user[0])
			{
				System.out.println("중복된 숫자는 사용할 수 없습니다.");
				
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 사용할 수 없습니다.");
				continue;
			}
			break;
		}
		return user;
	}
	//비교
	static int compare(int[]com, int[]user )
	{
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
		hint(s,b,user);
		return s;
	}
	// 힌트제공
	static void hint(int s,int b, int[]user)
	{
		System.out.println("input number :"+user[0]+" "+user[1]+" "+user[2]);
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
	}
	// 종료여부
	static boolean isEnd(int s)
	{
		boolean bCheck=false;
		if(s==3)
		{
			bCheck=true;
		}
		return bCheck;
	}
	// 전체조립 => 새로운 게임여부
	static void process()

	{
		Scanner scan=new Scanner(System.in);
		int[] com=rand();
		//System.out.println(Arrays.toString(com));
		int[] user=new int[3];
		while(true)
		{
			user=userinput();
			
			int s=compare(com,user);
			if(isEnd(s))
			{
				//System.out.println("게임끝");
				//break;
				System.out.print("새게임을 할까요?(Y/N) : ");
				char c=scan.next().charAt(0);
				if(c=='Y' || c=='y')
				{
					System.out.println("★★★★★ 새게임 시작★★★★★");
					process(); // 재귀호출
				}
				else
				{
					System.out.println("게임끝!");
					break;
				}
			}
		}
		//System.out.println(Arrays.toString(user));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
