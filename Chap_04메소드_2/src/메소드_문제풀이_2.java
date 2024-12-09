import java.util.Calendar;
import java.util.Scanner;
public class 메소드_문제풀이_2 {
	//9. 년도를 입력받아서   윤년인지 여부를 확인하는 메소드를 구현하시오
	//	 --------매개변수 -------------boolean
	// 사용빈도가 많을 수 있다 => 예약 / 개인일정  =>> 재사용**
	static boolean isyear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=0) || (year%400==0))
			bCheck=true;
		return bCheck;
	}

	
	// 10. 두수를 입력받아 큰 수를 출력하는 메소드를 구현하시오
	static void print10 (int a, int b)
	{	
		System.out.println("큰 값:"+Math.max(a,b));
		//System.out.println(a>b?a:b); // 삼항연산자
	}
	
	
	// 11. 입력 받은 값이 짝수인지 홀수인지 판별하는 메소드를 구현하시오
	static void print11(int a)
	{
		if(a%2==0)
			System.out.println(a+"은 짝수");
		else
			System.out.println(a+"은 홀수");
	}
	
	
	// 12. 3의 배수를 판별하는 메소드를 구현하시오
	static void print12(int a)
	{
		if(a%3==0)
			System.out.print(a+"은 3의 배수");
	}
	
	
	// 13. 년,월,일을 입력받아서 요일을 구하는 메소드를 구현하시오
	static char print13(int year, int mon, int day)
	{
		char c=' ';
		char [] strweek= {'일','월','화','수','목','금','토'};
		//1. 1년도 1월1일부터 시작 ~전년도까지의 총 날수
		//2. 전달까지의 총 날수
		//3. 입력된 일
		//4. 전체 총합 %7= 요일
		int total=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400; //1.
		int[] last= {31,28,31,30,31,30,31,31,30,31,30,31}; //2.
		if(isyear(year)) //3.
		{
			last[1]=29;
		}
		else
		{
			last[1]=28;
		}
		for(int i=0;i<mon-1;i++)
			
		{
			total+=last[i];
		}
		total+=day;
		int week=total%7; //4.
	
//	Calendar cal=Calendar.getInstance();
//	cal.set(Calendar.YEAR,year);
//	cal.set(Calendar.MONTH,mon-1);
//	cal.set(Calendar.DATE,day);
//	int week=cal.get(Calendar.DAY_OF_WEEK);
		return strweek[week];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
//		System.out.print("년도 입력 : ");
//		int year=scan.nextInt();
//		
//		boolean bCheck=isyear(year);
//		if(bCheck==true)
//			System.out.println(year+"년도는 윤년입니다.");
//		else
//			System.out.println(year+"년도는 윤년이 아닙니다");
		
	//	System.out.print("두개의 정수 입력(10 20): ");
	//	int a=scan.nextInt();
	//	int b=scan.nextInt();
	//	print10(a,b);
	//	print11(a);
		System.out.print("년 월 일 입력(2024 11 20) :");
		int year=scan.nextInt();
		int mon=scan.nextInt();
		int day=scan.nextInt();
		
		char c=print13(year,mon,day);
		System.out.println("===================");
		System.out.println(year+"년도"+mon+"월"+day+"일은"+c+"요일입니다");

	}

}
