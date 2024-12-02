// 10개의 정수를 임의로 추출(1~100) => 최대값, 최소값 / 최대값위치,최소값 위치
import java.util.Arrays;
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[]arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		} // 초기화된 데이터 10 개 출력
		System.out.println(Arrays.toString(arr));
		 // 요청값(최대값 최소값)
		int max=arr[0];
		int min=arr[0];
		// 저장된 데이터중 한 개 대입
		for(int i:arr) //실제 저장된 데이터를 가지고 온다
		{
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
		//최대값 최소값 인덱스
		int in=0;
		int in2=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]==max)
				in=j;	
			if(arr[j]==min)
				in2=j;
		}
		System.out.println("최대값의 위치는"+in);
		System.out.println("최소값의 위치는"+in2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
