/*
 *  선택문 / 반복문
 *   선택문
 *   switch(정수, 문자, 문자열)
 *   {
 *   case 값 :  정수 1 2 , 문자 > '+' , 문자열 > ""
 *   실행문장
 *   break;  >> 종료
 *   case 값 : ...순서가 없다, 중복값은 사용할 수 없다
 *   default : 생략가능, 필요시 사용
 *   }
 *   ** 실행하면 자동으로 case~ break가 있는 곳까지 출력
 *   int no=3;
 *   switch(no)
 *   { case 1 : 문장1
 *     case 2 : 문장2
 *     case 3 : 문장3  >>>>> 시작위치
 *     case 4 : 문장4
 *     break;         >>>>> 종료위치
 *     default 5 : 문장5
 *     }
 *      >>>> 다중조건문을 간결하게 표현
 *      >>>> 범위 지정이 많다 -< 다중조건문
*/
import java.util.Scanner;
public class 반복문_문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner scan=new Scanner(System.in);
		System.out.print("정수입력 : ");
		int score=scan.nextInt();
		int avg=score/10;
		switch(avg) // = switch(score/10)
		{
		case 10 : case 9:
			System.out.println("A등급");
			break;
		case 8 :
			System.out.println("B등급");
			break;
		case 7 :
			System.out.println("C등급");
			break;
		case 6 :
			System.out.println("D등급");
			break;
		default :
			System.out.println("F등급");
		} */
		
		
	/*	 Scanner scan=new Scanner(System.in);
		System.out.print("정수입력 :");
		int num1=scan.nextInt();
		System.out.print("정수입력 :");
		int num2=scan.nextInt();
		System.out.print("+,-,*,/ 입력 :");
		switch(scan.next())
		{case "+":
			System.out.println(num1+"+"+num2+"="+(num1+num2)); // = ("%d+%d=%d\n",num1,num2,num1+num2)
			break;
		case "-":
			System.out.println(num1+"-"+num2+"="+(num1-num2));
			break;
		case "*":
			System.out.println(num1+"*"+num2+"="+(num1*num2));
			break;
		case "/":
			if(num2==0)
				System.out.println("0으로 나눌수 x");
			else
			System.out.println(num1+"/"+num2+"="+(num1/(double)num2)); // 소수점 출력
			break;
		} */
		
		
	/*	int a=0; //누적변수
		for(int i=2;i<=100;i+=2) 
			a+=i;
		System.out.println("100 까지의 합"+a); */
		
		
		
	/*	for(int i=5;i<=50;i+=5) 
			System.out.println(i+" ");*/
		
		
	/*	for(char c='B';c<='N';c+=2)
			System.out.print(c+" "); */
		
		
	/*	Scanner scan=new Scanner(System.in);
	 *  System.out.print("정수입력 :");
	    int sum=0;
		int num=scan.nextInt();
		for(int i=1;i<=num;i++)
			{
			sum+=i;
			}
			System.out.println("1~10까지의 합:"+sum); */
		
		
		
	/*	for(int i=1;i<=30;i++)
		{ 	if(i%2==0)
			{
			System.out.printf("%2d\t",i);
			if(i%3==0) // 3개를 출력하고 다음줄에 출력한다
			System.out.println();
		} 
		} */
		
		
		
	/*  int sum=0;
	   for(int i=1;i<=10;i++)
		{
		if(i%2==0)
			sum-=i;
		else
			sum+=i;		
	} 
	  System.out.println("sum="+sum); */
		

	/*	for(int i=1;i<=10;i++)
			{
			if(i%3!=0)
			System.out.print(i+" ");
			} */
		
/* for : 반복횟수가 지정된 경우 주로 사용
 *  초기식 : 시작점 : 한번만 수행
 *  조건식 : 끝점 : true > 반복문 수행 / false > for 종료
 *  증감식 : 횟수지정		
 */
		
	}

}

