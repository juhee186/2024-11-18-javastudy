// 무한루프
/*
 *  컴퓨터 > 난수 1~100 사이 숫자 추출
 *  => 맞추는 게임 > 힌트 : up / down
 *  난수 > 58
 *  사용자입력 > 50   :힌트 ; up
 */
import java.util.Scanner;
// 반복문 >> if문
public class 반복문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 임의 숫자 추출
		int com=(int)(Math.random()*100)+1;
		Scanner scan=new Scanner(System.in);
		for(;;) // for 문 무한루프  > while
		{
		 System.out.print("1~100 사이 정수 입력:");
		 int user=scan.nextInt();
		 
		 //힌트
		 if(com>user)
		 { 
			 System.out.println("up");
		 }
		 else if(com<user)
		 {
			 System.out.println("down");
		 }
		 else
		 {
			 System.out.println("정답");
			 System.exit(0);
			 // 무한루프는 반드시 종료조건을 첨부 :  System.exit(0);
		 }
		}

		
		
	}

}
