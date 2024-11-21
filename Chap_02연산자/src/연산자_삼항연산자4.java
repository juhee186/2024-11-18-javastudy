import java.util.Scanner;
/*
 *  (조건)?"값1":"값2"
 *  (조건)?1:2
 *  (조건)?'A':'B'
 *  
 *   > 진화 >>제어문
 */
public class 연산자_삼항연산자4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*3);
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0),바위(1),보(2):");
		int user=scan.nextInt();
		System.out.println("===결과===");
		System.out.print("컴퓨터:");
		System.out.print(com==0?"가위":"");
		System.out.print(com==1?"바위":"");
		System.out.print(com==2?"보":"");
		System.out.println(); // 다음줄  출력
		System.out.print("사용자:");
		System.out.print(user==0?"가위":"");
		System.out.print(user==1?"바위":"");
		System.out.print(user==2?"보":"");
		System.out.println();
		System.out.println("결과...");
		int res=com-user;
		System.out.println(res==1 || res==-2?"컴퓨터 윈":"");
		System.out.println(res==-1 || res==2?"사용자 윈":"");
		System.out.println(res==0?"비겼다":"");
		
		/*
		 *  com (0) > 가위
		 *     user > 가위 (0
		 *          > 바위 (1
		 *          > 보 (2
		 *  
		 *  com (1) > 바위
		 *     user > 가위 (0
		 *          > 바위 (1
		 *          > 보 (2
		 *  
		 *  com (2) > 보
		 *     user > 가위 (0
		 *          > 바위 (1
		 *          > 보 (2        
		 *          
		 */
		
		
	}

}
