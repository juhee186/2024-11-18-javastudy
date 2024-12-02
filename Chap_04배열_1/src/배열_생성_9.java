// 1~10까지 난수 발생 > 배열[10] > 중복없이 저장
import java.util.*;
public class 배열_생성_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//저장공간
		int []aa=new int[100];
		//초기화=>중복
		for(int i=0;i<aa.length;i++)
		{	//난수발생
			aa[i]=(int)(Math.random()*100)+1; //재실행
			for(int j=0;j<i;j++) 
			{
				if(aa[i]==aa[j])
				{
					i--;  //> 중복시 다시 난수 발생해라
					break;
				}
			}			
		}
		
		System.out.println(Arrays.toString(aa));
		
		
		

	}

}
