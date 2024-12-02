/*
 *  정렬
 *  = 선택정렬 / 버블정렬
 *  = ASC / DESC
 *     |      |
 *   올림차순  내림차순(**) > 최신순
 *   
 *   86~96페이지 => 1차원배열
 *   알고리즘 => 정렬 알고리즘 => 108페이지
 *   
 *   선택정렬 : 한 개의 데이터를 선택 후 기준점으로 변경
 *   
 *   10 30 50 20 40 => 10 20 30 40 50, 50 40 30 20 10
 *   				   --------------- --------------
 *   					올림차순			내림차순
 *   내림차순
 *   10  30  50  20  40
 *   --  --
 *   30  10
 *   --		 --
 *   50		 30
 *   --			 --
 *   50			 20
 *   -- 			 --
 *	 50				 40
 *-------------------------1 => for문 한 번 수행
 *   50	 10  30  20  40   
 *   --  --  --
 *   고정 30	 10
 *   	 --      --
 *   	 30      20
 *   	 --			 --
 *   	 40			 30
 *-------------------------2 =>	for문 2 번 수행	
 *   50	 40  10  20  30   
 *   --  --  --	 --
 *   고정 고정	 20  10
 *   	     --		 --
 *   		 30		 20
 * ------------------------3
 *   50	 40  30  10  20 
 *   --  --  --	 --  --
 *   고정 고정	 고정 20  10
 * ------------------------4
 *   50	 40	 30	 20	 10
 *   i		j
 *   1		4
 *   2		3
 *   3		2
 *   4		1  => i+j=5   j=5-i
 *   						-
 *   						arr.length-i
 *   
 *   	     
 *   	 
 *   
 */
public class 배열응용_4 {
	static void sort(int[]arr)
	{
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		System.out.println("정렬 전 : ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("정렬 후 : ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		
		
		
		
		
		
		

	}

}
