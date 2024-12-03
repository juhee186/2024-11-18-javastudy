// 컴퓨터 수 맞추기
import java.util.Scanner;
public class 반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*100)+1;
		//1~100 정수
		Scanner scan=new Scanner(System.in);
		while(true) // 무한루프 >> 종료시점 지정
		{
			System.out.print("1~100 정수입력 :");
			int user=scan.nextInt();
			if(user<1 || user>100)
			{
				System.out.println("잘못된 입력");
				continue; // 처음화면으로 돌아가라 System.out.print("1~100 정수입력 :"); 로 이동
			}
			
			 if(com>user)
			 {
				 System.out.println("입력한 수보다 큰 수 입력해");
			 }
			 else if(com<user)
			 {
				 System.out.println("입력한 수보다 작은 수 입력해");
			 }
			 else
			 {
				 System.out.println("정답");
				 break;
			 }
			 
		}

		
		
		
		
		
		
	}

}
