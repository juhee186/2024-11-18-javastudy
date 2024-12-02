/*
 *  3명의 학생
 *  	 국어 영어 수학 입력 > 총점,평균,학점,등수
 */
import java.util.Scanner;
public class 배열응용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]kor=new int[3];
		int[]eng=new int[3];
		int[]math=new int[3];
		
		int[]tot=new int[3];
		double[]avg=new double[3];
		char[]sco=new char[3];
		int[] rank=new int[3];
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<kor.length;i++)
		{
			System.out.print((i+1)+"'국어입력: ");
			kor[i]=scan.nextInt();
			
			System.out.print((i+1)+"'영어입력: ");
			eng[i]=scan.nextInt();
			
			System.out.print((i+1)+"'수학입력: ");
			math[i]=scan.nextInt();
			
			tot[i]=kor[i]+eng[i]+math[i];
			
			avg[i]=tot[i]/3.0;
		}
		
		for(int i=0;i<kor.length;i++)
		{
			switch((int)(avg[i]/10))
			{
			case 10: case 9:
				sco[i]='A';
				break;
			case 8: 
				sco[i]='B';
				break;	
			case 7: 
				sco[i]='C';
				break;
			case 6: 
				sco[i]='D';
				break;	
				default:
					sco[i]='F';
			}
		}
		
		for(int i=0;i<kor.length;i++)
		{
			rank[i]=1;
			for(int j=0;j<kor.length;j++)
			{
				if(tot[i]<tot[j])
				{
					rank[i]++;
				}
			}
		}
		
		
		
		
		
		for(int i=0;i<kor.length;i++)
		{ 	// 출력서식을 만드는 메소드 %5d  +일때 앞 -일때 뒤를 
			// jdk 1.5이상에서만 사용 가능
			// 씨언어와 동일하게
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c%-5d\n",kor[i],eng[i],math[i],tot[i],avg[i],sco[i],rank[i]);
		}
		
		
		
		
	
		
		
		
		
		

	}

}
