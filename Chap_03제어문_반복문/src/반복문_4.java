// 1~100 까지 합을 구해라  > (67페이지)
public class 반복문_4 {
	// 짝수합, 홀수합, 총합
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int sum=0; //누적변수 > 초기값은 0 / 누적곱 > 초기값1
		for(int i=1;i<=100;i++)
		{
			sum+=i; //sum=sum+i
			System.out.println("sum="+sum+",i="+i);
		}
		System.out.println("1~100 까지의 총합"+sum);
		*/
		
		int sum=0, even=0, odd=0; 
		for(int i=1;i<=100;i++)
		{
			
			if(i%2==0)
				even+=i; 
				
			/*else(i%2!=0) //odd+=i
			{
				odd+=i; 
			}
		}*/
				System.out.println("1~100 까지의 짝수합"+even);
		      //  System.out.println("1~100 까지의 홀수합"+odd);
		}
		
		

	
}
}
