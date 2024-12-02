import java.util.Arrays;
import java.util.Scanner;
public class 배열_문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*1.	int[]kor=new int[5];
		int[]rank=new int[5];
		for(int i=0;i<kor.length;i++)
		{
			kor[i]=(int)(Math.random()*101);
		}
		System.out.println(Arrays.toString(kor));
		
		for(int i=0;i<kor.length;i++)
		{
			rank[i]=1;
			for(int j=0;j<kor.length;j++)
			{
				if(kor[i]<kor[j])
				{
					rank[i]++;
				}
			}
		}
		System.out.println(Arrays.toString(rank)); */
		
		
/*2.	int []aa=new int[10];
		int max=0;
		int min=100;
		for(int i=0;i<aa.length;i++)
		{
			aa[i]=(int)(Math.random()*100)+1;
		} 
		System.out.println(Arrays.toString(aa));
		for(int i:aa)
		{
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min); */
		
		
/*3.	int []aa=new int[100];
		for(int i=0;i<100;i++)
		{
			int num=(int)(Math.random()*10)+1;
			System.out.print(num+" ");
			aa[num]++; 
		}
		System.out.println();
		for(int i=0;i<10;i++)
		{
			System.out.println("aa["+i+"]="+aa[i]);
		} 
		  */
		
/*4.	int []aa=new int[10];
		for(int i=0;i<aa.length;i++)
		{
			aa[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(aa));
		System.out.println(aa[1]); */
		
/*5.	int []aa=new int[10];
		for(int i=0;i<aa.length;i++)
		{
			aa[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(aa));
		System.out.println(aa[1]); 
		System.out.println(aa[aa.length-1]); */
		
/*6.	int []aa=new int[10];
		int sum=0;
		double avg=0;
		for(int i=0;i<aa.length;i++)
		{
			aa[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(aa));
		for(int i:aa)
		{
			sum+=i;
		}
		avg=sum/10.0;
				System.out.println("합:"+sum);
				System.out.println("평균:"+avg); */
		
/*7.	int []aa=new int[10];
		for(int i=0;i<aa.length;i++)
		{
			aa[i]=(int)(Math.random()*100)+1;
		}	
		System.out.println(Arrays.toString(aa));	
		System.out.println(aa[3]); */
		
/*8.	int []aa=new int[5];
		for(int i=0;i<aa.length;i++)
		{
			aa[i]=(int)(Math.random()*100)+1;
		}	
		System.out.println(Arrays.toString(aa)); */
		
		
/*11		int []aa=new int[10];
		for(int i=0;i<aa.length;i++)
		{
			aa[i]=(int)(Math.random()*100)+1;
		} 
		System.out.println(Arrays.toString(aa));
		for(int i:aa)
		{
			if(i%3==0)
				System.out.println(i);
			
		} */

		
	}

}
