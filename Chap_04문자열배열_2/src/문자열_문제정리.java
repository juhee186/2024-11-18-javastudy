
/*
 *  배열 => 같은 데이터를 묶어서 관리( 변수 여러개 제어하기 쉽게 한개의 이름이용)
 *  연속적인 메모리 배치
 *  구분자 => 인덱스 (0부터 순차적으로) => 반복문 사용(중복제거)
 *  
 *  몇 개 저장 => 데이터형
 *  --------------------선언
 *  = 초기화
 *  = 요청된 데이터 구하기
 *  = 결과값 출력
 */
import java.util.*;
public class 문자열_문제정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*1		int []sco= {100,90,85};
		for(int i=0;i<sco.length;i++)
		{
			System.out.println((i+1)+"번 학생:"+sco[i]+"점");
		}
		int sum=0;
		for(int i:sco)
		{
			sum+=i;
		} 
		System.out.println("총점:"+sum); */
		

/*2		int[] aa= {50,45,35,12,70};
		int sum=0;
  		for(int i=0;i<aa.length;i++)
		{
			System.out.println("사원("+(i+1)+")"+aa[i]);
			sum+=aa[i];
		}
  		System.out.println("총점: "+sum);
		System.out.println("평균: "+sum/5.0);
		int max=aa[0];
		int min=aa[0];
		int maxi=0;
		int mini=0;
		for(int i=0;i<aa.length;i++)
		{
			if(max<aa[i])
				{max=aa[i];
				maxi=i;}
			if(min>aa[i])
				{min=aa[i];
				mini=i;
				}
		}
		System.out.println("실적 가장 큰 실적: "+max+" 사원:"+(maxi+1));
		System.out.println("실적 가장 작은 실적: "+min+" 사원:"+(mini+1)); */
		
/*3		int[]arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i;
		}
		for(int i:arr)
		{
			System.out.println(i);
		} */
		
/*4		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int i:arr)
		{
			sum+=i;
		}
		System.out.println("sum="+sum);  */
		
/*5		int []arr=new int[10];
		int evenTotal=0;
		int oddTotal=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
			for(int i:arr)
			{
				if(i%2==0)
					evenTotal+=i;
				else
					oddTotal+=i;
			}
			System.out.println("짝수의 합 : "+evenTotal);
			System.out.println("홀수의 합 : "+oddTotal); */
			
		
/*6		int []aa=new int[100];
		for(int i=0;i<aa.length;i++)
		{
			aa[i]=(int)(Math.random()*10);
		}	
		System.out.println(Arrays.toString(aa));
		int[]re=new int[10];
		for(int i=0;i<aa.length;i++)
		{
			re[aa[i]]++;
		}
		for(int i=0;i<re.length;i++)
		{
			System.out.println(i+"의 갯수: "+re[i]);
		} */
		
		
	char []arr=new char[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)((Math.random()*26)+65);
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("정렬 후 : ");
		System.out.println(Arrays.toString(arr));
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			System.out.print(arr[i]+" ");
//		}
//		
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("정렬 후 : ");
		System.out.println(Arrays.toString(arr));
			
		}
		
		
	}

