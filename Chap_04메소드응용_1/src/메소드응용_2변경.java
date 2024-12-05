import java.util.Scanner;

public class 메소드응용_2변경 {
	static int input(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+"입력 : ");
		int year=scan.nextInt();
		return year;
	}
	
	static int getweek(int year,int mon)
	{
		int total=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
		//2. 전달까지 총 날수
		int[]last= {31,28,31,30,31,30,
				 31,31,30,31,30,31};
		//윤년조건
		if((year%4==0 && year%100!=0) || (year%400==0))
			last[1]=29;
		else
			last[1]=28;
		for(int i=0;i<mon-1;i++)
		{
			total+=last[i];
		}
		//3. +1
		total++;
		//요일구하기
		int week=total%7; //0(일)~6(토)
		return week;
	}
	
	static void print(int year, int mon, int week)
	{	String[] strweek= {"일","월","화","수","목","금","토"};
		int[]last= {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println(year+"년도 "+mon+"월 ");
		
		for(int i=0;i<strweek.length;i++)
		{
			if(i==0)
				System.err.print(strweek[i]+"\t"); //err은 빨간색으로 출력
			else
				System.out.print(strweek[i]+"\t");
		}
		
		System.out.println();
		for(int i=1;i<=last[mon-1];i++)
		{
			if(i==1)
			{
				//해당 요일까지 공백
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			//if(week==0)
				System.out.printf("%2d\t",i);
		//	else
			//	System.out.printf("%2d\t",i);
			
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
		
	}
	static void process()
	{
		int year=input("년도");
		int mon=input("월");
		
		int week=getweek(year,mon);
		print(year,mon,week);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 process();
	}

}
