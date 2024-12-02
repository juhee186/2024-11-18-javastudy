// 달력
/*
 *  1. 사용자 정의
 *  	=> 달력 : 1일자의 요일 확인
 *  				  --------
 *  	=> 1년도 1월1일 => 월요일
 *  	1) 1/1/1 ~ 2023/12/31 >총 날수
 *  	2) 23/11/30 => 총 날수 계산
 *  	3)----------------------- +1
 *  	1)+2)+3) /7 ==> 요일을 구한다
 *  	0~6 => 0일 => 6=>토
 *  	=> 예약 / 일정관리
 *  2. 라이브러리 이용 calendar
 */
import java.util.Scanner;
public class 배열응용_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력받기 > year / month / day => 요일
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year=scan.nextInt();
		
		System.out.print("월 입력 : ");
		int mon=scan.nextInt();
		
		System.out.print("일 입력 : ");
		int day=scan.nextInt();
		
		
		
		
		
		
		

	}

}
