import java.util.Scanner;
import java.util.Arrays;
//국어점수 입력 => 5개 / rank 5개
public class 배열_생성_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]kor=new int[5];
		int[]rank=new int[5];
		//인덱스 번호로 정보를 매칭한다
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
		System.out.println(Arrays.toString(rank));
	}

}
