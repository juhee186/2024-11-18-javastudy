import java.text.ChoiceFormat;
import java.util.Scanner;
import java.util.*;
public class 메소드_문제풀이 {
	static void print1()                          //1
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i);
		}
	}
	
	static int print2()                           //2
	{ 	int sum=0;
		for(int i=1;i<=10;i++)
			{sum+=i;}
		return sum;
	}
	
	static int print3(int n)                       //3
	{ 	int sum=0;
		for(int i=1;i<=n;i++)
			{sum+=i;}	
		return sum; 
	}
	
	static String print4(int a, int b)            //4
	{	if(b==0)
		return "0으로 나눌 수 없다."; //b가 0이면 종료하라
		return String.valueOf(a/(double)b); 
		// 리턴은 메소드안에서 여러개 사용할 수 있다
	}
	static void change(String s)                    //5
	{
		s=s.toUpperCase();
		System.out.println(s);
	}
	static String change2(String s)                //5 리턴형
	{
		return s.toUpperCase();
	}
	static String print6(String s)                     //6
	{
		if(s.length()%2!=0)
			return"문자열 갯수가 짝수여야 합니다.";
		String res="";
		boolean bCheck=true;
		for(int i=0;i<s.length()/2;i++)
		{
			char ss=s.charAt(i);
			char ee=s.charAt(s.length()-1-i);
			if(ss!=ee)
			{
				bCheck=false;
				break;
			}
		}
		if(bCheck==true)
		{
			res="좌우대칭이다";
		}
		else
			res="좌우대칭이 아니다";
		return res;
	}
	
	static void print7(String s)                              //7
	{	
		//System.out.println(new StringBuilder(s).print7());
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}
	static void print8(int a)                                 //8
	{ 
		char c='A';
		switch(a/10)
		{
		case 10: case9:
			c='A';
			break;
		case 8:
			c='B';
			break;
		case 7:
			c='C';
			break;
		case 6:
			c='D';
			break;
		default:
			c='f';
		}
		System.out.println(c);
	}
	static void print8_1(int kor) 								//8_1
	{
		double[]limit= {50,60,70,80,90};
		String[]grade= {"F","D","C","B","A"};
		ChoiceFormat cf=new ChoiceFormat(limit,grade);
		System.out.println(cf.format(kor));
	}
	
	
	//주소값이 전송되면 해당주소에 값을 채운다
	//얕은 복사
	//int[] arr=new int[3];
	//int[] arr2=arr;
	//>> 메모리 주소가 같은 경우 같은 메모리를 제어
	static int[] display()
	{
		int[] arr= {10,20,30};
		return arr;
	}
	// 콜바이레퍼런스 => 메모리 주소 전송=>
	static void display2(int[] arr)
	{
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
	}
	// 매개변수 전송 => 값만 전송(복사본) => call by value
	//				------기본형,String(일반 기본형취급)
	// 매개변수 전송 => 메모리 주소값 전송 (원본) => call by reference
	//				----------배열/클래스
	// 매개변수 명 => 별칭 => 얕은 복사
	static void input(int[] kor,int[]eng, int[]math)
	{
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<kor.length;i++)
		{
			System.out.print((i+1)+"'학생 국어 점수입력:");
			kor[i]=scan.nextInt();
			System.out.print((i+1)+"'학생 영어 점수입력:");
			eng[i]=scan.nextInt();
			System.out.print((i+1)+"'학생 수학 점수입력:");
			math[i]=scan.nextInt();
		}
	}
	static int sum(int kor,int eng, int math)
	{
		return kor+eng+math;
	}
	static double avgs(int total)
	{
		return total/3.0;
	}
	
	static void print12()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("입력 : ");
		int nn=scan.nextInt();
		if(nn%3==0)
			System.out.print(nn+"은 3의 배수");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String ss=print6("ABBA");
	//	System.out.println(ss);
	//	print8(80);
	//	print8_1(70);
	//String d=print4(10,0);
	//System.out.println(d);
		
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		char[] score=new char[3];
		double[] avg=new double[3];
		int[] rank=new int[3];
		
		input(kor,eng,math); // 같은 메모리 주소
		for(int i=0;i<total.length;i++)
		{
			total[i]=sum(kor[i],eng[i],math[i]); // 다른주소 이용
		}
		for(int i=0;i<avg.length;i++)
		{
			avg[i]=avgs(total[i]);
		}
//		Scanner scan=new Scanner(System.in);
//		
//		for(int i=0;i<kor.length;i++)
//		{
//			System.out.print((i+1)+"'학생 국어 점수입력:");
//			kor[i]=scan.nextInt();
//			System.out.print((i+1)+"'학생 영어 점수입력:");
//			eng[i]=scan.nextInt();
//			System.out.print((i+1)+"'학생 수학 점수입력:");
//			math[i]=scan.nextInt();
//			
//			total[i]=kor[i]+eng[i]+math[i];
//			avg[i]=total[i]/3.0;
//			
//		}
		for(int i=0;i<kor.length;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7.2f%-5d\n",kor[i],eng[i],math[i],avg[i],total[i]);
		}
		
		
		int []arr=display();
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
			
		int[] arr1=new int[3];
		display2(arr1);
		for(int i=0; i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		int[]arr3= {10,20,30};
		int[]a=arr3; // 별칭  ==>arr3대신 a라는 이름으로 사용하겠다
		a[0]=1000;
		a[1]=2000;
		a[2]=3000;
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3);
		System.out.println(a);
		
		
		
		
		
		
		
		
	}	
}
