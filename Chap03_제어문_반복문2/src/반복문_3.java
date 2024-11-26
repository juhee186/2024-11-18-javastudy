/*
 *  ABCD
 *  EFGH
 *  IJKL
 *  
 *   ABCD
 *   ABCD
 *   ABCD
 *   ABCD
 *   
 *   AAAA
 *   BBBB
 *   CCCC
 *   DDDD
 *   
 *   #123
 *   1#23
 *   12#3
 *   123#
 *   
 *   => 정렬 , 빈도수구하기 => 알고리즘
 *   
 *   ★
 *   ★★
 *   ★★★
 *   ★★★★
 *   
 *   i     j
 *   줄수   별    => i=j   =>j=i
 *   1     1
 *   2     2
 *   3     3
 *   4     4
 *   
 *   > 주사위 2개를 던져서 6이 나올 경우의수
 *   
 *      *
 *     **
 *    ***
 *   ****
 *   줄수     공백    별표
 *    1      3      1
 *    2      2      2
 *    3      1      3
 *    4      0      4
 *   
 *   ****
 *    ***
 *     **
 *      *
 *   
 */
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	char c='A';
		for(int i=1;i<=4;i++)
		{
			for(int a=1;a<=4;a++)
				{
				System.out.print(c++);
				}
				System.out.println(); 
		}*/
		
		
	
		/* for(int i=1;i<=4;i++)
		{   char c='A';  //변수위치에 따라 결과값이 달라진다
			for(int a=1;a<=4;a++)
			{
				System.out.print(c++);
			}
			System.out.println();
		} */
		
		 /*char c='A';
		for(int i=1;i<=4;i++)
		{ for(int a=1;a<=4;a++)
		   {
		   System.out.print(c);
		   }
		c++;  // 증감위치 주의
		System.out.println();
		} */

		/* for(int i=1;i<=4;i++)
		 {
			for(int a=1;a<=4;a++)
			   {
			   if(i==a)
				   System.out.print("#");
			   else
				   System.out.print(a);
		       }
			System.out.println();
		}  */
		
		/* for(int i=1;i<=4;i++)
		 {
			for(int j=1;j<=i;j++)
			{
				System.out.print("★");
		    }
			System.out.println();
		  } */
		
		// 반대로
		/*for(int i=1;i<=4;i++)
		 {
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("★");
		    }
			System.out.println();
		 }*/
		
	/*	for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{ 
				if(i+j==6)
				{
					//System.out.println("["+i+","+j+"]");
					System.out.printf("[%d,%d]\n",i,j);
				}
						
		    }
			System.out.println();
		}*/
		
		
	/*	for(int i=1;i<=4;i++)
		 {
			for(int j=1;j<=4-i;j++) // 공백출력
			{
				System.out.print(" ");
		    }
			for(int k=1;k<=i;k++) {// 별표
			{
				System.out.print("*");
			}
				System.out.println();
		  }  */
		
		
	/*	for(int i=1;i<=4;i++)
		 {
			for(int j=1;j<=i-1;j++) // 공백출력
			{
				System.out.print(" ");
		    }
			for(int k=1;k<=5-i;k++) {// 별표
			{
				System.out.print("*");
			}
				System.out.println();
		    } */
	
			
		
		
		
		
		
		
		
		
		
		
	}
}

