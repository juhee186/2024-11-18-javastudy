// 변수 > 배열
// 연산처리/제어문 > 사용자요청 > 메소드
// -----------------------------클래스 구성요성
// 객체지향언어 > 자바시작 (5장)
// 사용자 정의 데이터형
// 정수입력받아 2진법 출력  10 ==> 0000 0000 0000 1010
// 16비트이용=>2바이트->32767
import java.util.Scanner;;
public class 배열_생성_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final int index=16;(1)
		Scanner scan=new Scanner(System.in);
		System.out.print("0~32767 정수입력: ");
		int num=scan.nextInt();
		//System.out.println(Integer.toBinaryString(num));
		
		//저장공간 0,1=>16개
		//int []bi=new int[Index];(1)
		int []bi=new int[16];
		//저장시 앞으로 할것이냐, 뒤부터 시작할것이냐
		//앞 index=0 , 뒤에서 index=15
		//인덱스=0 ==> 0부터 출력 => 선입선출=> queue
		//인덱스=15 ==> 15부터 출력 => 후입선출 => stack
		int index=15; // 저장위치
		
		//요청처리 => 제어문/연산자
		while(true)
		{
			bi[index]=num%2;
			num/=2;
			
			if(num==0)
			break;
			
			index--;
		}
		//출력
		//for(int i=0;i<bi.index;i++)(1)
		for(int i=0;i<bi.length;i++)
			
		{			//	|
			// 		배열의 갯수
			if(i!=0 && i%4==0)
				System.out.print(" ");
			System.out.print(bi[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
