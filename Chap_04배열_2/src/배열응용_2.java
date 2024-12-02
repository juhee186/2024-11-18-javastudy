// 달력
/*
 *  1. 사용자 정의
 *  	=> 달력 : 1일자의 요일 확인
 *  				  --------
 *  	=> 1년도 1월1일 => 월요일
 *  	1) 1/1/1 ~ 2023/12/31 >총 날수
 *  	2) 23/11/30 => 총 날수 계산
 *  	3)----------------------- +1
 *  	1)+2)+3) /7 ==> 요일을 구한다
 *  	0~6 => 0일 => 6=>토
 *  	=> 예약 / 일정관리
 *  2. 라이브러리 이용 calendar
 */
import java.util.Scanner;
public class 배열응용_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력받기 > year / month / day => 요일
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year=scan.nextInt();
		
		System.out.print("월 입력 : ");
		int mon=scan.nextInt();
		
	//	System.out.print("일 입력 : ");
	//	int day=scan.nextInt();
		
		//전년도까지 날수
		int tot=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400; //윤년처리
		//전달까지 날수
		//모든 언어에서 사용되는 윤년계산 
		int[]last= {31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0 && year%100!=0) || (year%400==0))
			last[1]=29;
		else
			last[1]=28;
		
		for(int i=0;i<mon-1;i++)
		{
			tot+=last[i];
		}
		//입력한 날짜+
	//	tot+=day;
		tot++;
		//요일
		// 스위치 대신
		char[]str= {'일','월','화','수','목','금','토'};
		int week=tot%7;
		System.out.println(year+"년도 "+mon+"월 ");
		System.out.println(); // 줄바꿈
		for(char c:str)
		{
			System.out.print(c+"\t");
		}
		System.out.println();
		for(int i=1;i<=last[mon-1];i++)
		{
			if(i==1) //for문 시작 
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i); //출력
			week++; // 요일변경
			if(week>6) //일요일이라면
			{
				week=0;
				System.out.println(); // 다음줄에 출력
			}
		}
		
		
		

	}

}
