// 3명 학생점수 (국어,영어,수학) > 평균,총점,학점
import java.util.Scanner;
public class 반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int i=1;
		while(i<=3)
		{
			System.out.print(i+" 번째 국어점수 :");
			int kor=scan.nextInt();
			
			System.out.print(i+" 번째 영어점수 :");
			int eng=scan.nextInt();
					
			System.out.print(i+" 번째 수학점수 :");
			int math=scan.nextInt();
						
			int tot=kor+eng+math;
			double avg=tot/3.0;
					
			char sco='A';
			switch(tot/30)
				{
					case 10: case 9:
						sco='A';
						break;
					case 8:
						sco='B';
						break;
					case 7:
						sco='C';
						break;
					case 6:
						sco='D';
						break;
						default:
							sco='F';
				}
				System.out.println("국어점수:"+kor);
				System.out.println("영어점수:"+eng);
				System.out.println("수학점수:"+math);
				System.out.println("총점:"+tot);
				System.out.printf("평균:%.2f\n",avg);
				System.out.println("학점:"+sco);
				i++;
		}
			
		
		
		
		
		

	}

}
