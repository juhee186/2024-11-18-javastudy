// 사용자로부터 값을 받아서 > 합격 >=60
import java.util.Scanner;

public class 연산자_삼항연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("0~100사이의 점수:");
		int score=scan.nextInt();
		System.out.println(score>=60?"합격":"불합격");
		
		
		
			}

}
