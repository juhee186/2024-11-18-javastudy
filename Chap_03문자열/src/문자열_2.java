// format()  >> 출력형식  => sysout.printf()
//import java.util.Scanner;

public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		double avg=0.0;
		/*
		 *  변수 선언
		 *  초기화
		 *  int=0
		 *  double=0.0
		 *  char='/0'
		 *  long=0L
		 *  float=0.0f
		 *  string=null  >> 메소드 주소가 없는 상태
		 *  	   ---- 모든 클래스가 메모리 할당이 안된 상태
		 *  1. 변수설정   >>> 변경되는 값 확인
		 *  2. 제어문 처리 >>> 어떤 제어문 사용여부
		 *  3. 연산처리 >>> 사용자 요청 연산 여부
		 *  --------------- 웹 / 모바일 / 앱
		 *  4. 결과값 출력 >>> 화면 출력
		 *     --------브라우저 / 모바일 형식다름
		 */
		for(int i=1;i<=9;i++)
		{
			int num=(int)(Math.random()*10)+1;
			System.out.print(num+" ");
			sum+=num;
		}
		
		avg=sum/9.0;
		String msg=String.format("평균: %.2f", avg); //출력형식
		// %d : 정수 ,%f : 실수 ,%c : 문자 ,%s : 문자열
		// 날짜 변환, 학점
		System.out.println(msg);
		
		
		
		
		

	}

}
