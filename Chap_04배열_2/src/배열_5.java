// 6개의 난수 발생 => 중복이 없는 데이터 출력(1~45 사이)

public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[6];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++)
			{
				if(arr[j]==arr[i])
				{
					i--;
					break;
				}
			}
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		
		
		
		
		
		
		

	}

}
