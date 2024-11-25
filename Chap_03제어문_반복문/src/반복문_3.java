// 사용자로부터 값을 받아 구구단을 출력
/*
 *  >> 사용자 5입력
 *  5*1
 *  5*2
 *  ...
 *  5*9
 *  
 *  1 2 3 4 5 ...
 *  ========== 1씩 증가
 * 
 *  1 1 2 3 5 7 8 10 12 13 19 ...
 *  ======= 패턴이 없어 FOR문 사용 불가
 *  
 *  맛집이미지 레시피이미지 상품이미지 
 *  맛집이미지 레시피이미지 상품이미지 
 *  맛집이미지 레시피이미지 상품이미지 
 *  ======== 패턴 있음 (3% 으로 for문 사용 가능)
 *  맛집이미지 상품이미지 레시피이미지 
 *  레시피이미지 상품이미지 맛집이미지
 *  상품이미지 레시피이미지 맛집이미지
 *  ======== 패턴 없음 (for문 사용 불가능)
 *  
 *  
 *  >>>>>>  for 일정 패턴을 가지고 있어야 출력 가능
 *  
 *  
 */
import java.util.Scanner;
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("단 입력(1~9):");
		int dan=scan.nextInt();
		System.out.println("=====요청결과값=====");
		for(int i=1;i<=9;i++)
		{
			System.out.println(dan+"*"+i+"="+dan*i);
		}

	}

}
