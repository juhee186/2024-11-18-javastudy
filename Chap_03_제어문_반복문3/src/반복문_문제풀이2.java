import java.util.Scanner;

public class 반복문_문제풀이2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	/*	System.out.print("단 입력(1~9):");
		int dan=scan.nextInt();
		int i=1;
		while(i<=9) 
		{
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		} */
	/*	int dan=scan.nextInt();
		for(int i=1;i<=9;i++)
		{
			System.out.println(dan+"*"+i+"="+dan*i);
		} */
		
/*		int i=1;
		while(i<=100)
		{
			if(i%8==0)
				System.out.print(" "+i);
			i++;
		} 
		System.out.println();*/
		
	/*	int i=1;
		while(i<=100)
		{
			if(i%4==0 || i%7==0)
			 System.out.print(i+" ");
			i++;
		} */
		
		
		
	/*  int i=1;
		while(i<=100)
		{
			if(i%10==3 || i%10==6 ||i%10==9)
			 System.out.print(i+" ");
			i++;
		}  */
	
	
	/*	Scanner scan=new Scanner(System.in);
		System.out.print("문자열:");
		String user=scan.next();
		int a=0,e=0,i=0,o=0,u=0;
		int z=0;
		while(z<user.length()) 
		{
			char c=user.charAt(z);
			if(c=='a')
			{
				a++;
			}
			if(c=='e')
			{
				e++;
			}
			if(c=='i')
			{
				i++;
			}
			if(c=='o')
			{
				o++;
			}
			if(c=='u')
			{
				u++;
			}
			
				z++;
				
		} 
		System.out.println("a :"+a);
		System.out.println("e :"+e);
		System.out.println("i :"+i);
		System.out.println("o :"+o);
		System.out.println("u :"+u); */
		
		
	/*	System.out.print("정수: ");
		int num=scan.nextInt();
		int i=10;
		while(i<=99)
		{
			int a=i/10; // 앞자리
			int b=i%10; // 뒷자리
			if(a+b==num)
				System.out.println(i+" ");
			i++;
		} */
		
	/*	int z=10;
		while(z<=20)
		{
			System.out.print(" "+z);
			z++;
		} */
		
/*		int z=20;
		while(z>=10)
		{
			System.out.print(" "+z);
			z--;
		}  */
		
	//이미지를 거꾸로 출력하는 프로그램 > 이미지는 byte[]
	/*	System.out.print("문자입력:");
		String ss=scan.nextLine();
		int i=ss.length()-1;
		while(i>=0)
		{
			System.out.print(ss.charAt(i));
			i--;
		} */
	/*	System.out.print(":");
		int i=1;
		int max=0;
		while(i<=5)
		{
			int num=(int)(Math.random()*100)+1;
			System.out.print(num+" ");
			if(max<num)
				max=num;
			i++;
		}
		System.out.println("최대:"+max);*/
	
	/*	int i=1;
		int sum=0;
		String strmax="";
		int max=0;
		while(i<=3)
		{
			System.out.print("문자열 입력: ");
			String str=scan.nextLine();
			sum+=str.length();
			if(max<str.length())
			{
				strmax=str;
			}
			i++;
		}
		System.out.println("문자길이 :"+sum);
		System.out.println("긴 문자열 : "+strmax); */
		
		
		
		
	}

}
