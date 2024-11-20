/*
 * 국어, 영어, 수학점수 입력 > 평균, 총점
 * 
 */

import java.util.Scanner;
public class 연산자_이항연산자_산술_활용 {
// 변수 > 반드시 초기화(값을 저자) >사용
	// 1. 임의로 저장
	// int a=100;
	// 2. 사용자로부터 입력값을 받아서 처리
	// scanner
	// 3. 컴퓨터가 임의로 설정 > 난수 (랜덤)
	public static void main(String[] args) {
		Object system;
		// TODO Auto-generated method stub
		//scanner 클래스를 메모리에 저장
		Scanner scan=new Scanner(System.in);
		//입력값을 받아 변수저장
		System.out.print("국어 영어 수학점수 입력(90 90 90):");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		
		System.out.println("=====결과값=====");
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		
		System.out.println("총점:"+(kor+eng+math));
		System.out.printf("평균:%.2f",(kor+eng+math));
		
		
				
			
	}

}
