import java.util.Scanner;
public class 반복문_문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//1	x<=10 && x>=20
				
	//2   ch=' ' || ch=='\t'
		
	//3  ch== 'X' || ch =='x'
		
	//4	ch=='0' && ch=='9'
		
	/*5 2차 for = 중첩 for = 이중 for	 
	 * for(int i=1;i<=6;i++)  >> 줄수
		{
			for(int j=1;j<=6;j++) >> 실제반복수행문장
			{ 
				if(i+j==6)
				{
					System.out.printf("[%d,%d]\n",i,j);
				}
						
		    }
			System.out.println(); */
		
		
		
	//	Scanner scan=new Scanner(System.in);
	//	System.out.println("1 정수 입력: ");
	//	int sta=scan.nextInt();
	/*	System.out.print("2 정수 입력 : ");
		int end=scan.nextInt();
		int gop=0;
		for(int i=sta;i<=end;i++)
		{
			gop*=i;
		}
		*/
	/*	int end=0;
		while(true)
		{
			System.out.println("2 정수 입력: ");
			end=scan.nextInt();
			if(sta<end)
				break;
		}
		int gop=0;
		for(int i=sta;i<=end;i++)
		{
			gop*=i;
		}
		System.out.println(sta+"~"+end+"까지의 곱="+gop);   */
		
		
/*7		int a=0;
		for(int i=5;i<=16;i++)
		{
			a+=i;
		}
		 System.out.println("합:"+a); */
		
/*	8	int aa=0;
		for(int i=3;i<=4462;i++)
		{
			if(i%2==0)
				aa+=i;
		}
		System.out.println("짝수의 합: "+aa); */
		
    /* 9 int aa=0,bb=0;
		 for(int i=1;i<=12;i++)
		 {
				if(i%2==0)
					aa+=i;
				if(i%3==0)
				{	bb+=i;
				}
				
		 }
		 System.out.println();
		 System.out.println("2의 배수의 합: "+aa);
		 System.out.println("3의 배수의 합: "+bb); */
		
		
	/*10 int a4=0;
		 for(int i=1;i<=100;i++)
		{
			if(i%4==0)
			a4+=i;
		}
		
		System.out.println("1~100 까지의 4의 배수의 합: "+a4); */
		
		/*11
		 int dd=0;
		 for(int i=1;i<=10;i++)
		 {
			 int num=(int)(Math.random()*100)+1;
				System.out.print(num+" ");
				if(num%2==0)
					dd++;
		 }
		 System.out.println();
		 System.out.println("짝수 개수: "+dd); */
		
		
		
		
   /*12 int a3=0, a5=0;
		for(int i=1;i<=10;i++)
		{
			int num=(int)(Math.random()*100)+1;
			System.out.print(num+" ");
			if(num%3==0)
			a3++;
			if(num%5==0)
			a5++;
		}
		System.out.println();
		System.out.println("3의 배수 개수: "+a3);
		System.out.println("5의 배수 개수: "+a5); */
		
		
		
		
	/*13	
			for(int i=1;i<=5;i++)
		    {
			for(int a=1;a<=10;a++)
			{
				System.out.print("*");
			}
			System.out.println();
		    } */
		
		
	/*14	int k=1;
	    for(int i=1;i<=5;i++)
		{ for(int a=1;a<=5;a++)
		   {
		   System.out.print(k);
		   }
		k++;
		System.out.println();
		}  */
	
		
	/*16  for(int i=1;i<=5;i++)
		 {
			for(int a=1;a<=5;a++)
			   {
			   if(i!=a)
				   System.out.print("#");
			   else
				   System.out.print(a);
		       }
			System.out.println(); }  */
		
	
	/*17	 for(int i=1;i<=5;i++)
		{   char c='A'; 
			for(int a=1;a<=5;a++)
			{
				System.out.print(c++);
			}
			System.out.println();}  */
		
		
		/*18	char c='A';
		for(int i=1;i<=5;i++)
		{ for(int a=1;a<=5;a++)
		   {
		   System.out.print(c);
		   }
		c++;  
		System.out.println();
		} */
	
		
		/*
		 * ★☆☆☆★
		 * ☆★☆★☆
		 * ☆☆★☆☆
		 * ☆★☆★☆
		 * ★☆☆☆★
		 */
		
		for(int i=1;i<=5;i++)
	    {
		for(int a=1;a<=5;a++)
		{
			if((i==1 && a==1)|| (i==5 && a==1)
				|| (i==1 && a==5)|| (i==5 && a==5))
			System.out.print("★");
			else
				System.out.print("☆");
		} 
		System.out.println();
		
	    }
		
		
		}	


}