/*
 *  버블정렬
 *  	=> 인접한 데이터끼리 비교
 *  	=> 선택정렬 >> 앞에서부터 고정
 *  	=> 버블정렬 >> 뒤에서부터 고정
 *  
 *  	방식
 *  	  20 30 40 50 10
 *  	  -- --
 *  	  30 20
 *  	     -- --
 *  		 40 20
 *  			-- --
 *  			50 20 
 *  			   -- --
 *  			   20 10 => 고정
 *   	-------------------------->>1
 *   	  30 40 50 20 10
 *   	  -- --
 *   	  40 30
 *   		 -- --
 *   		 50 30
 *   		    -- --
 *   			30 20
 *   	---------------------------->>2
 *   	  40 50 30 20 10
 *   	  -- --
 *   	  50 40
 *   		 -- --
 *   		 40 30
 *   	---------------------------->>3
 *   	  50 40 30 20 10    	
 *   	  -- --
 *   	---------------------------->>4
 */
import java.util.*;
public class 배열응용_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[5];
		{
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=(int)(Math.random()*100)+1;
			}
			System.out.println("정렬 전 : ");
			for(int i:arr)
			{
				System.out.print(i+" ");
			}
			System.out.println("\n정렬 후 : ");
			
			for(int i=0;i<arr.length-1;i++)
			{
				for(int j=0;j<arr.length-1-i;j++)
				{
					if(arr[j]<arr[j+1]) //인접비교 > 버블정렬
					{
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
				System.out.println((i+1)+"round:"+Arrays.toString(arr));
			}
			System.out.println("최종 : ");
			for(int i:arr)
			{
				System.out.print(i+" ");
			}
		}
		
		
		
		
		

	}

}
