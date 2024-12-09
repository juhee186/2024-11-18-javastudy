// 사칙연산자  => 메소드 4개 + - * /
// 회원가입 - 회원탈퇴 > 가입후 바로 탈퇴  : 메소드 1개에 기능 2개를 담을 수 없다 
import java.util.Scanner;
public class 메소드_2 {
	//1) 리턴형 / 매개변수 있을 때
	//+
	static int plus(int a,int b)
	{
		int c=a+b;
		return c;
	}
	// -
	static int min(int a, int b)
	{
		int c=a-b;
		return c;
	}
	// *
	static int gop(int a, int b)
	{
		int c=a*b;
		return c;
	}
	// /
	static String div(int a, int b)
	{
		String re="";
		if(b==0)
			re="0으로 나눌 수 없다";
		else
			re=String.valueOf(a/(double)b);
				//String으로 변환
		
		return re; //리턴형에서 선언된 데이터형과 일치
	}
	// 조립 >> 다른 클래스에서 사용 가능
	static void process()
	{
		//main
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1=scan.nextInt();
		
		System.out.print("첫번째 정수 입력 : ");
		int num2=scan.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/) : ");
		String op=scan.next();
		
		if(op.equals("+"))
		{	
			int c=plus(num1,num2);
			System.out.println(num1+"+"+num2+"="+c);
		}
		else if(op.equals("-"))
		{	
			int c=min(num1,num2);
			System.out.println(num1+"-"+num2+"="+c);
		}
		else if(op.equals("*"))
		{	
			int c=gop(num1,num2);
			System.out.println(num1+"*"+num2+"="+c);
		}
		else if(op.equals("/"))
		{	
			String c=div(num1,num2);
			System.out.println(num1+"/"+num2+"="+c);
		}
		else
		{
			System.out.println("사용할 수 없는 연산자입니다.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();
	}

}
